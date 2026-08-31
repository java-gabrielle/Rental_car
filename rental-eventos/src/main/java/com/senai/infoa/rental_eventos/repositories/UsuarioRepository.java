package com.senai.infoa.rental_eventos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.infoa.rental_eventos.models.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {

    Usuario findByEmail(String email);
} 

