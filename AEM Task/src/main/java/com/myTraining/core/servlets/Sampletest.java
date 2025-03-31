package com.myTraining.core.servlets;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.propertytypes.ServiceDescription;
import org.osgi.service.component.propertytypes.ServiceRanking;
import org.osgi.service.component.propertytypes.ServiceVendor;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;
import org.apache.sling.servlets.annotations.SlingServletResourceTypes;

@Component(service = { Servlet.class })
@SlingServletResourceTypes(
    resourceTypes = "myTraining/components/helloworld", // Updated resource type
    methods = { "GET", "POST" },
    extensions = "json"
)
@ServiceDescription("Sample Servlet for Helloworld Component")
@ServiceVendor("MyTraining")
@ServiceRanking(1001)
public class Sampletest extends SlingAllMethodsServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json");
        response.getWriter().write("{ \"message\": \"Hello from SampleServlet with Helloworld Component!\" }");
    }

    @Override
    protected void doPost(SlingHttpServletRequest request, SlingHttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json");
        response.getWriter().write("{ \"message\": \"POST request received on Helloworld Component!\" }");
    }
}
