package libraries;

public class TesteMath3 {

	public static void main(String[] args) {
		// TesteMath3: ver a diferen�a entre Math.sim e Math.toDegrees, Math.toRadians
		
		// Math.sin calcula o seno de um �ngulo, dado como par�metro �ngulo em radianos.
		int angEmGraus = 90;
		// Math.toRadians() mensura o �ngulo em radianos, dado como par�metro �ngulo em graus.
		double radians = Math.toRadians(angEmGraus);
		// Math.toDegrees() mensura o �ngulo em graus, dado como par�metro �ngulo em radianos.
		double degrees = Math.toDegrees(radians);
		double seno = Math.sin(radians);
		System.out.println("Seno de " + angEmGraus + " = " + seno);
		System.out.println(angEmGraus + " graus em radianos = " + radians);
		System.out.println(radians + " radianos em graus = " + degrees);
	}
}
