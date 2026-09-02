package com.senai.infoa.rental_eventos.models;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

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

    @Column(name="peso")
    private  BigDecimal peso;

    @Column(name="dimensao")
    private  String dimensao;

    @Column(name="cor")
    private  String cor;

    

 public  Equipamento(){
 }

 


 public Equipamento(Integer id, String marca, String modelo, int quantidade_disponivel, String categoria,
        String potencia, String material, BigDecimal peso, String dimensao, String cor) {
    this.id = id;
    this.marca = marca;
    this.modelo = modelo;
    Quantidade_disponivel = quantidade_disponivel;
    this.categoria = categoria;
    this.potencia = potencia;
    this.material = material;
    this.peso = peso;
    this.dimensao = dimensao;
    this.cor = cor;
}




 public Integer getId() {
    return id;
 }

 public void setId(Integer id) {
    this.id = id;
 }

 public String getMarca() {
    return marca;
 }

 public void setMarca(String marca) {
    this.marca = marca;
 }

 public String getModelo() {
    return modelo;
 }

 public void setModelo(String modelo) {
    this.modelo = modelo;
 }

 public int getQuantidade_disponivel() {
    return Quantidade_disponivel;
 }

 public void setQuantidade_disponivel(int quantidade_disponivel) {
    Quantidade_disponivel = quantidade_disponivel;
 }

 public String getCategoria() {
    return categoria;
 }

 public void setCategoria(String categoria) {
    this.categoria = categoria;
 }

 public String getPotencia() {
    return potencia;
 }

 public void setPotencia(String potencia) {
    this.potencia = potencia;
 }

 public String getMaterial() {
    return material;
 }

 public void setMaterial(String material) {
    this.material = material;
 }

 public BigDecimal getPeso() {
    return peso;
 }

 public void setPeso(BigDecimal peso) {
    this.peso = peso;
 }

 public String getDimensao() {
    return dimensao;
 }

 public void setDimensao(String dimensao) {
    this.dimensao = dimensao;
 }

 public String getCor() {
    return cor;
 }

 public void setCor(String cor) {
    this.cor = cor;
 }



  
}
