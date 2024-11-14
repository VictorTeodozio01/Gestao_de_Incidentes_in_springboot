package com.example.incident.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PageController {
    @GetMapping("/edit-incident/{id}")
    public String editIncidentPage(@PathVariable Long id, Model model) {
        model.addAttribute("incidentId", id); 
        return "edit-incident"; 
    }
}
