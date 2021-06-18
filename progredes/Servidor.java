package progredes;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {

	public static void main(String[] args) throws IOException {
		// abrir um socket que é servidor (um server socket)
		ServerSocket server = new ServerSocket(10000);
		System.out.println("Porta 10000 aberta, aguardando conexão do cliente.");
		
		// receber a comunicação de um cliente e abrir espaço pra ele
		Socket client = server.accept();
		System.out.println("Conexão do cliente " + client.getInetAddress().getHostAddress());
		
		// tratar a comunicação.
		Scanner s = new Scanner(client.getInputStream());
		
		while(s.hasNextLine()) {
			System.out.println(s.nextLine());
		}
		
		// fechar a comunicação.
		s.close();
		client.close();
		server.close();
	}

}
