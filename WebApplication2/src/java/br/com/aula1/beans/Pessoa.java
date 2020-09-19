/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aula1.beans;

/**
 *
 * @author avmog
 */
public abstract class Pessoa {
    
    private String name;
    private String email;
    private String endereco;
    private String telefone;

    public Pessoa() {
    }

    public Pessoa(String name, String email, String endereco, String telefone) {
        this.name = name;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
}

