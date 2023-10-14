package com.casabella.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EventController {

    @GetMapping("/events")
    public List<String> getAllEvents() {
        return List.of("Amine", "Hamza", "Oussama", "Ibrahim");
    }
}
