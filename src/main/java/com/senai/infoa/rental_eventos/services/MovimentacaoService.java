package com.senai.infoa.rental_eventos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infoa.rental_eventos.models.Movimentacao;
import com.senai.infoa.rental_eventos.repositories.MovimentacaoRepository;
@Service
public class MovimentacaoService {

    @Autowired
    private MovimentacaoRepository movimentacaoRepository;

     public List<Movimentacao> listarTodos(){ 
        return movimentacaoRepository.findAll();

    }
        public Movimentacao buscarPorId(Integer id) {
             return movimentacaoRepository.findById(id).orElse(null);
        } 
        
        public Movimentacao salvar(Movimentacao movimentacao) {
             return movimentacaoRepository.save(movimentacao);
        } 
        
        public void excluir(Integer id) {
             movimentacaoRepository.deleteById(id);
        }    
}
