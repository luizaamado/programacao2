package libraries;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LeArquivo {

	public static void main(String[] args) {
		 
		try {
			InputStream inputStream = new FileInputStream("teste2.txt");
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			
			String s;
			
			s = bufferedReader.readLine();
			
			System.out.println(s);
			
			while(s != null) {
				System.out.println(s);
				s = bufferedReader.readLine();
			}
			bufferedReader.close();
			inputStreamReader.close();
			inputStream.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
