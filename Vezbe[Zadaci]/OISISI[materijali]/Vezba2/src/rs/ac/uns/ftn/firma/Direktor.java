package rs.ac.uns.ftn.firma;

public class Direktor extends Osoba implements ObracunPrihoda {

	public double osnovica;
	public double koeficijent;
	public double bonus;
	
	public Direktor() {
		super();
	}
	
	public Direktor(String ime, String prezime, double osnovica, double koeficijent, double bonus) {
		super(ime, prezime);
		this.osnovica = osnovica;
		this.koeficijent = koeficijent;
		this.bonus = bonus;
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

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public double obracunajPlatu() {
		// TODO Auto-generated method stub
		return koeficijent * osnovica + bonus;
	}

	@Override
	public double obracunajPorez() {
		// TODO Auto-generated method stub
		double plata = obracunajPlatu();
		return plata >= 100000.0 ? (plata * 0.4) : (plata * 0.2);
	}
	
	@Override
	public String toString() {
		return String.format("Pausalac: %s, plata: %f, porez: %f", 
				super.toString(), this.obracunajPlatu(), this.obracunajPorez());
	}
	
}
