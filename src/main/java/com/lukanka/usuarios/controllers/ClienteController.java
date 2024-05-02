package com.lukanka.usuarios.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lukanka.usuarios.models.Cliente;
import com.lukanka.usuarios.services.impl.ClienteServiceImpl;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteServiceImpl clienteServiceImpl;

    @GetMapping("")
    public List<Cliente> listarClientes() {
        return this.clienteServiceImpl.listarClientes();
    }

    @PostMapping("/crear")
    public Cliente crearCliente(@RequestBody Cliente cliente) {
        return this.clienteServiceImpl.crearCliente(cliente);
    }
}
