/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.imcconsiste.regranegocio;

import br.com.imcconsiste.lerarquivo.LerArquivo;
import java.io.File;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class RegraNegocio {

    public double peso;
    public double altura;
    public static double imc;
    public String nome;
    public String sobrenome;
    
    
    public RegraNegocio(){
        
    }

    public static double calculoImc(double peso, double altura) {
        imc = peso / (altura * altura);
        if(peso == 0 || altura == 0){
            return 0;
        }
        return imc;
    }

    
}
