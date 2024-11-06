package com.wade.tournament.tournament_system;

import com.wade.tournament.tournament_system.config.SomeProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
@EnableConfigurationProperties(SomeProperties.class)
public class TournamentSystemApplication {

    private static final Logger logger = LoggerFactory.getLogger(TournamentSystemApplication.class);

    public static void main(String[] args) {
        logger.debug("Starting Tournament System Application...");

        SpringApplication.run(TournamentSystemApplication.class, args);

        logger.debug("Tournament System Application started successfully.");
    }
}
