package libraries;

public class TesteString4 {

	public static void main(String[] args) {
		// TesteString4: substring, trim, indexOf, lastIndexOf
		
		String a = " Java ADS na veia ";
		String b = "banana";
		System.out.println("String a: ." + a + ".");
		System.out.println("String b: " + b);
		
		System.out.println("Sub string come�ando no �ndice 7: " + a.substring(7));
		System.out.println("Sub string come�ando no �ndice 5 e terminando no 10 (11 - 1): " + a.substring(5, 11));
		System.out.println("String sem os espa�os em branco � direita e � esquerda: ." + a.trim() + ".");
		System.out.println("�ndice do primeiro caracter da primeira ocorr�ncia da sub string 'na' da string b: " + b.indexOf("na"));
		System.out.println("�ndice do primeiro caracter da �ltima ocorr�ncia da sub string 'na' da string b: " + b.lastIndexOf("na"));
	}

}
