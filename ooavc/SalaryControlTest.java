package ooavc;

public class SalaryControlTest {

	public static void main(String[] args) {
		
		SalaryControl control = new SalaryControl();
		
//		Employee employee1 = new Employee();
//		employee1.setSalary(500);
//		control.setTotalSalaries(employee1);
//		System.out.println("Total salarios contabilizados: " + control.getTotalSalaries());
		
		Manager manager1 = new Manager();
		manager1.setSalary(10000);
		control.setTotalSalaries(manager1);
		System.out.println("Total salarios contabilizados: " + control.getTotalSalaries());
	}

}
