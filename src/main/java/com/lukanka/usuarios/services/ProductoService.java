package com.lukanka.usuarios.services;

import java.util.List;

import com.lukanka.usuarios.models.Producto;

public interface ProductoService {

    public List<Producto> productos();

    public Producto crearProducto(Producto producto);

    public Producto buscarProducto(int id);

}
