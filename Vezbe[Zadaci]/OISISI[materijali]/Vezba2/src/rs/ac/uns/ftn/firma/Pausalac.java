package rs.ac.uns.ftn.firma;

public class Pausalac extends Osoba implements ObracunPrihoda{

	int godineStaza;
	double osnovica;
	double koeficijent;
	
	public Pausalac() {
		super();
	}
	
	public Pausalac(String ime, String prezime, int godineStaza, double osnovica, double koeficijent) {
		super(ime, prezime);
		this.godineStaza = godineStaza;
		this.osnovica = osnovica;
		this.koeficijent = koeficijent;
	}

	public int getGodineStaza() {
		return godineStaza;
	}

	public void setGodineStaza(int godineStaza) {
		this.godineStaza = godineStaza;
	}

	public double getOsnovica() {
		return osnovica;
	}

	public void setOsnovica(double osnovica) {
		this.osnovica = osnovica;
	}

	public double getKoeficijent() {
		return koeficijent;
	}

	public void setKoeficijent(double koeficijent) {
		this.koeficijent = koeficijent;
	}

	@Override
	public double obracunajPlatu() {
		return (koeficijent + 0.01 * godineStaza) * osnovica;
	}

	@Override
	public double obracunajPorez() {
		return obracunajPlatu() * 0.2;
	}

	@Override
	public String toString() {
		return String.format("Pausalac: %s, plata: %f, porez: %f", 
				super.toString(), this.obracunajPlatu(), this.obracunajPorez());
	}
	

}
