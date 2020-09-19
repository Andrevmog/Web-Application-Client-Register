/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aula1.beans;

import java.io.Serializable;
import javax.annotation.ManagedBean;
import javax.faces.view.ViewScoped;



/**
 *
 * @author avmog
 */
@ViewScoped
@ManagedBean
public class PessoaFisica extends Pessoa implements Serializable {
    
    private String cpf;

    public PessoaFisica() {
    }

    public PessoaFisica(String cpf, String name, String email, String endereco, String telefone) {
        super(name, email, endereco, telefone);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    
}
