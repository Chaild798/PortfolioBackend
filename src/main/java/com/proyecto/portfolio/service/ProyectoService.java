/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.portfolio.service;

import com.proyecto.portfolio.entity.Proyecto;
import com.proyecto.portfolio.repository.ProyectoRepository;
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
public class ProyectoService {
    
    @Autowired
    public ProyectoRepository proyeRepo;
    
    public List<Proyecto> verProyecto() {
        List<Proyecto> ListaProyecto=proyeRepo.findAll();
        return ListaProyecto;
    }
    
    public void crearProyecto(Proyecto proye) {
        proyeRepo.save(proye);
    }
    
    public void borrarProyecto(int id) {
        proyeRepo.deleteById(id);
    }
    
    public Proyecto buscarProyecto(int id) {
        Proyecto proye = proyeRepo.findById(id).orElse(null);
        return proye;
    }
    
    public void editarProyecto(Proyecto proye) {
        proyeRepo.save(proye);
    }
    
}
