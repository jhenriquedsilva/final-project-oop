package db.utils;

import java.io.UnsupportedEncodingException;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import java.util.Arrays;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Crypto {
  // Chave encriptada para o AES
  private static SecretKeySpec secretKey;

  // Chave de criptografia
  private static String secretKeyString = "barataolojas2021";

  // Algoritmo de criptografia
  private static byte[] key;

  /**
   * Construtor da classe Crypto. Modifica o valor do atributo secretKey com uma
   * chave baseada na chave secreta secretKeyString.
   * 
   * @throws NoSuchAlgorithmException
   * @throws UnsupportedEncodingException
   */
  public Crypto() {

    MessageDigest sha = null;

    try {
      key = secretKeyString.getBytes("UTF-8");
      sha = MessageDigest.getInstance("SHA-1");

      // Hash da chave
      key = sha.digest(key);
      key = Arrays.copyOf(key, 16);

      // Cria a chave secreta
      secretKey = new SecretKeySpec(key, "AES");
    } catch (NoSuchAlgorithmException e) {
      e.printStackTrace();
    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
    }
  }

  /**
   * Método que criptografa uma String.
   * 
   * @param text String a ser criptografada.
   * @return String criptografada.
   */
  public String encrypt(String text) {
    try {
      // Cria o cipher
      Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");

      // Criptografa a String
      cipher.init(Cipher.ENCRYPT_MODE, secretKey);
      byte[] encrypted = cipher.doFinal(text.getBytes("UTF-8"));
      return Base64.getEncoder().encodeToString(encrypted);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

  /**
   * Método que descriptografa uma String.
   * 
   * @param text String a ser descriptografada.
   * @return String descriptografada.
   */
  public String decrypt(String text) {
    try {
      // Cria o cipher
      Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
      cipher.init(Cipher.DECRYPT_MODE, secretKey);

      // Decriptografa a String
      byte[] decrypted = cipher.doFinal(Base64.getDecoder().decode(text));
      return new String(decrypted);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }
}