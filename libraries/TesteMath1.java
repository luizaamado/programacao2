package libraries;

public class TesteMath1 {

	public static void main(String[] args) {
		
		int i = -10;
		System.out.println(i);
		// classes abaixo de java.lang não precisa fazer o import, como Math.
		int j = Math.abs(i);
		System.out.println(j);
		System.out.println(Math.abs(i));
		
		double d1 = 4.499999;
		System.out.println("d1 = " + d1);
		double d2 = 4.000;
		System.out.println("d2 = " + d2);
		double d3 = Math.round(d1);
		System.out.println("d3 (round d1) = " + d3);
		
		double d4 = Math.max(d1, d3);
		System.out.println("d4 (max(d1, d3)) = " + d4);
		
		//tarefa: implementar e testar Math.min
		double d5 = Math.min(d3, d4);
		System.out.println("d5 (min(d3, d4))= " + d5);
		
		// funções ceil e floor
		System.out.println(Math.ceil(d1));
		double d6 = 4.999999;
		System.out.println(Math.floor(d6));
				
	}
}
