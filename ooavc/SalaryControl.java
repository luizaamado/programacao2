package ooavc;

public class SalaryControl {
	
	private double totalSalaries = 0;
	
	public void setTotalSalaries(Employee employee) {
		this.totalSalaries += employee.getSalary();
	}
	
	public double getTotalSalaries() {
		return this.totalSalaries;
	}
}
