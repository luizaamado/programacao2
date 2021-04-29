package ooavc;

public class AccountTest4 {

	public static void main(String[] args) {
		
		Account account1 = new Account(); //instanciação
		account1.setLimit(100); //inicialização
		account1.setOwner("Luiza");
		
		Account account2 = new Account(); //instanciação
		account2.setLimit(100); //inicialização
		account2.setOwner("Luiza");
		
		// não tem como comparar porque são variáveis do tipo Classe
		if (account1 == account2) {
			System.out.println("As contas são iguais!");
		} else {
			System.out.println("As contas NÂO são iguais!");
		}
		
	}

}
