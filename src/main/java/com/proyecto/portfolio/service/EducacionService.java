/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.portfolio.service;

import com.proyecto.portfolio.entity.Educacion;
import com.proyecto.portfolio.repository.EducacionRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author marti
 */
@Service
@Transactional
public class EducacionService {
    
    @Autowired
    public EducacionRepository educaRepo;
    
    public List<Educacion> verEducacion() {
        List<Educacion> ListaEducacion=educaRepo.findAll();
        return ListaEducacion;
    }
    
    public void crearEducacion(Educacion educa) {
        educaRepo.save(educa);
    }
    
    public void borrarEducacion(int id) {
        educaRepo.deleteById(id);
    }
    
    public Educacion buscarEducacion(int id) {
        Educacion educa = educaRepo.findById(id).orElse(null);
        return educa;
    }
    
    public void editarEducacion(Educacion educa) {
        educaRepo.save(educa);
    }
}
