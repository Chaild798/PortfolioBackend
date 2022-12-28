/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.portfolio.service;

import com.proyecto.portfolio.entity.Experiencia;
import com.proyecto.portfolio.repository.ExperienciaRepository;
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
public class ExperienciaService {
    
    @Autowired
    public ExperienciaRepository expeRepo;
    
    public List<Experiencia> verExperiencia() {
        List<Experiencia> ListaExperiencia=expeRepo.findAll();
        return ListaExperiencia;
    }
    
    public void crearExperiencia(Experiencia expe) {
        expeRepo.save(expe);
    }
    
    public void borrarExperiencia(int id) {
        expeRepo.deleteById(id);
    }
    
    public Experiencia buscarExperiencia(int id) {
        Experiencia expe = expeRepo.findById(id).orElse(null);
        return expe;
    }
    
    public void editarExperiencia(Experiencia expe) {
        expeRepo.save(expe);
    }
}
