package libraries;

public class TesteMath3 {

	public static void main(String[] args) {
		// TesteMath3: ver a diferença entre Math.sim e Math.toDegrees, Math.toRadians
		
		// Math.sin calcula o seno de um ângulo, dado como parâmetro ângulo em radianos.
		int angEmGraus = 90;
		// Math.toRadians() mensura o ângulo em radianos, dado como parâmetro ângulo em graus.
		double radians = Math.toRadians(angEmGraus);
		// Math.toDegrees() mensura o ângulo em graus, dado como parâmetro ângulo em radianos.
		double degrees = Math.toDegrees(radians);
		double seno = Math.sin(radians);
		System.out.println("Seno de " + angEmGraus + " = " + seno);
		System.out.println(angEmGraus + " graus em radianos = " + radians);
		System.out.println(radians + " radianos em graus = " + degrees);
	}
}
