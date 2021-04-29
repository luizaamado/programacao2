package ooavc;

public class SavingsAccount extends Account {

	void correcao(double tax) {
		this.balance += this.balance * 1.3;
	}
}
