package ooavc;

public class Account2 {
	
	private int id;
	private AccountOwner owner;
	private double balance;
	private double limit;
	
	public Account2() {
	
	}

	public Account2(int id, AccountOwner owner, double balance, double limit) {
		super();
		this.id = id;
		this.owner = new AccountOwner();
		this.balance = balance;
		this.limit = limit;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public AccountOwner getOwner() {
		return owner;
	}

	public void setOwner(AccountOwner owner) {
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
	
	public boolean Withdraw(double value) {
		if (value > this.balance + this.limit) {
			return false;
		}
		else {
			this.balance = this.balance - value;
			return true;
		}
	}
	
	public double Deposit(double value) {
		return balance + value;
	}
	
	public String Tostring() {
		return "ID: " + this.id 
				+ "\nName: " + this.owner
				+ "\nBalance: " + this.balance
				+ "\nLimit: " + this.limit;
	}
}
