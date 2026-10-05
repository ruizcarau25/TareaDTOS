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
public class Direccion {

    @Id @GeneratedValue
    private Long id;
    private String tipoVia;
    private String linea1;
    private String linea2;
    private int cp;
    private long poblacion;
    private String provincia;

}
