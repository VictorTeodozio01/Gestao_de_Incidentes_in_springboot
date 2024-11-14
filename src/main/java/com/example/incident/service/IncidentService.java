package com.example.incident.service;

import com.example.incident.model.Incident;
import com.example.incident.repository.IncidentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class IncidentService {
    @Autowired
    private IncidentRepository repository;

    public Incident saveIncident(Incident incident) {
        incident.setCreatedAt(LocalDateTime.now());
        return repository.save(incident);
    }

    public List<Incident> getAllIncidents() {
        return repository.findAll();
    }

    public Optional<Incident> getIncidentById(Long id) {
        return repository.findById(id);
    }

    public List<Incident> getLast20Incidents() {
        return repository.findTop20ByOrderByCreatedAtDesc();
    }

    public Incident updateIncident(Long id, Incident updatedIncident) {
        return repository.findById(id).map(incident -> {
            incident.setName(updatedIncident.getName());
            incident.setDescription(updatedIncident.getDescription());
            incident.setUpdatedAt(LocalDateTime.now());
            return repository.save(incident);
        }).orElseThrow(() -> new RuntimeException("Incident not found"));
    }

    public void deleteIncident(Long id) {
        repository.deleteById(id);
    }
}
