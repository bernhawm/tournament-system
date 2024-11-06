package com.wade.tournament.tournament_system.repository;
import com.wade.tournament.tournament_system.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
    // Custom query methods, if needed
}
