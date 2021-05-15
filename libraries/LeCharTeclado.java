package libraries;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LeCharTeclado {

	public static void main(String[] args) {
		System.out.println("Digite uma �nica tecla: ");
		InputStream inputStream = System.in; // InputStream � a classe que sabe capturar um byte de entrada.
		// nessa caso, recebendo-o da entrada padr�o do sistema.
		// preciso ler um monte de byte (0 e 1) e transformar em char:
		InputStreamReader reader = new InputStreamReader(inputStream);
		
		char c;
		
		try {
			c = (char) reader.read();
			System.out.println("Voc� digitou a tecla: " + c);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
