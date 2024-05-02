package com.lukanka.usuarios.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lukanka.usuarios.models.Producto;

@Repository
public interface ProductoRepository extends CrudRepository<Producto, Integer> {

}
