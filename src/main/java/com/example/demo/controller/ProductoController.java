package com.example.demo.controller;


import com.example.demo.exception.ProductoInexistente;
import com.example.demo.model.Producto;
import com.example.demo.service.ProductoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")
@AllArgsConstructor
public class ProductoController {


    private ProductoService productoService;

    @PostMapping("/guardar")
    private ResponseEntity<Void> guardarProducto(@RequestBody Producto producto){

        productoService.createProducto(producto);
        return new ResponseEntity<>(HttpStatus.CREATED);

    }

    @DeleteMapping("/eliminar/{id}")
    private ResponseEntity<Void> eliminarProducto(@PathVariable long id){
        productoService.deleteProducto(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/obtener/{id}")
    private ResponseEntity<Producto> obtenerProducto(@PathVariable long id){
        try {
            Producto producto = productoService.getProducto(id);
            return new ResponseEntity<>(producto, HttpStatus.OK);
        }catch(ProductoInexistente e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/lista")
    private ResponseEntity<List<Producto>> obtenerProductos(){
        List<Producto> productos = productoService.getProductos();
        return new ResponseEntity<>(productos, HttpStatus.OK);
    }

    @GetMapping("/modificar/{id}")
    private ResponseEntity<Void> modificarProducto(@PathVariable long  id, @RequestBody Producto producto){
        productoService.modifyProducto(id, producto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
