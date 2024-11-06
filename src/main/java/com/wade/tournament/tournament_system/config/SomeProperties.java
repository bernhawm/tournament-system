package com.wade.tournament.tournament_system.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
@ConfigurationProperties(prefix = "some")
public class SomeProperties {

    private static final Logger logger = LoggerFactory.getLogger(SomeProperties.class);

    private boolean booleanProperty;

    public boolean isBooleanProperty() {
        return booleanProperty;
    }

    public void setBooleanProperty(boolean booleanProperty) {
        logger.debug("Setting booleanProperty to: {}", booleanProperty); // Debug log
        this.booleanProperty = booleanProperty;
    }

    // Additional getter and setter
    @Override
    public String toString() {
        return "SomeProperties{" +
                "booleanProperty=" + booleanProperty +
                '}';
    }
}
