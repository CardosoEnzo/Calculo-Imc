/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imcconsiste;

import br.com.imcconsiste.lerarquivo.LerArquivo;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author ADM
 */
public class ImcConsiste {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        LerArquivo lerArquivo = new LerArquivo();
        File arquivoCsv = new File("C:\\Users\\ADM\\Documents\\arquivoCsvConsiste\\DATASET.CSV");
        FileWriter arquivoTxt = new FileWriter("enzoValentinoSantosCardoso.txt");
        lerArquivo.lerArquivo(arquivoCsv, arquivoTxt);

    }

}
