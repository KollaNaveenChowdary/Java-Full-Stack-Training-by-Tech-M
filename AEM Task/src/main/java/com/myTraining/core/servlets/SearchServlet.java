package com.myTraining.core.servlets;

import com.day.cq.search.Query;
import com.day.cq.search.QueryBuilder;
import com.day.cq.search.PredicateGroup;
import com.day.cq.search.result.Hit;
import com.day.cq.search.result.SearchResult;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.apache.sling.api.resource.ResourceResolver;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.propertytypes.ServiceDescription;
import org.osgi.service.component.propertytypes.ServiceRanking;
import org.osgi.service.component.propertytypes.ServiceVendor;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.jcr.Session;
import javax.jcr.RepositoryException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.apache.sling.servlets.annotations.SlingServletPaths;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

@Component(service = { Servlet.class })
@SlingServletPaths("/bin/searchcontent") // Register servlet using a path
@ServiceDescription("Servlet to search AEM content using Query Builder")
@ServiceVendor("MyTraining")
@ServiceRanking(1001)
public class SearchServlet extends SlingSafeMethodsServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
            throws ServletException, IOException {

        // Get search keyword from request
        String searchKeyword = request.getParameter("keyword");
        if (searchKeyword == null || searchKeyword.trim().isEmpty()) {
            response.setStatus(SlingHttpServletResponse.SC_BAD_REQUEST);
            response.getWriter().write("{\"error\": \"Keyword is required\"}");
            return;
        }

        ResourceResolver resourceResolver = request.getResourceResolver();
        QueryBuilder queryBuilder = resourceResolver.adaptTo(QueryBuilder.class);

        if (queryBuilder != null) {
            Session session = resourceResolver.adaptTo(Session.class);
            
            if (session == null) {
                response.setStatus(SlingHttpServletResponse.SC_INTERNAL_SERVER_ERROR);
                response.getWriter().write("{\"error\": \"Could not retrieve JCR session\"}");
                return;
            }

            try {
                // Build query using PredicateGroup
                Map<String, String> queryMap = new HashMap<>();
                queryMap.put("path", "/content/myTraining"); // Root path for search
                queryMap.put("type", "cq:Page"); // Only search pages
                queryMap.put("fulltext", searchKeyword); // Search keyword
                queryMap.put("p.limit", "10"); // Limit results to 10 pages

                // Execute query
                Query query = queryBuilder.createQuery(PredicateGroup.create(queryMap), session);
                SearchResult result = query.getResult();

                // Process results
                JsonArray jsonArray = new JsonArray();
                for (Hit hit : result.getHits()) {
                    JsonObject jsonObject = new JsonObject();
                    jsonObject.addProperty("path", hit.getPath());
                    jsonArray.add(jsonObject);
                }

                // Return search results as JSON
                JsonObject jsonResponse = new JsonObject();
                jsonResponse.add("results", jsonArray);
                response.setContentType("application/json");
                response.getWriter().write(jsonResponse.toString());

            } catch (RepositoryException e) {
                response.setStatus(SlingHttpServletResponse.SC_INTERNAL_SERVER_ERROR);
                response.getWriter().write("{\"error\": \"RepositoryException: " + e.getMessage() + "\"}");
            } catch (Exception e) {
                response.setStatus(SlingHttpServletResponse.SC_INTERNAL_SERVER_ERROR);
                response.getWriter().write("{\"error\": \"" + e.getMessage() + "\"}");
            }
        } else {
            response.setStatus(SlingHttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            response.getWriter().write("{\"error\": \"QueryBuilder could not be initialized\"}");
        }
    }
}
