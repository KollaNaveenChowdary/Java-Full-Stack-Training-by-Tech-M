package com.myTraining.core.schedulers;

import org.apache.sling.commons.scheduler.ScheduleOptions;
import org.apache.sling.commons.scheduler.Scheduler;
import org.osgi.service.component.annotations.*;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.Designate;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.atomic.AtomicInteger;

@Component(
        service = HelloWorldScheduler.class,
        immediate = true,
        configurationPolicy = ConfigurationPolicy.REQUIRE
)
@Designate(ocd = HelloWorldScheduler.Config.class)
public class HelloWorldScheduler {

    private static final Logger LOGGER = LoggerFactory.getLogger("custom.slingjob.logger");
    private static final AtomicInteger COUNTER = new AtomicInteger(0);

    private Scheduler scheduler;
    private ScheduleOptions scheduleOptions;
    private static final String JOB_NAME = "HelloWorldSchedulerJob";

    @ObjectClassDefinition(name = "Hello World Scheduler Configuration")
    public @interface Config {
        @AttributeDefinition(name = "Cron Expression", description = "Cron Expression to run every 5 minutes")
        String scheduler_expression() default "0 0/5 * * * ?";
    }

    @Activate
    @Modified
    protected void activate(Config config) {
        LOGGER.info("🔄 Hello World Scheduler Activated with Cron Expression: {}", config.scheduler_expression());

        if (scheduler != null) {
            scheduleOptions = scheduler.EXPR(config.scheduler_expression());
            scheduleOptions.name(JOB_NAME);
            scheduleOptions.canRunConcurrently(false);

            Runnable jobRunnable = () -> LOGGER.info("🟡 Yellow World! 🌍 - Scheduler Execution Count: {}", COUNTER.incrementAndGet());

            try {
                scheduler.schedule(jobRunnable, scheduleOptions);
                LOGGER.info("✅ Scheduler successfully registered.");
            } catch (Exception e) {
                LOGGER.error("❌ Failed to schedule HelloWorldSchedulerJob", e);
            }
        } else {
            LOGGER.error("❌ Scheduler service is not available!");
        }
    }

    @Deactivate
    protected void deactivate() {
        if (scheduler != null) {
            scheduler.unschedule(JOB_NAME);
        }
        LOGGER.info("🛑 Hello World Scheduler Deactivated");
    }

    @Reference
    public void bindScheduler(Scheduler scheduler) {
        this.scheduler = scheduler;
    }

    public void unbindScheduler(Scheduler scheduler) {
        this.scheduler = null;
    }
}
