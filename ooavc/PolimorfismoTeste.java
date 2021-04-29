package ooavc;

public class PolimorfismoTeste {

	public static void main(String[] args) {
		
//		Employee employee1 = new Employee();
//		employee1.setSalary(1000);
//		double salFunc = employee1.getSalary();
//		System.out.println("O salario do funcionario 1 e: " + salFunc);
//		System.out.println("O bonus do funcionario 1 e: " + employee1.getBonus());
		
		Manager manager1 = new Manager();
		manager1.setSalary(10000);
		System.out.println("O salario do funcionario 1 e: " + manager1.getSalary());
		System.out.println("O bonus do funcionario 1 e: " + manager1.getBonus());
	}

}
