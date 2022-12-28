/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.portfolio.service;

import com.proyecto.portfolio.entity.BackEnd;
import com.proyecto.portfolio.repository.BackEndRepository;
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
public class BackEndService {
    
    @Autowired
    public BackEndRepository backRepo;
    
    public List<BackEnd> verBackEnd() {
        List<BackEnd> ListaBackEnd=backRepo.findAll();
        return ListaBackEnd;
    }
    
    public void crearBackEnd(BackEnd back) {
        backRepo.save(back);
    }
    
    public void borrarBackEnd(int id) {
        backRepo.deleteById(id);
    }
    
    public BackEnd buscarBackEnd(int id) {
        BackEnd back = backRepo.findById(id).orElse(null);
        return back;
    }
    
    public void editarBackEnd(BackEnd back) {
        backRepo.save(back);
    }
    
}
