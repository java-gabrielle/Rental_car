package com.senai.infoa.rental_eventos.models;

import java.security.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="movimentacao")
public class Movimentacao {


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="data_movimento")
    private Timestamp data_movimento;

    @Column(name="tipo_movimentacao")
    private String tipo_movimentacao;

    @Column(name="quantidade")
    private String quantidade;

    @ManyToOne
    @JoinColumn(name="usuario_id")
    private Usuario usuario;

    

    public Movimentacao(){
    }



    public Movimentacao(Integer id, Timestamp data_movimento, String tipo_movimentacao, String quantidade,
          Usuario usuario) {
        this.id = id;
        this.data_movimento = data_movimento;
        this.tipo_movimentacao = tipo_movimentacao;
        this.quantidade = quantidade;
        this.usuario = usuario;
    }



    public Integer getId() {
        return id;
    }



    public void setId(Integer id) {
        this.id = id;
    }



    public Timestamp getData_movimento() {
        return data_movimento;
    }



    public void setData_movimento(Timestamp data_movimento) {
        this.data_movimento = data_movimento;
    }



    public String getTipo_movimentacao() {
        return tipo_movimentacao;
    }



    public void setTipo_movimentacao(String tipo_movimentacao) {
        this.tipo_movimentacao = tipo_movimentacao;
    }



    public String getQuantidade() {
        return quantidade;
    }



    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }



    public Usuario getUsuario() {
        return usuario;
    }



    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    






    
}
