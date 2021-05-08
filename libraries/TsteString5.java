package libraries;

public class TsteString5 {

	public static void main(String[] args) {
		// TesteString5: isEmpty, contains, replace
		
		String a = " Java ADS na veia ";
		String b = "banana";
		System.out.println("String a: ." + a + ".");
		System.out.println("String b: " + b);
		
		System.out.println("O tamanho da string a é zero: " + a.isEmpty());
		System.out.println("A string a possui a sequência de caracteres 'ADS': " + a.contains("ADS"));
		System.out.println("Substituindo os caracteres 'a' por 'i' na string b: " + b.replace('a','i'));
	}
}
