package rs.ac.uns.ftn.student;

public class Student {
	
	private String indeks;
	private String ime;
	private String prezime;
	private Grad grad;
	
	public Student() {
		super();
	}
	
	public Student(String indeks, String ime, String prezime, Grad grad) {
		super();
		this.indeks = indeks;
		this.ime = ime;
		this.prezime = prezime;
		this.grad = grad;
	}

	public String getIndeks() {
		return indeks;
	}

	public void setIndeks(String indeks) {
		this.indeks = indeks;
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

	public Grad getGrad() {
		return grad;
	}

	public void setGrad(Grad grad) {
		this.grad = grad;
	}

	// neophodno kako bismo mogli da ispisemo vrednosti objekta
	@Override
	public String toString() {
		return String.format("%s, %s, %s, %s", this.indeks, this.ime, this.prezime, this.grad);
	}

}
