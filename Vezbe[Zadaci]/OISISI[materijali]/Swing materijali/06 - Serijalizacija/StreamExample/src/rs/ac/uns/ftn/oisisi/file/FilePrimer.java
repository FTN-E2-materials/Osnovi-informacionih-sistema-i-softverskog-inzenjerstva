/**
 * 
 */
package rs.ac.uns.ftn.oisisi.file;

import java.io.File;

/**
 * @author Danijel
 *
 */
public class FilePrimer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		File fabs = new File("c:\\test.txt");
		System.out.println(fabs.getAbsolutePath());

		File frel = new File("images\\test.jpg");
		System.out.println(frel.getAbsolutePath()); // Ispisuje se puna putanja.
		System.out.println(frel.getPath()); // Ispisuje se putanja koja je uneta
											// kao parameter konstruktora

		File dir = new File("c:\\testdir");
		File file = new File(dir, "test.txt");
		System.out.println(file.getAbsolutePath());

		File src = new File("src");
		File[] files = src.listFiles();
		for (File f : files) {
			System.out.println("  " + f + " " + f.isDirectory() + " " + f.isFile());
		}

	}

}
