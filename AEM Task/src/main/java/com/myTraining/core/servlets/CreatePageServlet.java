package com.myTraining.core.servlets;

import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.PageManager;
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
import java.io.IOException;
import org.apache.sling.servlets.annotations.SlingServletPaths;

@Component(service = { Servlet.class })
@SlingServletPaths("/bin/createpage") // Registering servlet using a path
@ServiceDescription("Servlet to create AEM pages")
@ServiceVendor("MyTraining")
@ServiceRanking(1001)
public class CreatePageServlet extends SlingSafeMethodsServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
            throws ServletException, IOException {
        // Get page name from request
        String pageName = request.getParameter("pageName");
        String pageTitle = request.getParameter("pageTitle");

        if (pageName == null || pageName.isEmpty()) {
            response.setStatus(SlingHttpServletResponse.SC_BAD_REQUEST);
            response.getWriter().write("{\"error\": \"Page name is required\"}");
            return;
        }

        ResourceResolver resourceResolver = request.getResourceResolver();
        PageManager pageManager = resourceResolver.adaptTo(PageManager.class);

        if (pageManager != null) {
            try {
                // Define parent path where page should be created
                String parentPath = "/content/myTraining"; // Change as per your structure

                // Create page
                Page newPage = pageManager.create(parentPath, pageName, "myTraining/components/helloworld", pageTitle, true);

                if (newPage != null) {
                    response.getWriter().write("{\"message\": \"Page created successfully: " + newPage.getPath() + "\"}");
                } else {
                    response.getWriter().write("{\"error\": \"Page creation failed\"}");
                }
            } catch (Exception e) {
                response.getWriter().write("{\"error\": \"" + e.getMessage() + "\"}");
            }
        } else {
            response.getWriter().write("{\"error\": \"PageManager could not be initialized\"}");
        }
    }
}
