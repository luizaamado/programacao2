package libraries;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LeStringTeclado {

	public static void main(String[] args) {
		System.out.println("Digite uma mensagem: ");
		InputStream inputStream = System.in; // InputStream é a classe que sabe capturar um byte de entrada.
		// nessa caso, recebendo-o da entrada padrão do sistema.
		// preciso ler um monte de byte (0 e 1) e transformar em char:
		InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
		// buffered reader sabe receber varios char e armazena-los num buffer, transformando-o em String.
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String s;
		
		try {
			s = bufferedReader.readLine();
			System.out.println("Você digitou a mensagem: " + s);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
