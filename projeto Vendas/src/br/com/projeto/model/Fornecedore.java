/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.projeto.model;

/**
 *
 * @author franc
 */
public class Fornecedore extends Cliente {
    //atributos
    private String cnpj;
    
    //getters e setters

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
 
    @Override
    public String toString(){
        return this.getNome();
    }
}
