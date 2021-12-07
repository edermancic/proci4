package com.stock.backend.repositorios;



import java.util.ArrayList;

import com.stock.backend.modelos.productosM;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productoRepo extends MongoRepository<productosM, String>{
   
   ArrayList<productosM> findByNombreproduc(String nombreproduc);
   productosM findByNombreprovedor(String nombreprovedor);
}