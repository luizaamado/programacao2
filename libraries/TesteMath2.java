package libraries;

public class TesteMath2 {

	public static void main(String[] args) {
		// TesteMath2: implementar e testar Math.exp, Math.log, Math.pow, Math.sqrt,
		// log de a na base b
		
		double i = 5;
		double j = 3;
		double k = 25;
		System.out.println("i = " + i);
		System.out.println("Math.exp(" + i + ") = " + Math.exp(i));
		System.out.println("Math.log(" + i + ") = " + Math.log(i));
		System.out.println("Math.pow(" + i + ", " + j + ") = " + Math.pow(i, j));
		System.out.println("Math.sqrt(" + i + ") = " + Math.sqrt(i));
		System.out.println("log de " + k + " na base " + i + " = " + log(i, k));
	}
	
	public static double log(double base, double valor) {
        return Math.log(valor) / Math.log(base);
    }
}
