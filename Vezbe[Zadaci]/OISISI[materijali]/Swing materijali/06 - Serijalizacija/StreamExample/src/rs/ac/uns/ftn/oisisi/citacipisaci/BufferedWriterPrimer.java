/**
 * 
 */
package rs.ac.uns.ftn.oisisi.citacipisaci;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @author Danijel
 *
 */
public class BufferedWriterPrimer {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		//Pisanje.
		File f = new File("writer.txt");
		// Klasa OutputStreamWriter je most izmedju karakter toka i byte toka.
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f)));
		try {
			writer.write("Neki tekst koji će biti snimljen u datoteku");
		} finally {
			writer.close();
		}

		//Citanje.
		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
		try {
			String s = reader.readLine();
			System.out.println(s);
		} finally {
			reader.close();
		}

	}

}
