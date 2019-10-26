/**
 * 
 */
package rs.ac.uns.ftn.oisisi.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

/**
 * Primer upotrebe apache biblioteke commons io za otpakivanje arhive i
 * kopiranje direktorijuma na drugu lokaciju.
 * 
 * @author Danijel
 *
 */
public class IOExamples {

	public static void main(String[] args) throws IOException {
		unzip(new File("res/extracted"));

		FileUtils.copyDirectory(new File("res/extracted"), new File("res/extractedCopy"));
	}

	public static void unzip(File outputDir) throws IOException {
		ZipFile zipFile = new ZipFile("res/compressed.zip");
		try {
			Enumeration<? extends ZipEntry> entries = zipFile.entries();
			while (entries.hasMoreElements()) {
				ZipEntry entry = entries.nextElement();
				File entryDestination = new File(outputDir, entry.getName());
				if (entry.isDirectory()) {
					entryDestination.mkdirs();
				} else {
					entryDestination.getParentFile().mkdirs();
					InputStream in = zipFile.getInputStream(entry);
					OutputStream out = new FileOutputStream(entryDestination);
					IOUtils.copy(in, out);
					IOUtils.closeQuietly(in);
					out.close();
				}
			}
		} finally {
			zipFile.close();
		}
	}

}
