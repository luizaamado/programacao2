//Interface raiz: Collection
//Duas Interfaces filhas: Set e List
//Filhas concretas de Set: HashSet, LinkedHashSet and TreeSet
//Filhas concretas de List: ArrayList, LinkedList and Vector
//java.util.List
//https://docs.oracle.com/javase/8/docs/api/java/util/List.html
//Set: coleção não ordenada e sem duplicidade
//List: coleção ordenada e permite duplicidade

//Matemática: conjunto: Seja C um conjunto cujo conteúdo é
//{1, 1, 1, 1}, quantos elementos possui o conjunto C?
//R: 1, C é um conjunto unitário!!!
//List L = [1, 1, 1, 1]. Size ou lenght de L a resposta é 4

package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ooavc.Account3;

public class TestaLista1 {

	public static void main(String[] args) {
		
		List listaCursos = new ArrayList();
		listaCursos.add("ADS");
		listaCursos.add("Redes");
		listaCursos.add("Matematica");
		
		Account3 account1 = new Account3();
		Account3 account2 = new Account3();
		Account3 account3 = new Account3();
		
		account1.deposit(100);
		account2.deposit(200);
		account3.deposit(300);
		
		account1.setId(1);
		account2.setId(2);
		account3.setId(3);
		
		List accounts = new ArrayList();
		
		accounts.add(account1);
		accounts.add(account2);
		accounts.add(account3);
		
		System.out.println(account3.getBalance());
		
		System.out.println("Tamanho da coleção de contas: " + accounts.size());
		
		for (int i = 0; i < accounts.size(); i++) {
			Account3 accountTemp = (Account3) accounts.get(i);
			System.out.println("Numero da conta: " + accountTemp.getId());
			System.out.println("Saldo: " + accountTemp.getBalance());
		}
	}

}
