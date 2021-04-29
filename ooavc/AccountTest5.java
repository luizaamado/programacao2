package ooavc;

public class AccountTest5 {

	public static void main(String[] args) {

		Account3 account1 = new Account3(001, "Luiza", 100, 100);
		System.out.println(account1.getOwner().name);
		
		Account3 account2 = new Account3(002, "Mariana", 100, 100);
		System.out.println(account2.getOwner().name);
		
		Account3 account3 = new Account3(003, "Gabriela", 100, 100);
		System.out.println(account3.getOwner().name);
	}
	
}
