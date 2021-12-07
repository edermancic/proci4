package com.stock.backend.controladores;

import java.util.ArrayList;

import com.stock.backend.modelos.usuariosmodelo;
import com.stock.backend.servicios.usuariosservicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class usuarioscotrolador {
    @Autowired
    usuariosservicios serv;
    @PostMapping
    public usuariosmodelo saveusu(@RequestBody usuariosmodelo usuario){
        return serv.save_usu(usuario);
    }
    @GetMapping()
    public ArrayList<usuariosmodelo>mostartx(){
        return serv.motrartx();
    }
    
}
