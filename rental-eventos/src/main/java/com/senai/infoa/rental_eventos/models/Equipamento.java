package com.senai.infoa.rental_eventos.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name= "Equipamento")
public class Equipamento {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name= "marca")
    private String marca;

    @Column(name= "modelo")
    private String modelo;

    @Column(name= "Quantidade_disponivel")
    private int Quantidade_disponivel;

    @Column(name= "categoria")
    private String categoria;

    @Column(name= "potencia")
    private  String potencia;

    @Column(name= "material")
    private  String material;

    @Column(name="peso_decimal")
    private  String peso_decimal;

    @Column(name="dimensao")
    private  String dimensao;

    @Column(name="cor")
    private  String cor;

 public  Equipamento(){

    }

  public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getmarca() {
        return marca;
    }

    public void setmarca(String marca) {
        this.marca = marca;
    }


   // public String getQuantidade_disponivel() {
    //  return quantidade_disponivel;
    //}

    public void setQuantidade_disponivel(String Quantidade_disponivel) {
      //  this.Quantidade_disponivel = Quantidade_disponivel;
    //}

    //public String getSenha() {
      //  return modelo;
    //}

       public String getpotencia() {
        return potencia;
    }

    public void setptencia(String potencia) {
        this.potencia = potencia;
    }


       public String getcategoria() {
        return categoria;
    }

    public void setcategoria(String categoria) {
        this.categoria = categoria;
    }

      public String getmaterial() {
        return material;
    }

    public void setmaterial(String material) {
        this.material = material;
    }

    public String getpeso_decimal() {
        return peso_decimal;
    }
    public void setpeso_decimal(String peso_decimal) {
        this.peso_decimal = peso_decimal;
    }

     public String getdimensao() {
        return dimensao;
    }
    public void setdimensao(String dimensao) {
        this.dimensao = dimensao;
    }

       public String getcor() {
        return cor;
    }
    public void setcor(String cor) {
        this.cor = cor;
    }





}
