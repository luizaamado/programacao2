package ooavc;

public class AccountTest3 {

	public static void main(String[] args) {

		Account account1 = new Account(); //instancia��o
		account1.setLimit(100); //inicializa��o
		
		//aqui account1 passa a ser um ponteiro que aponta para uma estrutura (endere�o de mem�ria)
		//sobrescreve o endere�o de mem�ria
		Account account2 = account1; //"=" operador de atribui��o
		account2.setLimit(200);
		
		System.out.println(account1.getLimit());
	}

}
