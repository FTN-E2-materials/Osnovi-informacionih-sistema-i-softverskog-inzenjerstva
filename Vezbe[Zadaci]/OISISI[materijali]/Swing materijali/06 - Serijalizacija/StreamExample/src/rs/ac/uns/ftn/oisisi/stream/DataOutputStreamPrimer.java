/**
 * 
 */
package rs.ac.uns.ftn.oisisi.stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Danijel
 *
 */
public class DataOutputStreamPrimer {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		File f = new File("datastream.txt");
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(f));
		try {
			dos.writeInt(10);
			dos.writeBoolean(false);
			dos.writeUTF("String upisan preko DataOutputStream klase");
		} finally {
			dos.close(); // Zatvara i tok nizeg nivoa.
		}

		DataInputStream dis = new DataInputStream(new FileInputStream(f));
		try {
			int v = dis.readInt();
			boolean b = dis.readBoolean();
			String s = dis.readUTF();
			System.out.println(v + " - " + b + " - " + s);
		} finally {
			dis.close(); // Zatvara i tok nizeg nivoa.
		}
	}

}
