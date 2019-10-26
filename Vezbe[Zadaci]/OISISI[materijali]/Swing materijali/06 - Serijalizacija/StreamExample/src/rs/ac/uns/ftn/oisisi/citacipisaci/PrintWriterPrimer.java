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
import java.io.PrintWriter;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

/**
 * @author Danijel
 *
 */
public class PrintWriterPrimer {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		File f = new File("printwriter.txt");
		PrintWriter pw = new PrintWriter(
				new BufferedWriter(new OutputStreamWriter(new DeflaterOutputStream(new FileOutputStream(f)))));
		try {
			pw.println("Ovo je neki tekst!!!");
			pw.println("U novoj liniji.");
			pw.println();
			pw.println("Opet neki tekst");
		} finally {
			pw.close();
		}

		BufferedReader reader = new BufferedReader(
				new InputStreamReader(new InflaterInputStream(new FileInputStream(f))));
		try {
			String line = null;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} finally {
			reader.close();
		}

	}

}
