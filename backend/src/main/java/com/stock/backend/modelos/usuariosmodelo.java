package com.stock.backend.modelos;

import org.springframework.data.annotation.Id;

public class usuariosmodelo {
    @Id
    private String id;
    private String nombre;
    private String email;
    private Long telefono;
    private String nom_negocio;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Long getTelefono() {
        return telefono;
    }
    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }
    public String getNom_negocio() {
        return nom_negocio;
    }
    public void setNom_negocio(String nom_negocio) {
        this.nom_negocio = nom_negocio;
    }
    

    
}
