package com.lukanka.usuarios.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lukanka.usuarios.models.Producto;
import com.lukanka.usuarios.services.impl.ProductoServiceImpl;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    private ProductoServiceImpl productoServiceImpl;

    @PostMapping("/crear")
    public Producto crearProducto(@RequestBody Producto producto) {
        return this.productoServiceImpl.crearProducto(producto);
    }

    @GetMapping("")
    public List<Producto> listarProductos() {
        return this.productoServiceImpl.productos();
    }

    @GetMapping("/{id}")
    public Producto buscarProducto(@PathVariable int id) {
        return this.productoServiceImpl.buscarProducto(id);
    }

}
