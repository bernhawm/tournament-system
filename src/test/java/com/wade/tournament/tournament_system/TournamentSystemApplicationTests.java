package com.wade.tournament.tournament_system;

import com.wade.tournament.tournament_system.controller.EventController;  // Make sure this import is correct
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class TournamentSystemApplicationTests {

    @Autowired
    private EventController eventController;  // Inject your controller

    @Test
    void contextLoads() {
        // Test if the controller is correctly loaded into the context
        assertNotNull(eventController);  
    }
}
