package rs.ac.uns.ftn.oisisi.stream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamPrimer {

	public static void main(String[] args) throws IOException {
		// Upis bajtova u operativnu memoriju.
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		try {
			byte[] b = "Ovo je neki tekst koji će se upisati u operativnu memoriju kao niz bajtova".getBytes("UTF-8");
			bos.write(b);
		} finally {
			bos.close(); // Za byte array output stream ne radi nista.
		}

		// Citanje niza bajtova iz operativne memorije. bos.toByteArray() vraća
		// sve bajtove koji su se upisali preko toka.
		ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
		try {
			byte[] buffer = new byte[255];
			int read = 0;
			while ((read = bis.read(buffer)) != -1) {
				for (int i = 0; i < read; i++) {
					System.out.print(buffer[i] + " ");
				}
			}
		} finally {
			bis.close(); // Takodje ne radi nista.
		}
	}

}
