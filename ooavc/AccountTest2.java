package ooavc;

public class AccountTest2 {

	public static void main(String[] args) {
		Account account1 = new Account();
		Account account2 = new Account();
			
		account1.setId(001);
		account2.setId(002);

		System.out.println(account1.id);
		System.out.println(account2.id);
	}

}