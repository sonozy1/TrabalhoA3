package com.example.clinic.controller;

import com.example.clinic.model.Paciente;
import com.example.clinic.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository repository;

    @GetMapping
    public List<Paciente> findAll() {
        return repository.findAll();
    }

    @PostMapping
    public Paciente save(@RequestBody Paciente paciente) {
        return repository.save(paciente);
    }

    @GetMapping("/{id}")
    public Paciente findById(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
