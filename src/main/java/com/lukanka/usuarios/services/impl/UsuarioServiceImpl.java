package com.lukanka.usuarios.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lukanka.usuarios.models.Usuario;
import com.lukanka.usuarios.repositories.UsuarioRepository;
import com.lukanka.usuarios.services.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario crearUsuario(Usuario usuario) {
        return this.usuarioRepository.save(usuario);
    }

    @Override
    public List<Usuario> listarUsuarios() {
        return (List<Usuario>) this.usuarioRepository.findAll();
    }

    @Override
    public Usuario eliminarUsuario(int id) {
        Usuario usuario = this.usuarioRepository.findById(id).get();
        this.usuarioRepository.delete(usuario);
        return usuario;
    }

    @Override
    public Usuario buscarUsuario(int id) {
        return this.usuarioRepository.findById(id).get();
    }

    @Override
    public Usuario actualizarUsuario(Usuario usuario, int id) {
        Usuario usuarioActualizar = this.usuarioRepository.findById(id).get();
        if (usuarioActualizar != null) {
            usuarioActualizar.setNombre(usuario.getNombre());
            usuarioActualizar.setCorreo(usuario.getCorreo());
            usuarioActualizar.setTelefono(usuario.getTelefono());
            this.usuarioRepository.save(usuarioActualizar);
        }
        return usuarioActualizar;
    }

}
