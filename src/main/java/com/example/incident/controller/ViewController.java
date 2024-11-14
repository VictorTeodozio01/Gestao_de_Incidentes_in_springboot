package com.example.incident.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/list-incidents")
    public String listIncidents() {
        return "list-incidents";
    }

    @GetMapping("/add-incident")
    public String addIncident() {
        return "add-incident";
    }

    @GetMapping("/list-latest-incidents")
    public String listLatestIncidents() {
        return "list-latest-incidents";
    }
}
