package com.stock.backend.servicios;

import java.util.ArrayList;

import com.stock.backend.modelos.usuariosmodelo;
import com.stock.backend.repositorios.usuariorepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class usuariosservicios {
    @Autowired
    usuariorepositorio repo_usu;

    public usuariosmodelo save_usu(usuariosmodelo usuario){
        return repo_usu.save(usuario);
    }

    public ArrayList<usuariosmodelo> motrartx(){
        return (ArrayList<usuariosmodelo>)repo_usu.findAll();
    }
    
}
