package libraries;

public class TesteString2 {

	public static void main(String[] args) {
		String a = "Java ADS na veia";
		String c = "java ads na veia";
		
		System.out.println("String a: " + a);
		System.out.println("String c: " + c);
		
		String b[] = a.split(" ");
		System.out.println("\nSeparando as palavras da string a:");
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println(b[3] + "\n");

		int i = a.compareTo(a);
		System.out.println("Compara a com a: " + i);
		
		int j = c.compareTo(a);
		System.out.println("Compara c com a: " + j);
		
		int k = a.compareToIgnoreCase(c);
		System.out.println("Compara a com c ignorando diferen�as entra maisculas e minusculas: " + k);
		
		String e = a.toLowerCase();
		System.out.println("String a com caracteres min�sculos: " + e);
		
		System.out.println("String c com caracteres mai�sculos: " + c.toUpperCase());
		
		String f = a.toUpperCase();
		System.out.println("String a com caracteres mai�sculos: " + f);
		
//		String c = "java ads na veia";
//		if (a.compareTo(c) == 0) {
//			System.out.println("Os objetos s�o iguais");
//		} else if (a.compareTo(c) > 0) {
//			System.out.println("Os objetos s�o diferentes (maior que zero)");
//		} else if (a.compareTo(c) < 0) {
//			System.out.println("Os objetos s�o diferentes (menor que zero)");
//		}
	}

}
