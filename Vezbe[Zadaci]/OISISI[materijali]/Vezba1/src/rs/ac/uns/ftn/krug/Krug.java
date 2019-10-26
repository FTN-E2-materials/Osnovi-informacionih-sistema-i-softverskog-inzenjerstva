package rs.ac.uns.ftn.krug;

public class Krug {
	private Tacka centar;
	private double r;
	
	public Krug() {}
	
	public Krug(Tacka centar, double r) {
		super();
		this.centar = centar;
		this.r = r;
	}

	public Tacka getCentar() {
		return centar;
	}

	public void setCentar(Tacka centar) {
		this.centar = centar;
	}

	public double getPoluprecnik() {
		return r;
	}

	public void setPoluprecnik(double r) {
		this.r = r;
	}
	
	public double obim() {
		return 2 * r * Math.PI;
	}
	
	public double povrsina() {
		return r * r * Math.PI;
	}
	
	public boolean obuhvata(Tacka t) {
		// Tacka se nalazi unutar kruga, ukoliko je rastojanje od centra
		// do te tacke manje od poluprecnika ili jednako njemu.
		return this.centar.rastojanje(t) <= this.r;
	}
	
}
