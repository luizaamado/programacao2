package ooavc;

public class AccountTest4 {

	public static void main(String[] args) {
		
		Account account1 = new Account(); //instancia��o
		account1.setLimit(100); //inicializa��o
		account1.setOwner("Luiza");
		
		Account account2 = new Account(); //instancia��o
		account2.setLimit(100); //inicializa��o
		account2.setOwner("Luiza");
		
		// n�o tem como comparar porque s�o vari�veis do tipo Classe
		if (account1 == account2) {
			System.out.println("As contas s�o iguais!");
		} else {
			System.out.println("As contas N�O s�o iguais!");
		}
		
	}

}
