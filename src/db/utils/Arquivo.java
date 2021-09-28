package db.utils;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class Arquivo {

    public void escrever(String caminho, String dados) {
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


    public String[] ler(String identificacao, String caminho) {
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