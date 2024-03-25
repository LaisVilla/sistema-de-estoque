/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projeto.model;

/**
 *
 * @author franc
 */
public class Produto {
    //atributos
    
    private int id;
    private String descricao;
    private double preco;
    private int qtd_estoque;
    
    private Fornecedore fornecedor;
    
    
    
    //getters e setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtd_estoque() {
        return qtd_estoque;
    }

    public void setQtd_estoque(int qtd_estoque) {
        this.qtd_estoque = qtd_estoque;
    }

    public Fornecedore getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedore fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    
}
