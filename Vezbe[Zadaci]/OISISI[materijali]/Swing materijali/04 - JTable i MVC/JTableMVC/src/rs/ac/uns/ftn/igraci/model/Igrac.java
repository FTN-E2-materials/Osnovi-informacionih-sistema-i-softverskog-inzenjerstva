package rs.ac.uns.ftn.igraci.model;

public class Igrac {
	
	private long id;
	private String ime;
	private String prezime;
	private String klub;
	
	public Igrac() {}

	public Igrac(long id, String ime, String prezime, String klub) {
		super();
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.klub = klub;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getKlub() {
		return klub;
	}

	public void setKlub(String klub) {
		this.klub = klub;
	}


}
