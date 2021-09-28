package db;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// Salvação https://www.codejava.net/java-se/file-io/how-to-read-and-write-text-file-in-java

public class LeitoraDeArquivoDeTexto {

    public static String[] geraArrayListComDados(String identificacao, String caminho) {
        try {
            FileReader leitor = new FileReader(caminho);
            BufferedReader bufferedReader = new BufferedReader(leitor);

            String linha;

            // Lê linha por linha para verificar se a pessoa já está cadastrada
            while ((linha = bufferedReader.readLine()) != null) {
                String[] dados = linha.split("|");
                if (dados[0].equals(caminho)) {
                    leitor.close();
                    bufferedReader.close();
                    return dados;
                }
            }
            leitor.close();
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

}