package com.myTraining.core.jobs;

import org.apache.sling.event.jobs.Job;
import org.apache.sling.event.jobs.consumer.JobConsumer;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(
        service = JobConsumer.class,
        property = {
                JobConsumer.PROPERTY_TOPICS + "=com/myTraining/slingjob"
        }
)
public class HelloWorldJob implements JobConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger("custom.slingjob.logger");

    @Override
    public JobResult process(Job job) {
        LOGGER.info("🚀 Sling Job Executed: Hello, World! 🌍");
        return JobResult.OK;
    }
}
