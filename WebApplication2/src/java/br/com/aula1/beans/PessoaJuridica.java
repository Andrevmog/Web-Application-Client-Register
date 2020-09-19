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
public class PessoaJuridica extends Pessoa {
    
    private String cnpj;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String cnpj, String name, String email, String endereco, String telefone) {
        super(name, email, endereco, telefone);
        this.cnpj = cnpj;
    }
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    
    
}
