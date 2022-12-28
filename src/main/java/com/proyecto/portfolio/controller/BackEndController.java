/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.portfolio.controller;

import com.proyecto.portfolio.entity.BackEnd;
import com.proyecto.portfolio.service.BackEndService;
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
@RequestMapping("backend")
@CrossOrigin(origins = "http://localhost:4200")
public class BackEndController {
    
    @Autowired 
    BackEndService backServ;
    
    @GetMapping("/lista")
    @ResponseBody
    public List <BackEnd> verBackEnds() {
        return backServ.verBackEnd();
    }
    
    @GetMapping("/ver/{id}")
    @ResponseBody
    public BackEnd verBackEnd(@PathVariable int id) {
        return backServ.buscarBackEnd(id);
    } 
    
    @PostMapping("/crear")
    public void agregarBackEnd(@RequestBody BackEnd back) {
        backServ.crearBackEnd(back);
    }
    
    @DeleteMapping("/borrar/{id}")
    public void eliminarBackEnd(@PathVariable int id) {
        backServ.borrarBackEnd(id);
    }
    
    @PutMapping("editar")
    public void updateBackEnd(@RequestBody BackEnd back) {
        backServ.editarBackEnd(back);
    }
    
}
