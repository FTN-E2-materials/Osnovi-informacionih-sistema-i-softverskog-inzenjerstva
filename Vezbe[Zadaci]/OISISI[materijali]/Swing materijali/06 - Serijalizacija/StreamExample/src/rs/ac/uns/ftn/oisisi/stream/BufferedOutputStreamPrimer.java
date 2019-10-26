/**
 * 
 */
package rs.ac.uns.ftn.oisisi.stream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Danijel
 *
 */
public class BufferedOutputStreamPrimer {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// Upis bez buffer-a.
		long currentTime = System.currentTimeMillis();
		File f = new File("bufferstream.txt");
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(f));
		try {
			writeLarge(dos);
		} finally {
			dos.close();
		}
		System.out.println("Vreme upisa bez bafera (ms): " + (System.currentTimeMillis() - currentTime));

		// Upis sa buffer-om.
		currentTime = System.currentTimeMillis();
		f = new File("bufferstream.txt");
		dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(f)));
		try {
			writeLarge(dos);			
		} finally {
			dos.close();
		}
		System.out.println("Vreme upisa sa baferom (ms): " + (System.currentTimeMillis() - currentTime));

	}

	public static void writeLarge(DataOutputStream dos) throws IOException {
		
		for(int i=0; i<100000;i ++) {
			dos.write(i); 
		}
	}

}
