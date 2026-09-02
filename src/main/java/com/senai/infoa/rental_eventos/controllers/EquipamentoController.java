package com.senai.infoa.rental_eventos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import com.senai.infoa.rental_eventos.models.Equipamento;
import com.senai.infoa.rental_eventos.services.EquipamentoService;

@RestController
@RequestMapping("/equipamentos")
public class EquipamentoController {

    @Autowired
    private EquipamentoService service;

    @GetMapping
    public List<Equipamento> listar() {
        return service.listarTodos();
    }

    @PostMapping
    public Equipamento salvar(@RequestBody Equipamento equipamento) {
        return service.salvar(equipamento);
    }

    @DeleteMapping
    public void excluir(@PathVariable Integer id) {
        service.excluir(id);
    }
    
}
