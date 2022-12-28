/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.portfolio.controller;

import com.proyecto.portfolio.entity.Persona;
import com.proyecto.portfolio.service.PersonaService;
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
@RestController//le digo que es un controller
@RequestMapping("persona")//es la rutilla de persona, con el puerto localhost:8080/persona
@CrossOrigin(origins = "http://localhost:4200")//es conlo que se va a cruzar, con angular, que esta en el 4200
public class PersonaController {
    
    @Autowired //lo cableo con el servicio asociado
    PersonaService persoServ;
    
    @GetMapping("/lista")// va a tener localhost:8080/persona/lista
    @ResponseBody//le digo que ese persona/lista me de el cuerpo
    public List <Persona> verPersonas() {
        return persoServ.verPersonas();
    }
    
    @GetMapping("/ver/{id}")//el id esta con {} porque no es fijo, es dinamico
    @ResponseBody
    public Persona verPersona(@PathVariable int id) {
        return persoServ.buscarPersona(id);
    } 
    
    @PostMapping("/crear")//voy a mandar daos, por eso es post
    public void agregarPersona(@RequestBody Persona pers) {
        persoServ.crearPersona(pers);
    }
    
    @DeleteMapping("/borrar/{id}")
    public void eliminarPersona(@PathVariable int id) {
        persoServ.borrarPersona(id);
    }//el PathVariable toma la info de la ruta en {id}
    
    @PutMapping("editar")//si se creara una localhost:8080/persona
    public void updatePersona(@RequestBody Persona pers) {
        persoServ.editarPersona(pers);//estoy llamando a lo que decalre en PersonaService, persoServ es su alias
    }
    
    @PostMapping("/autenticacion")
    public Persona loginPersona(@RequestBody Persona pers) {
        return persoServ.loginPersona(pers.getCorreo(), pers.getContrasena());
    }
    
    
}
