package com.lukanka.usuarios.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lukanka.usuarios.models.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer> {

}
