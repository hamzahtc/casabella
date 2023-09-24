package com.casabella.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    @GetMapping("/events")
    public String getAllEvents() {
        return "Casa Bella";
    }
}
