package ooavc;

public class Account {
	
	protected int id;
	protected String owner;
	protected double balance;
	protected double limit;
	
	public Account() {
	
	}

	public Account(int id, String owner, double balance, double limit) {
		this.id = id;
		this.owner = owner;
		this.balance = balance;
		this.limit = limit;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getLimit() {
		return limit;
	}

	public void setLimit(double limit) {
		this.limit = limit;
	}
	
	public void correction(double tax) {
		this.balance += this.balance * 1.2;
	}
	
	public boolean withdraw(double value) {
		if (value > this.balance + this.limit) {
			return false;
		}
		else {
			this.balance = this.balance - value;
			return true;
		}
	}
	
	public double deposit(double value) {
		return balance + value;
	}
	
	public String Tostring() {
		return "ID: " + this.id 
				+ "\nName: " + this.owner
				+ "\nBalance: " + this.balance
				+ "\nLimit: " + this.limit;
	}
}
