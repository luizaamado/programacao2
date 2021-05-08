package libraries;

public class TesteString1 {

	public static void main(String[] args) {
		String a = new String("Java ADS na veia");
		String b = new String("Java ADS na veia");
		int c = 2; // tipo primitivo, o comportamento é diferente
		int d = 2; // tipo primitivo, o comportamento é diferente
		
		// Na verdade, para objetos, ele compara o hash. 
		if (a == b) { 
			System.out.println("a e b são iguais (mesmo objeto)");
		} else {
			System.out.println("a e b são objetos diferentes");
		}
		
		// Se quero comparar o conteudo de um objeto String, tenho que usar o equals
		if (a.equals(b)) { 
			System.out.println("a e b são iguais (mesmo objeto)");
		} else {
			System.out.println("a e b são objetos diferentes");
		}
		
		// tipo primitivo, o comportamento é diferente
		if (c == d) {
			System.out.println("c e d são iguais (mesmo objeto)");
		} else {
			System.out.println("c e d são objetos diferentes");
		}
	}
}
