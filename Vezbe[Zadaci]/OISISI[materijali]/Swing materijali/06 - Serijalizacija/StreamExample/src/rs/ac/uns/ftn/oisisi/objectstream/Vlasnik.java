/**
 * 
 */
package rs.ac.uns.ftn.oisisi.objectstream;

/**
 * @author Danijel
 *
 */
public class Vlasnik {

	private String ime;
	private String prezime;

	public Vlasnik(String ime, String prezime) {
		super();
		this.ime = ime;
		this.prezime = prezime;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	@Override
	public String toString() {
		return "Vlasnik [ime=" + ime + ", prezime=" + prezime + "]";
	}

}
