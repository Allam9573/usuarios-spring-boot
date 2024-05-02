package com.lukanka.usuarios.services;

import java.util.List;

import com.lukanka.usuarios.models.Usuario;

public interface UsuarioService {

    public Usuario crearUsuario(Usuario usuario);

    public List<Usuario> listarUsuarios();

    public Usuario eliminarUsuario(int id);

    public Usuario buscarUsuario(int id);

    public Usuario actualizarUsuario(Usuario usuario, int id);

}
