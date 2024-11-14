package com.example.incident.controller;

import com.example.incident.model.Incident;
import com.example.incident.service.IncidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/incidents")
public class IncidentController {

    @Autowired
    private IncidentService service;

    @PostMapping
    public Incident createIncident(@RequestBody Incident incident) {
        return service.saveIncident(incident);
    }

    @GetMapping
    public List<Incident> getAllIncidents() {
        return service.getAllIncidents();
    }

    @GetMapping("/{id}")
    public Incident getIncidentById(@PathVariable Long id) {
        return service.getIncidentById(id).orElseThrow(() -> new RuntimeException("Incident not found"));
    }

    @GetMapping("/latest")
    public List<Incident> getLast20Incidents() {
        return service.getLast20Incidents();
    }

    @PutMapping("/{id}")
    public Incident updateIncident(@PathVariable Long id, @RequestBody Incident incident) {
        return service.updateIncident(id, incident);
    }

    @DeleteMapping("/{id}")
    public void deleteIncident(@PathVariable Long id) {
        service.deleteIncident(id);
    }
}
