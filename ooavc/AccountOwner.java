package ooavc;

public class AccountOwner {
	
	String name;
	String lastName;
	String cpf;
	
	public AccountOwner() {
		super();
	}

	public AccountOwner(String name, String lastName, String cpf) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
