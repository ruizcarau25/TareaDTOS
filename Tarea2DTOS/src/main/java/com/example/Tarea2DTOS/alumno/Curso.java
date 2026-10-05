package com.example.Tarea2DTOS.alumno;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Curso {
    @Id @GeneratedValue
    private Long id;
    private String nombre;
    private String tipo;
    private String tutor;
    private int aula;

}
