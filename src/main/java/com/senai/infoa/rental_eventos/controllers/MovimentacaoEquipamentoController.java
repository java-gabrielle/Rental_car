package com.senai.infoa.rental_eventos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.senai.infoa.rental_eventos.models.Movimentacao;
import com.senai.infoa.rental_eventos.services.MovimentacaoService;

@RestController
@RequestMapping("/movimentacao-equipamento")
public class MovimentacaoEquipamentoController {

    @Autowired
    private MovimentacaoService service;

    @GetMapping
    public List<Movimentacao> listar() {
        return service.listarTodos();
    }

    @PostMapping
    public Movimentacao salvar(@RequestBody Movimentacao movimentacao) {
        return service.salvar(movimentacao);
    }

     @DeleteMapping
    public void excluir(
            @RequestBody Integer id) {
        service.excluir(id);
    }
}
