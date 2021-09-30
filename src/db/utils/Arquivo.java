package db.utils;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

import db.utils.Crypto;

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


    public String[] ler(String eMail, String senha, String caminho) {
        Crypto c = new Crypto();
        
        try {
            File arquivo = new File(caminho);
            BufferedReader br = new BufferedReader(new FileReader(arquivo));

            String linha;

            // Lê linha por linha para verificar se a pessoa já está cadastrada
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(";");
                if (dados[3].equals(eMail) && c.decrypt(dados[4]).equals(senha)) {
                    br.close();
                    return dados;
                }
                
            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}