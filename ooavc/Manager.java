package ooavc;

public class Manager extends Employee implements InternBankAccess {
	
	private int password;
	
	public boolean verify(int password) {
		if(this.password == password) {
			System.out.println("Acesso autorizado");
			return true;
		} else {
			System.out.println("Acesso não autorizado");
			return false;
		}
	}
	
//	public double getBonus() {
//		return this.salary * 0.15;
//	}
	
//	public double getBonus() {
//		return super.getBonus() + 5000;
//	}
	
	public double getBonus() {
		return this.salary * 0.05 + 5000;
	}

}
