/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.portfolio.controller;

import com.proyecto.portfolio.entity.Proyecto;
import com.proyecto.portfolio.service.ProyectoService;
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
@RequestMapping("proyecto")
@CrossOrigin(origins = "http://localhost:4200")
public class ProyectoController {
    
    @Autowired 
    ProyectoService proyeServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List <Proyecto> verProyecto() {
        return proyeServ.verProyecto();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public Proyecto verProyecto(@PathVariable int id) {
        return proyeServ.buscarProyecto(id);
    } 
    
    @PostMapping("/crear")
    public void agregarProyecto(@RequestBody Proyecto proye) {
        proyeServ.crearProyecto(proye);
    }
    
    @DeleteMapping("/borrar/{id}")
    public void eliminarProyecto(@PathVariable int id) {
        proyeServ.borrarProyecto(id);
    }
    
    @PutMapping("editar")
    public void updateProyecto(@RequestBody Proyecto proye) {
        proyeServ.editarProyecto(proye);
    }
    
}
