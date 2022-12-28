/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.portfolio.controller;

import com.proyecto.portfolio.entity.Educacion;
import com.proyecto.portfolio.service.EducacionService;
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
@RequestMapping("educacion")
@CrossOrigin(origins = "http://localhost:4200")
public class EducacionController {
    
    @Autowired 
    EducacionService educaServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List <Educacion> verEducaciones() {
        return educaServ.verEducacion();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Educacion verEducacion(@PathVariable int id) {
        return educaServ.buscarEducacion(id);
    } 
    
    @PostMapping("/crear")
    public void agregarEducacion(@RequestBody Educacion educa) {
        educaServ.crearEducacion(educa);
    }
    
    @DeleteMapping("/borrar/{id}")
    public void eliminarEducacion(@PathVariable int id) {
        educaServ.borrarEducacion(id);
    }
    
    @PutMapping("editar")
    public void updateEducacion(@RequestBody Educacion educa) {
        educaServ.editarEducacion(educa);
    }
    
}
