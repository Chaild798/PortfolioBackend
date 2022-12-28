/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.portfolio.controller;

import com.proyecto.portfolio.entity.FrontEnd;
import com.proyecto.portfolio.service.FrontEndService;
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
@RequestMapping("frontend")
@CrossOrigin(origins = "http://localhost:4200")
public class FrontEndController {
    
    @Autowired 
    FrontEndService frontServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List <FrontEnd> verFrontEnd() {
        return frontServ.verFrontEnd();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public FrontEnd verFrontEnd(@PathVariable int id) {
        return frontServ.buscarFrontEnd(id);
    } 
    
    @PostMapping("/crear")
    public void agregarFrontEnd(@RequestBody FrontEnd front) {
        frontServ.crearFrontEnd(front);
    }
    
    @DeleteMapping("/borrar/{id}")
    public void eliminarFrontEnd(@PathVariable int id) {
        frontServ.borrarFrontEnd(id);
    }
    
    @PutMapping("editar")
    public void updateFrontEnd(@RequestBody FrontEnd front) {
        frontServ.editarFrontEnd(front);
    }
    
}
