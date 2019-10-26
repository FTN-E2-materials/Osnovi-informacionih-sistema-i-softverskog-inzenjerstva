/**
 * 
 */
package rs.ac.uns.ftn.oisisi.objectstream;

import java.io.IOException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Date;

/**
 * @author Danijel
 *
 */
public class Automobil implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7961803530405751475L;

	private String model;
	private int godište;
	private int brojVrata;
	private Date datumProizvodnje;
	private Motor motor;

	private transient Vlasnik vlasnik;

	public Automobil(String model, int godište, int brojVrata, Date datumProizvodnje, Motor motor, Vlasnik vlasnik) {
		super();
		this.model = model;
		this.godište = godište;
		this.brojVrata = brojVrata;
		this.datumProizvodnje = datumProizvodnje;
		this.motor = motor;
		this.vlasnik = vlasnik;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getGodište() {
		return godište;
	}

	public void setGodište(int godište) {
		this.godište = godište;
	}

	public int getBrojVrata() {
		return brojVrata;
	}

	public void setBrojVrata(int brojVrata) {
		this.brojVrata = brojVrata;
	}

	public Date getDatumProizvodnje() {
		return datumProizvodnje;
	}

	public void setDatumProizvodnje(Date datumProizvodnje) {
		this.datumProizvodnje = datumProizvodnje;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Vlasnik getVlasnik() {
		return vlasnik;
	}

	public void setVlasnik(Vlasnik vlasnik) {
		this.vlasnik = vlasnik;
	}

	@Override
	public String toString() {
		return "Automobil [model=" + model + ", godište=" + godište + ", brojVrata=" + brojVrata + ", datumProizvodnje="
				+ datumProizvodnje + ", motor=" + motor + ", vlasnik=" + vlasnik + "]";
	}

	// Metodu nije potrebno navesti.
	private void writeObject(java.io.ObjectOutputStream out) throws IOException {
		// Neki dodatni posao upisa u datoteku.
		Date now = new Date();
		out.writeObject(now);

		// Default serijalizacija this objekta
		out.defaultWriteObject();

	}

	// Metodu nije potrebno navesti.
	private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
		Date d = (Date) in.readObject();
		System.out.println("Vreme upisa datoteke je bilo: " + d);

		in.defaultReadObject();
	}

	// Metodu nije potrebno navesti.
	private Object writeReplace() throws ObjectStreamException {
		// Mozete zameniti da se ne serijalizuje ovaj objekat nego neki drugi
		// Ili mozda objekat potklase ili malo izmenjeni objekat
		return this;
	}

	// Metodu nije potrebno navesti.
	private Object readResolve() throws ObjectStreamException {
		this.vlasnik = new Vlasnik("Petar", "Petrović");
		// Mozete vratiti bilo sta i objekat bilo koje klase.
		// I to ce predstavljati krajnji rezultat citanja objekta iz datoteke.
		return this;
	}

}
