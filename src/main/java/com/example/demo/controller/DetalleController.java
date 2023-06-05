package com.example.demo.controller;

import com.example.demo.model.Detalle;
import com.example.demo.service.DetalleService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/detalle")
@AllArgsConstructor
public class DetalleController {


    private final DetalleService detalleService;


    @PostMapping("/guardar")
   private ResponseEntity<Void> guardarDetalle(@RequestBody Detalle detalle){
        detalleService.createDetalle(detalle);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

   /* @DeleteMapping("/eliminar/{id}")
    private ResponseEntity<Void> eliminarDetalle(@PathVariable long id){
        detalleService.deleteDetalle(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
   */
}
