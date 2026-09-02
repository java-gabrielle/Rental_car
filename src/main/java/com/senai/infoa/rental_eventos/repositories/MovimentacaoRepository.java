package com.senai.infoa.rental_eventos.repositories;

import org.springframework.stereotype.Repository;

import com.senai.infoa.rental_eventos.models.Movimentacao;

import org.springframework.data.jpa.repository.JpaRepository;



@Repository 
public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer> {

    
}