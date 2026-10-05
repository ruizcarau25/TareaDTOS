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
public class Alumno {

    @Id @GeneratedValue
    private long id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int telefono;
    private String email;
    private Direccion direccion;
    private Curso curso;

}
