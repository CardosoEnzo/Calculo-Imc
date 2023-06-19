/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.imcconsiste.lerarquivo;

import br.com.imcconsiste.regranegocio.RegraNegocio;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class LerArquivo extends RegraNegocio {

    public LerArquivo() {

    }

    public void lerArquivo(File arquivoCsv, FileWriter arquivoTxt) throws FileNotFoundException, IOException {
        try {
            Scanner leitor = new Scanner(arquivoCsv);
            String lerLinhas;
            leitor.nextLine();
            while (leitor.hasNext()) {
                lerLinhas = leitor.nextLine();
                String[] separadorColunas = lerLinhas.split(";");
                if (separadorColunas.length < 4) {
                    continue;
                }
                nome = separadorColunas[0].toUpperCase();
                sobrenome = separadorColunas[1].toUpperCase();
                peso = Double.parseDouble(separadorColunas[2].replace(",", "."));
                altura = Double.parseDouble(separadorColunas[3].replace(",", "."));
                calculoImc(peso, altura);
                DecimalFormat formato = new DecimalFormat("#.##");
                arquivoTxt.write("\t" + nome + " " + sobrenome + " " + formato.format(imc) + "\t");
            }

            arquivoTxt.close();
        } catch (ArrayIndexOutOfBoundsException a) {
            a.printStackTrace();
        }
    }

}
