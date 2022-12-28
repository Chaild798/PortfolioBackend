/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyecto.portfolio.service;

import com.proyecto.portfolio.entity.Persona;
import com.proyecto.portfolio.repository.PersonaRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author marti
 */
@Service
@Transactional//ni idea, pero me dijeron que lo ponga
public class PersonaService {
    
    @Autowired//esta "cableado" al repositorio de Persona, tiene lo mismo
    public PersonaRepository persoRepo;//declaro una variable persoRepo, alias, que voy a utilizar para mis metodos
    
    //basicamente declaro los metodos a utilizar, los findAll(), save() y tal, salen del JPA del entity
    
    public List<Persona> verPersonas() {
        List<Persona> ListaPersonas=persoRepo.findAll();
        return ListaPersonas;
    }
    
    public void crearPersona(Persona perso) {
        persoRepo.save(perso);
    }
    
    public void borrarPersona(int id) {
        persoRepo.deleteById(id);
    }
    
    public Persona buscarPersona(int id) {
        Persona perso = persoRepo.findById(id).orElse(null);
        return perso;
    }
    
    public void editarPersona(Persona perso) {
        persoRepo.save(perso);
    }
    
    public Persona loginPersona(String correo, String clave) {
        List <Persona> personas = persoRepo.findByCorreoAndContrasena(correo, clave);
        
        if (!personas.isEmpty()) {
            return personas.get(0);
        }
        return null;
    
    }
    
}
