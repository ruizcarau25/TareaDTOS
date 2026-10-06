package com.example.Tarea2DTOS.producto;

import java.util.List;

public record ProductoDTO(
         long id,
         String nombre,
         String descripcion,
         double pvp,
         List<String>imagenes,
         Categoria categoria
) {
    public static ProductoDTO of(Producto p){
        return  new ProductoDTO(
                p.getId(),
                p.getNombre(),
                p.getDescripcion(),
                p.getPvp(),
                p.getImagenes(),
                p.getCategoria()
        );
    }
}
