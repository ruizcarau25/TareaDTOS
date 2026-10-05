package com.example.Tarea2DTOS.alumno;

public record AlumnoDTO(
        String nombre,
        String apellidos,
        String email,
        Curso curso,
        Direccion direccion
) {

    public static AlumnoDTO of(Alumno a){
        return new AlumnoDTO(
               a.getNombre(),
               a.getApellido1(),
               a.getEmail(),
               a.getCurso(),
               a.getDireccion()
        );
    }

}
