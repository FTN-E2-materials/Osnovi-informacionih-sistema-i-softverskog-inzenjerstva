package rs.ac.uns.ftn.oisisi.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileOutputStreamPrimer {

	public static void main(String[] args) throws IOException {
		File f = new File("stream.txt");
		f.createNewFile();

		// Pisanje u tok.
		FileOutputStream fos = new FileOutputStream(f);
		try {
			byte[] b = "Ovo je neki tekst koji će se upisati u datoteku!!!".getBytes("UTF-8");
			fos.write(b);
		} finally {
			fos.close();
		}

		// Citanje iz toka.
		FileInputStream fis = new FileInputStream(f);
		try {
			List<Byte> bytes = new ArrayList<Byte>();

			// Buffer za citanje blok po blok.
			byte[] b = new byte[16];

			int read = 0;
			while ((read = fis.read(b)) != -1) {

				for (int i = 0; i < read; i++) {
					bytes.add(b[i]);
				}
			}

			// Prebacivanje u niz bajtova.
			byte[] finalBytes = new byte[bytes.size()];
			for (int i = 0; i < bytes.size(); i++) {
				finalBytes[i] = bytes.get(i);
			}

			// Rekonstrukcija stringa.
			String s = new String(finalBytes, "UTF-8");
			System.out.println(s);
		} finally {
			fis.close();
		}

	}

}
