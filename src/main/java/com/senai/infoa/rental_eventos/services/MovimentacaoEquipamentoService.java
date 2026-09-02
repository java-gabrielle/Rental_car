package com.senai.infoa.rental_eventos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import com.senai.infoa.rental_eventos.models.MovimentacaoEquipamento;
import com.senai.infoa.rental_eventos.repositories.MovimentacaoEquipamentoRepository;

@Service 
public class MovimentacaoEquipamentoService {


    @Autowired
    private MovimentacaoEquipamentoRepository repository;

    public List<MovimentacaoEquipamento> listar() {
        return repository.findAll();
    }

    public MovimentacaoEquipamento salvar(MovimentacaoEquipamento movimentacaoEquipamento) {
        return repository.save(movimentacaoEquipamento);
    }

    public void excluir(MovimentacaoEquipamento movimentacaoEquipamento) {
        repository.delete(movimentacaoEquipamento);
    }
    
    
}
