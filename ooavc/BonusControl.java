package ooavc;

public class BonusControl {

	private double totalBonus = 0;
	
	public void setTotalBonus(Employee employee) {
		this.totalBonus += employee.getBonus();
	}
	
	public double getTotalBonus() {
		return this.totalBonus;
	}
}
