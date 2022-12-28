/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.proyecto.portfolio.repository;

import com.proyecto.portfolio.entity.Persona;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
//JPA tiene metodos que puedo utilizar, metodos que se heredan a esta interface, es decir,
//no he de escirbirlos ya
import org.springframework.stereotype.Repository;

/**
 *
 * @author marti
 */
@Repository//esto es un repositorio
public interface PersonaRepository extends JpaRepository <Persona, Integer> {
    //Persona lo saco del entity que hice antes y el Integer dle tipo de dato que lleva su id
    //si fuera un Lom pondria eso
    //debo importar el .entity.Persona y .jpa.repository.JpaRepository
    
    
    //si quisiera, aqui podria poner metodos personalizados
    
    //REPOSITORIO ES EL UNICO INTERFACE, EL RESTO SON CLASS
    
    public List<Persona> findByCorreoAndContrasena(String correo, String contrasena);
}
