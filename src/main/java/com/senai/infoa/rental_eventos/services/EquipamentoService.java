package com.senai.infoa.rental_eventos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.infoa.rental_eventos.models.Equipamento;
import com.senai.infoa.rental_eventos.repositories.EquipamentoRepository;

@Service 
public class EquipamentoService {

    @Autowired
     private EquipamentoRepository equipamentoRepository;

     public List<Equipamento> listarTodos(){ 
        return equipamentoRepository.findAll();

    }
        public Equipamento buscarPorId(Integer id) {
             return equipamentoRepository.findById(id).orElse(null);
        } 
        
        public Equipamento salvar(Equipamento equipamento) {
             return equipamentoRepository.save(equipamento);
        } 
        
        public void excluir(Integer id) {
             equipamentoRepository.deleteById(id);
        }
    
}
