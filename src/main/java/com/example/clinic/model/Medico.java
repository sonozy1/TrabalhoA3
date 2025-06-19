package com.example.clinic.model;

import jakarta.persistence.*;

@Entity
public class Medico {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String especialidade;

    // Getters and Setters
}
