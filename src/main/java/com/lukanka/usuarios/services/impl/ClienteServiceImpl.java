package com.lukanka.usuarios.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lukanka.usuarios.models.Cliente;
import com.lukanka.usuarios.repositories.ClienteRepository;
import com.lukanka.usuarios.services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente crearCliente(Cliente cliente) {
        return this.clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> listarClientes() {
        return (List<Cliente>) this.clienteRepository.findAll();
    }

}
