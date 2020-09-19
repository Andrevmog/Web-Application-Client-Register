/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aula1.DAO;

import br.com.aula1.beans.*;
import br.com.aula1.controle.Controle;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;


/**
 *
 * @author avmog
 */
@ViewScoped
@Named
public class DAO implements Serializable  {
    
    public Boolean cadastrar(PessoaFisica pessoaFisica) throws Exception{
        Controle c = new Controle();
        Gson gson = new GsonBuilder().create();
            FileWriter arquivoJson;
        arquivoJson = new FileWriter("C:\\Users\\avmog\\Documents\\NetBeansProjects\\aula1\\banco\\" + pessoaFisica.getCpf()+".json");
        arquivoJson.write(gson.toJson(pessoaFisica).toString());
        arquivoJson.close();
        Runtime.getRuntime().exec("java -jar C:\\Users\\avmog\\Documents\\NetBeansProjects\\Teste\\dist\\Teste.jar "+c.tratamento(pessoaFisica));
        return false;
    }
    
    public Boolean alterar (){
        return false;
    }
    
    public Boolean listar(){
        return false;
    }
    
    public Boolean excluir(){
        return false;
    }
    
    public Boolean buscar(PessoaFisica pessoaFisica)throws Exception{
        Gson gson = new Gson();
            FileReader arquivoJson;
        arquivoJson = new FileReader("C:\\Users\\avmog\\Documents\\NetBeansProjects\\aula1\\banco\\" + pessoaFisica.getCpf()+".json");
        BufferedReader br = new BufferedReader(arquivoJson);
        String s;
        while ((s = br.readLine()) != null) {
            System.out.println(s);
	}
        arquivoJson.close();   
        return false;
    }
    
}
