package progredes;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {

	public static void main(String[] args) throws IOException {
		// abrir um socket que � servidor (um server socket)
		ServerSocket server = new ServerSocket(10000);
		System.out.println("Porta 10000 aberta, aguardando conex�o do cliente.");
		
		// receber a comunica��o de um cliente e abrir espa�o pra ele
		Socket client = server.accept();
		System.out.println("Conex�o do cliente " + client.getInetAddress().getHostAddress());
		
		// tratar a comunica��o.
		Scanner s = new Scanner(client.getInputStream());
		
		while(s.hasNextLine()) {
			System.out.println(s.nextLine());
		}
		
		// fechar a comunica��o.
		s.close();
		client.close();
		server.close();
	}

}
