//Map é uma interface em Java que simula uma estrutura de
//chave-valor

package collections;

import java.util.HashMap;
import java.util.Map;

import ooavc.Account3;

public class TestaMap {

	public static void main(String[] args) {
		
		Account3 a1 = new Account3();
		a1.deposit(10);
		Account3 a2 = new Account3();
		a1.deposit(20);
		Account3 a3 = new Account3();
		a1.deposit(30);
		
		Map<String, Account3> mapaAccounts = new HashMap<String, Account3>();
		mapaAccounts.put("Lucas", a1);
		mapaAccounts.put("Mateus", a2);
		mapaAccounts.put("Lissa", a3);
		
		Account3 recoveredAccount = mapaAccounts.get("Mateus");
		System.out.println("Saldo da conta de Mateus: " + recoveredAccount.getBalance());
	}

}
