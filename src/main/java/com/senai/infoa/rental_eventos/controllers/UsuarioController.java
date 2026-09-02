package com.senai.infoa.rental_eventos.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;


import org.springframework.web.bind.annotation.RequestParam;

import com.senai.infoa.rental_eventos.models.Usuario;
import com.senai.infoa.rental_eventos.services.UsuarioService;

public class UsuarioController {

        @Autowired
    private UsuarioService service;

    @PostMapping("/login")
    public Usuario login(
            @RequestParam String email,
            @RequestParam String senha) {

        return service.login(email, senha);
    }

}
