package com.lukanka.usuarios.services;

import java.util.List;

import com.lukanka.usuarios.models.Cliente;

public interface ClienteService {

    public Cliente crearCliente(Cliente cliente);

    public List<Cliente> listarClientes();
}
