package com.myTraining.core.listeners;

import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceResolverFactory;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventConstants;
import org.osgi.service.event.EventHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

@Component(
        service = EventHandler.class,
        immediate = true,
        property = {
                EventConstants.EVENT_TOPIC + "=org/apache/sling/api/resource/ResourceAdded",
                EventConstants.EVENT_TOPIC + "=org/apache/sling/api/resource/ResourceChanged",
                EventConstants.EVENT_TOPIC + "=org/apache/sling/api/resource/ResourceRemoved"
        }
)
public class PageEventHandler implements EventHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(PageEventHandler.class);

    @Reference
    private ResourceResolverFactory resourceResolverFactory;

    @Override
    public void handleEvent(Event event) {
        try (ResourceResolver resourceResolver = resourceResolverFactory.getServiceResourceResolver(null)) {
            String[] eventProperties = event.getPropertyNames();
            LOGGER.info("Received Event: {}", event.getTopic());
            LOGGER.info("Event Properties: {}", Arrays.toString(eventProperties));

            String resourcePath = (String) event.getProperty("path");

            if (resourcePath != null) {
                LOGGER.info("Resource Path: {}", resourcePath);
            } else {
                LOGGER.warn("No resource path found in event properties!");
            }
        } catch (Exception e) {
            LOGGER.error("Error handling event", e);
        }
    }
}
