package com.casabella.api.controllers;

import com.casabella.api.models.Event;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EventController {
    @GetMapping("/events")
    public List<Event> getAllEvents() {
        return List.of(new Event(1, "Hamza"), new Event(2, "Amine"));
    }
}
