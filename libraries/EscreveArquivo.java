package libraries;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class EscreveArquivo {

	public static void main(String[] args) {

		try {
			OutputStream outputStream = new FileOutputStream("teste2.txt");
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
			BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

			bufferedWriter.write("A turma de ADS ama Java");

			System.out.println("Escrita realizada com sucesso");

			bufferedWriter.close();
			outputStreamWriter.close();
			outputStream.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
