package com.lukanka.usuarios.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lukanka.usuarios.models.Usuario;
import com.lukanka.usuarios.services.impl.UsuarioServiceImpl;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioServiceImpl usuarioServiceImpl;

    @GetMapping("")
    public List<Usuario> listarUsuarios() {
        return this.usuarioServiceImpl.listarUsuarios();
    }

    @PostMapping("/crear")
    public Usuario crearUsuario(@RequestBody Usuario usuario) {
        return this.usuarioServiceImpl.crearUsuario(usuario);
    }

    @GetMapping("/{id}")
    public Usuario buscarUsuario(@PathVariable int id) {
        return this.usuarioServiceImpl.buscarUsuario(id);
    }
}
