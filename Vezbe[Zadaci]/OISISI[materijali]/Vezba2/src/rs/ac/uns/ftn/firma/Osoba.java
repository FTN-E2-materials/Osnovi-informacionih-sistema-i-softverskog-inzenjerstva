package rs.ac.uns.ftn.firma;

public class Osoba {

	protected String ime;
	protected String prezime;
	
	public Osoba() {}

	public Osoba(String ime, String prezime) {
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
		return String.format("%s, %s", this.ime, this.prezime);
	}
	
}
