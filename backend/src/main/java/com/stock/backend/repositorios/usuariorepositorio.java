package com.stock.backend.repositorios;

import com.stock.backend.modelos.usuariosmodelo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface usuariorepositorio extends MongoRepository<usuariosmodelo, String>{
    
    
}
