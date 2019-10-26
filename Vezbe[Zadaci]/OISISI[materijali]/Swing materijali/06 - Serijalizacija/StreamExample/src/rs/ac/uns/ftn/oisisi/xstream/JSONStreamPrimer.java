package rs.ac.uns.ftn.oisisi.xstream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;

import rs.ac.uns.ftn.oisisi.objectstream.Automobil;
import rs.ac.uns.ftn.oisisi.objectstream.Motor;
import rs.ac.uns.ftn.oisisi.objectstream.Vlasnik;
import rs.ac.uns.ftn.oisisi.objectstream.Motor.Tip;

public class JSONStreamPrimer {

	public static void main(String[] args) throws IOException {
		Motor bmwMotor = new Motor(1.998, 222, "sdgsdkjgkl", Tip.DIZEL);
		Vlasnik vlasnik = new Vlasnik("Ivan", "Ivanović");
		Automobil bmw320 = new Automobil("320E", 2005, 5, new Date(), bmwMotor, vlasnik);
		Automobil opel = new Automobil("Astra", 2006, 5, new Date(), bmwMotor, vlasnik);
		Automobil[] automobili = new Automobil[] { bmw320, opel };

		File f = new File("xstream.json");
		OutputStream os = new BufferedOutputStream(new FileOutputStream(f));
		try {

			// Poseban drajver treba proslediti u konstruktoru za JSON.
			XStream xs = new XStream(new JettisonMappedXmlDriver());
			// Naziv tag-a u xml umesto punog naziva klase.
			xs.alias("auto", Automobil.class);
			xs.alias("motor", Motor.class);

			String s = xs.toXML(automobili); // Kao string.
			xs.toXML(automobili, os); // U tok.
			System.out.println(s);

			Automobil[] ucitaniAutomobili = (Automobil[]) xs.fromXML(s);
			System.out.println(ucitaniAutomobili[0]);
			System.out.println(ucitaniAutomobili[1]);

		} finally {
			os.close();
		}

	}

}
