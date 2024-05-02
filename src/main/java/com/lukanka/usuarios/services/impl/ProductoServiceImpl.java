package com.lukanka.usuarios.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lukanka.usuarios.models.Producto;
import com.lukanka.usuarios.repositories.ProductoRepository;
import com.lukanka.usuarios.services.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<Producto> productos() {
        return (List<Producto>) this.productoRepository.findAll();
    }

    @Override
    public Producto crearProducto(Producto producto) {
        return this.productoRepository.save(producto);
    }

    @Override
    public Producto buscarProducto(int id) {
        return this.productoRepository.findById(id).get();
    }

}
