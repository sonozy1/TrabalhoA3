package com.example.clinic.model;

import jakarta.persistence.*;

@Entity
public class Paciente {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cpf;

    // Getters and Setters
}
