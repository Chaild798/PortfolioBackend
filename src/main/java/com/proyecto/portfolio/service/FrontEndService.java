/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.portfolio.service;

import com.proyecto.portfolio.entity.FrontEnd;
import com.proyecto.portfolio.repository.FrontEndRepository;
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
public class FrontEndService {
    
    @Autowired
    public FrontEndRepository frontRepo;
    
    public List<FrontEnd> verFrontEnd() {
        List<FrontEnd> ListaFrontEnd=frontRepo.findAll();
        return ListaFrontEnd;
    }
    
    public void crearFrontEnd(FrontEnd front) {
        frontRepo.save(front);
    }
    
    public void borrarFrontEnd(int id) {
        frontRepo.deleteById(id);
    }
    
    public FrontEnd buscarFrontEnd(int id) {
        FrontEnd front = frontRepo.findById(id).orElse(null);
        return front;
    }
    
    public void editarFrontEnd(FrontEnd front) {
        frontRepo.save(front);
    }
    
}
