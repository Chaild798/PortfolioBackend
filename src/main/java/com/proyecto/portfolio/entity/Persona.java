/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.proyecto.portfolio.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

/**
 *
 * @author marti
 */

//debo definir que Persona es una entidad, que la correr el proyecto se cree una tabla Persona
//con estos atributos, se llama anotation, van inmediatamente antes del atributo o la cosa a usar
@Entity
public class Persona {
    @Id//similar hago para el ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) //esto es para los auto_increment
    private int id;
    private String nombre;
    private String titulo;
    private String foto;
    private String banner;
    @Lob //es para poner textos muy largos, mas de 145 caracteres
    @Column(name="acercade", length=512)
    private String acercade;
    private String correo;
    private String contrasena;
    
    public Persona() {
    
    }

    public Persona(int id, String nombre, String titulo, String foto, String banner, String acercade, String correo, String contrasena) {
        this.id = id;
        this.nombre = nombre;
        this.titulo = titulo;
        this.foto = foto;
        this.banner = banner;
        this.acercade=acercade;
        this.correo=correo;
        this.contrasena=contrasena;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getFoto() {
        return foto;
    }

    public String getBanner() {
        return banner;
    }

    public String getAcercade() {
        return acercade;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public void setAcercade(String acercade) {
        this.acercade = acercade;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    
}
