package ooavc;

public class AccountTest1 {

	public static void main(String[] args) {
		
		Account account1 = new SavingsAccount(); 
		
		account1.setId(123);
		account1.setOwner("Luiza");
		account1.setBalance(500);
		account1.setLimit(200);
		
		if (account1.withdraw(300) == true) {
			System.out.println("Withdraw successful. Your new balance is: " + account1.getBalance());
		}
		else {
			System.out.println("Withdraw not successful.");
		}
		
		System.out.println(account1.Tostring());
	}

}