package com.wade.tournament.tournament_system.service;
import com.wade.tournament.tournament_system.model.Event;
import com.wade.tournament.tournament_system.repository.EventRepository;
import org.springframework.stereotype.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EventService {

    private final EventRepository eventRepository;

    @Autowired
    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<Event> getAllEvents() {
        return eventRepository.findAll();  // This assumes EventRepository is correctly set up
    }
}
