/**
 * 
 */
package rs.ac.uns.ftn.oisisi.stream;

import java.io.PrintStream;
import java.util.zip.DeflaterOutputStream;

/**
 * @author Danijel
 *
 */
public class PrintStreamPrimer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Ispisivanje u konzoli ali kompresovano.
		PrintStream ps = new PrintStream(new DeflaterOutputStream(System.out));
		System.setOut(ps);

		System.out.println("Ovo je neki tekst, ali se neće baš tako ispisati u konzoli!");
	}

}
