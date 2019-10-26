/**
 * 
 */
package rs.ac.uns.ftn.oisisi.objectstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

import rs.ac.uns.ftn.oisisi.objectstream.Motor.Tip;

/**
 * @author Danijel
 *
 */
public class ObjectOutputStreamPrimer {

	/**
	 * @param args
	 * @throws IOException
	 * @throws FileNotFoundException
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Motor bmwMotor = new Motor(1.998, 222, "sdgsdkjgkl", Tip.DIZEL);
		Vlasnik vlasnik =new Vlasnik("Petar", "Petrović");
		Automobil bmw320 = new Automobil("320E", 2005, 5, new Date(), bmwMotor, vlasnik);
		Automobil opel = new Automobil("Astra", 2006, 5, new Date(), bmwMotor, vlasnik);
		Automobil[] automobili = new Automobil[] { bmw320, opel };

		//Pisanje.
		File f = new File("objectstream.txt");
		ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f)));
		try {
			oos.writeObject(automobili);
		} finally {
			oos.close(); //Zatvara i tok nizeg nivoa.
		}
		
		//Citanje.
		ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(f)));
		try {
			Automobil[] ucitaniAutomobili = (Automobil[])ois.readObject();
			System.out.println(ucitaniAutomobili[0]);
			System.out.println(ucitaniAutomobili[1]);
			System.out.println();
			System.out.println("Niz == ucitani niz?: " + (automobili == ucitaniAutomobili));
			System.out.println("Niz[0] == ucitani niz[0]?: " + (automobili[0] == ucitaniAutomobili[1]));
			System.out.println("Isti motori?:" + (automobili[0].getMotor() == automobili[1].getMotor()));
			
		} finally {
			ois.close();
		}

	}

}
