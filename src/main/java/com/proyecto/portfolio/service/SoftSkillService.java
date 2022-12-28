/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.portfolio.service;

import com.proyecto.portfolio.entity.SoftSkill;
import com.proyecto.portfolio.repository.SoftSkillRepository;
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
public class SoftSkillService {
    
    @Autowired
    public SoftSkillRepository softRepo;
    
    public List<SoftSkill> verSoftSkill() {
        List<SoftSkill> ListaSoftSkill=softRepo.findAll();
        return ListaSoftSkill;
    }
    
    public void crearSoftSkill(SoftSkill soft) {
        softRepo.save(soft);
    }
    
    public void borrarSoftSkill(int id) {
        softRepo.deleteById(id);
    }
    
    public SoftSkill buscarSoftSkill(int id) {
        SoftSkill soft = softRepo.findById(id).orElse(null);
        return soft;
    }
    
    public void editarSoftSkill(SoftSkill soft) {
        softRepo.save(soft);
    }
    
}
