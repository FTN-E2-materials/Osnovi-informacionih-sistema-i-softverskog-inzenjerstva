/**
 * 
 */
package rs.ac.uns.ftn.oisisi.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

/**
 * @author Danijel
 *
 */
public class DeflaterOutputStreamPrimer {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// Sa kompresijom deflate format.
		File f = new File("deflaterstream.txt");
		DataOutputStream dos = new DataOutputStream(
				new BufferedOutputStream(new DeflaterOutputStream(new FileOutputStream(f))));
		try {
			writeLargeData(dos);
		} finally {
			dos.close();
		}

		// Citanje sa dekompresijom.
		DataInputStream dis = new DataInputStream(
				new BufferedInputStream(new InflaterInputStream(new FileInputStream(f))));
		try {
			System.out.println(dis.readInt() + " " + dis.readInt() + " " + dis.readInt());
		} finally {
			dis.close();
		}

		// Bez kompresije.
		f = new File("deflaterstream_no_compression.txt");
		dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(f)));
		try {
			writeLargeData(dos);
		} finally {
			dos.close();
		}
		// Citanje bez dekompresije.
		dis = new DataInputStream(new BufferedInputStream(new FileInputStream(f)));
		try {
			System.out.println(dis.readInt() + " " + dis.readInt() + " " + dis.readInt());
		} finally {
			dis.close();
		}
	}

	public static void writeLargeData(DataOutputStream dos) throws IOException {
		for (int i = 0; i < 1000000; i++) {
			dos.writeInt(i);
		}
	}

}
