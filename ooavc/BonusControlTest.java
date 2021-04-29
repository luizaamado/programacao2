package ooavc;

public class BonusControlTest {

	public static void main(String[] args) {
		BonusControl control = new BonusControl();
		
//		Employee employee1 = new Employee();
//		employee1.setSalary(1000);
//		control.setTotalBonus(employee1);
//		System.out.println("Bônus acumulado: " + control.getTotalBonus());
		//50
		
		Manager manager1 = new Manager();
		manager1.setSalary(10000);
		control.setTotalBonus(manager1);
		System.out.println("Bônus acumulado: " + control.getTotalBonus());
		// 50 + (500 + 5000) = 5550
	}

}
