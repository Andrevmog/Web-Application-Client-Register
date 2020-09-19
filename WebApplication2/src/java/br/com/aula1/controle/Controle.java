/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aula1.controle;

import br.com.aula1.DAO.*;
import br.com.aula1.beans.*;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import com.google.firebase.internal.FirebaseService;
import java.io.Serializable;
import java.util.concurrent.ExecutionException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.xml.ws.ServiceMode;


/**
 *
 * @author avmog
 */
@ServiceMode
@ViewScoped
@ManagedBean
public class Controle implements Serializable {

    private PessoaFisica pessoaFisica = new PessoaFisica();
    FirebaseService fireBaseService;

    public Controle() {
    }
    
    public void cadastrarPessoaFisica(){
        try{
            DAO dao = new DAO();
            dao.cadastrar(pessoaFisica);
            Runtime.getRuntime().exec("java -jar C://Users//avmog//Documents//NetBeansProjects//Firebaserest//dist//Firebaserest.jar "+pessoaFisica.getCpf());
            
        }catch (Exception e){
            System.err.println("Log erro"+e.getMessage());
        }
    }
    
    public void buscarPessoaFisica(PessoaFisica pessoaFisica){
        try{
            DAO dao = new DAO();
            dao.buscar(pessoaFisica);
            
        }catch (Exception e){
            System.err.println("Log erro"+e.getMessage());
        }
    }
    
    public String TemDoc(PessoaFisica pessoaFisica){
        String str= "";
        if(pessoaFisica.getCpf().equals(str)){
            str ="-";
        }else
            str="+";   
        {
        return str;      
        }
    }
    public String tratamento(PessoaFisica pessoaFisica) throws Exception{
        
        String n = pessoaFisica.getName().replace(" ","/");
        String str = pessoaFisica.getEmail()+TemDoc(pessoaFisica)+n;
                
        return str;    
    }

    public PessoaFisica getPessoaFisica() {
        return pessoaFisica;
    }

    public void setPessoaFisica(PessoaFisica pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
    }
    
    
    
    
    
    
}

//java -jar "C:\Users\avmog\Documents\NetBeansProjects\Firebaserest\dist\Firebaserest.jar"
//UnpyiRBMuGH8PiuQQm6V