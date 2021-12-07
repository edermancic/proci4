package com.stock.backend.controladores;

import java.util.ArrayList;

import com.stock.backend.modelos.productosM;
import com.stock.backend.servicios.productoServ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE})
@RequestMapping("/productos")
public class productocontrolador {
    @Autowired
    productoServ serv;

    @PostMapping
    public productosM guardaProduc(@RequestBody productosM productos){
        return serv.guardaProduc(productos);
    }
    @GetMapping
    public ArrayList<productosM> mostrartx(){
        return serv.mostrartx();
    }
    @DeleteMapping(path = "/{id}")
    public boolean deleteproduc(@PathVariable("id") String id){
        return serv.deleteproduc(id);
    }
    @GetMapping(path = "/prod/{nombreproduc}")
    public ArrayList<productosM> obtenernom(@PathVariable("nombreproduc") String nombreproduc){
        return serv.obtenernom(nombreproduc);
    }

    @GetMapping(path = "/prove/{nombreprovedor}")
    public productosM obtenerprove(@PathVariable("nombreprovedor") String nombreprovedor){
        return serv.obtenerprove(nombreprovedor);
    }
}
