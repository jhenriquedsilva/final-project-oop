package db;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
 
// Salvação https://www.codejava.net/java-se/file-io/how-to-read-and-write-text-file-in-java
public class EscritoraDeArquivoDeTexto {
 
    public static void escreverNoArquivoDeTexto(String caminho, String dados) {
        try {
            // A flag true indica que haverá uma uma anexação, e não uma sobrescrita
            FileWriter escritor = new FileWriter(caminho, true);
            BufferedWriter bufferedWriter = new BufferedWriter(escritor);
 
            bufferedWriter.write(dados);
            bufferedWriter.newLine();

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
 
    }
 
}