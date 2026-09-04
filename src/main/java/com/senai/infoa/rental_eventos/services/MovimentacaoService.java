package com.senai.infoa.rental_eventos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infoa.rental_eventos.models.Movimentacao;
import com.senai.infoa.rental_eventos.repositories.MovimentacaoRepository;
@Service
public class MovimentacaoService {

    @Autowired
    private MovimentacaoRepository ur;


     public Movimentacao salvar(Movimentacao movimentacao){
        if(movimentacao != null) {}
        return ur.save(movimentacao);
    }

}
