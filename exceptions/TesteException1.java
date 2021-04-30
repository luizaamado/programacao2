package exceptions;

public class TesteException1 {

	public static void main(String[] args) {
		System.out.println("In�cio do m�todo main");
		metodo1();
		System.out.println("Fim do m�todo main");
	}

	private static void metodo1() {
		System.out.println("In�cio do m�todo 1");
		metodo2();
		System.out.println("Fim do m�todo 1");
	}

	private static void metodo2() {
		System.out.println("In�cio do m�todo 2");
		int array[] = new int[10];
		try {
			for (int i = 0; i < 20; i++) {
				array[i] = i;
				System.out.println(i);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("An error occurred: " + e);
		}
		System.out.println("Fim do m�todo 2");		
	}

}
