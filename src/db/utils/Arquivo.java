package db.utils;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

// Esta classe manipula os arquivos de texto diretamente
public class Arquivo {

  /**
   * Abre um arquivo de texto para a escrita.
   * 
   * @param caminho O caminho do arquivo.
   * @param dados   O conteúdo do arquivo.
   */
  public void escrever(String caminho, String dados) {
    try {
      // O parâmetro true indica que haverá uma uma anexação, e não uma sobrescrita
      FileWriter escritor = new FileWriter(caminho, true);
      BufferedWriter bufferedWriter = new BufferedWriter(escritor);

      bufferedWriter.write(dados);
      bufferedWriter.newLine();

      bufferedWriter.close();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

  /**
   * Abre o arquivo de dados para leitura e retorna a linha de dados referente ao
   * cliente.
   * 
   * @param eMail   O e-mail do usuário.
   * @param senha   A senha do usuário.
   * @param caminho O caminho do arquivo.
   * @return A linha de dados referente ao cliente.
   */
  public String[] ler(String eMail, String senha, String caminho) {
    // Cria uma nova instância da classe Crypto para descriptografar a senha no
    // arquivo
    Crypto c = new Crypto();

    try {
      File arquivo = new File(caminho);
      BufferedReader br = new BufferedReader(new FileReader(arquivo));

      String linha;

      // Lê linha por linha para verificar se a pessoa já está cadastrada
      while ((linha = br.readLine()) != null) {
        // Separa os dados da linha
        String[] dados = linha.split(";");

        // Se o e-mail e a senha estiverem corretos, retorna os dados
        if (dados[3].equals(eMail) && c.decrypt(dados[4]).equals(senha)) {
          br.close();
          return dados;
        }

      }
      br.close();

    } catch (IOException e) {
      e.printStackTrace();
    }
    // Se o cliente não está cadastrado ou os dados estão incorretos,
    // retorna nulo
    return null;
  }
}