package rs.ac.uns.ftn.figura;

import rs.ac.uns.ftn.pixel.Tacka;

public class Krug extends Figura {
	
	private Tacka centar;
	private double r;
	
	public Krug() {
		super();
	}
	
	public Krug(Tacka centar, double r) {
		this.centar = centar;
		this.r = r;
	}
	
	

	public Tacka getCentar() {
		return centar;
	}

	public void setCentar(Tacka centar) {
		this.centar = centar;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	@Override
	public double izracunajObim() {
		// TODO Auto-generated method stub
		return 2 * r * Math.PI;
	}

	@Override
	public double izracunajPovrsinu() {
		// TODO Auto-generated method stub
		return r * r * Math.PI;
	}

	public static void main(String[] args) {
		Krug k = new Krug(new Tacka(0, 0), 5.0);
		System.out.printf("O: %f, P: %f\n", k.izracunajObim(), k.izracunajPovrsinu());
		// Sta ce biti ako se linija ispod otkomentarise
		//Figura f = new Figura();
	}
	
}
