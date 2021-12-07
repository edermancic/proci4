package com.stock.backend.servicios;

import java.util.ArrayList;

import com.stock.backend.modelos.productosM;
import com.stock.backend.repositorios.productoRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class productoServ {
    @Autowired
    productoRepo repo;

    public productosM guardaProduc(productosM productos){
        return repo.save(productos);
    }

    public ArrayList<productosM> mostrartx(){
        return (ArrayList<productosM>)repo.findAll();
    }

    public boolean deleteproduc(String id){
        if(repo.existsById(id)){
            repo.deleteById(id);
            return true;
        }
            else{
                return false;
            }

    }
    public ArrayList<productosM> obtenernom(String nombreproduc){
        return repo.findByNombreproduc(nombreproduc);
    }
    public productosM obtenerprove(String nombreprovedor){
        return repo.findByNombreprovedor(nombreprovedor);
    }

}
