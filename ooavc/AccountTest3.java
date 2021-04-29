package ooavc;

public class AccountTest3 {

	public static void main(String[] args) {

		Account account1 = new Account(); //instanciação
		account1.setLimit(100); //inicialização
		
		//aqui account1 passa a ser um ponteiro que aponta para uma estrutura (endereço de memória)
		//sobrescreve o endereço de memória
		Account account2 = account1; //"=" operador de atribuição
		account2.setLimit(200);
		
		System.out.println(account1.getLimit());
	}

}
