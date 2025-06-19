package com.example.clinic.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Consulta {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime data;

    @ManyToOne
    private Paciente paciente;

    @ManyToOne
    private Medico medico;

    // Getters and Setters
}
