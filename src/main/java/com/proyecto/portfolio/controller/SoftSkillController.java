/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.portfolio.controller;

import com.proyecto.portfolio.entity.SoftSkill;
import com.proyecto.portfolio.service.SoftSkillService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author marti
 */
@RestController
@RequestMapping("softskill")
@CrossOrigin(origins = "http://localhost:4200")
public class SoftSkillController {
    
    @Autowired 
    SoftSkillService softServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List <SoftSkill> verSoftSkill() {
        return softServ.verSoftSkill();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public SoftSkill verSoftSkill(@PathVariable int id) {
        return softServ.buscarSoftSkill(id);
    } 
    
    @PostMapping("/crear")
    public void agregarSoftSkill(@RequestBody SoftSkill soft) {
        softServ.crearSoftSkill(soft);
    }
    
    @DeleteMapping("/borrar/{id}")
    public void eliminarSoftSkill(@PathVariable int id) {
        softServ.borrarSoftSkill(id);
    }
    
    @PutMapping("editar")
    public void updateSoftSkill(@RequestBody SoftSkill soft) {
        softServ.editarSoftSkill(soft);
    }
    
}
