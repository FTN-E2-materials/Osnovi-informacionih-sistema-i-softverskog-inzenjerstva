package rs.ac.uns.ftn.student;

public class Grad {

	private String naziv;
	private long postanskiBroj;
	
	public Grad() {
		super();
	}

	public Grad(String naziv, long postanskiBroj) {
		this();
		this.naziv = naziv;
		this.postanskiBroj = postanskiBroj;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public long getPostanskiBroj() {
		return postanskiBroj;
	}

	public void setPostanskiBroj(long postanskiBroj) {
		this.postanskiBroj = postanskiBroj;
	}

	@Override
	public String toString() {
		return String.format("(%s, %s)", this.naziv, this.postanskiBroj);
	}
	
}
