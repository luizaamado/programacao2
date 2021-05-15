package libraries;

public class TesteToString {

	public static void main(String[] args) {
		
		Client1 c1 = new Client1();
		System.out.println(c1.toString());
		System.out.println(c1);
		
		Client2 c2 = new Client2("Java");
		System.out.println(c2.toString());
		System.out.println(c2);
	}

}
