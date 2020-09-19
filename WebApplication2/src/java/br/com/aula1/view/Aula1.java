/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.aula1.view;

import br.com.aula1.beans.*;
import br.com.aula1.controle.*;

/**
 *
 * @author avmog
 */
public class Aula1 {

    /**
     * @param args the command line arguments/
     */
    public static void main(String[] args) throws Exception {
        
        PessoaFisica pf = new PessoaFisica();
        Controle c = new Controle();
        c.cadastrarPessoaFisica();
        c.buscarPessoaFisica(pf);
  
    }
    
}
