package com.stock.backend.modelos;

import org.springframework.data.annotation.Id;

public class productosM {
    @Id
    private String id;
    private String nombreproduc;
    private String nombreprovedor;
    private Long optimo;
    private Long actual;
    

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNombreproduc() {
        return nombreproduc;
    }
    public void setNombreproduc(String nombreproduc) {
        this.nombreproduc = nombreproduc;
    }
    public Long getOptimo() {
        return optimo;
    }
    public void setOptimo(Long optimo) {
        this.optimo = optimo;
    }
    public Long getActual() {
        return actual;
    }
    public void setActual(Long actual) {
        this.actual = actual;
    }
    public String getNombreprovedor() {
        return nombreprovedor;
    }
    public void setNombreprovedor(String nombreprovedor) {
        this.nombreprovedor = nombreprovedor;
    }

   
    
    
    
    
}
