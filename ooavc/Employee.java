package ooavc;

public abstract class Employee {
	protected String name;
	protected String cpf;
	protected String department;
	protected String admissionDate;
	protected double salary;
	protected String status;
	//protected é um private um pouco mais relaxado em relação à linha de herança
	
//	void bonus(double bonus) {
//		this.salary += bonus;
//	}
	
//	public double getBonus(double bonus) {
//		return (this.salary * bonus) / 100;
//	}
	
	// v2
//	double getBonus() {
//		return this.salary * 0.05;
//	}
	
	// v3 com a classe Employee abstract
	abstract double getBonus();
//	{
//		return this.salary * 0.05;
//	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(String admissionDate) {
		this.admissionDate = admissionDate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
