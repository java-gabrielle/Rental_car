package com.senai.infoa.rental_eventos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infoa.rental_eventos.models.Usuario;
import com.senai.infoa.rental_eventos.repositories.UsuarioRepository;

@Service
public class UsuarioService {


    @Autowired
    private UsuarioRepository usuarioRepository;

     public Usuario login(String email, String senha) {

        Usuario usuario = usuarioRepository.findByEmail(email);


        if (usuario != null && usuario.getSenha().equals(senha)) {
            return usuario;
        }

        return null;
    }


    
}
