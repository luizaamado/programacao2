package exceptions;

import java.io.IOException;
import java.io.InputStreamReader;

public class TesteException3 {
	
	private static InputStreamReader conn;
	
	public static void main(String[] args) throws IOException, IllegalAccessException {
		
		try {
			// c�digo com v�rias classes checked.
		} finally {
			conn.close();
		}
	}

}