package ooavc;

public class Cashier extends Employee implements InternBankAccess {
	int password;

	public boolean verify(int password) {
		return false;
	}
	
	double getBonus() {
		return 0;
	}
	
}
