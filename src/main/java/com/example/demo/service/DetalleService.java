package com.example.demo.service;


import com.example.demo.model.Detalle;
import com.example.demo.repository.DetalleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DetalleService {

    private final DetalleRepository detalleRepository;

    public Detalle createDetalle(Detalle detalle){
        return detalleRepository.save(detalle);
    }

    public void deleteDetalle(Long id){
        detalleRepository.deleteById(id);
    }
}
