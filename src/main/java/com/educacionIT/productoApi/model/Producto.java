package com.educacionIT.productoApi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producto {

    private double precio;
    private String nombre;
    private String descripcion;
}
