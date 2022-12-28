/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.portfolio.controller;

import com.proyecto.portfolio.entity.Experiencia;
import com.proyecto.portfolio.service.ExperienciaService;
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
@RequestMapping("experiencia")
@CrossOrigin(origins = "http://localhost:4200")
public class ExperienciaController {
    
    @Autowired 
    ExperienciaService expeServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List <Experiencia> verExperiencias() {
        return expeServ.verExperiencia();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Experiencia verExperiencia(@PathVariable int id) {
        return expeServ.buscarExperiencia(id);
    } 
    
    @PostMapping("/crear")
    public void agregarExperiencia(@RequestBody Experiencia expe) {
        expeServ.crearExperiencia(expe);
    }
    
    @DeleteMapping("/borrar/{id}")
    public void eliminarExperiencia(@PathVariable int id) {
        expeServ.borrarExperiencia(id);
    }
    
    @PutMapping("editar")
    public void updateExperiencia(@RequestBody Experiencia expe) {
        expeServ.editarExperiencia(expe);
    }
    
}
