package rs.ac.uns.ftn.krug;

public class Tacka {

	private double x;
	private double y;
	
	public Tacka() {}

	public Tacka(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public double rastojanje(Tacka other) {
		return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
	}
	
	public static void main(String[] args) {
		Tacka koordinatniPocetak = new Tacka(0, 0);
		Tacka t = new Tacka(3, 4);
		System.out.println(koordinatniPocetak.rastojanje(t));
	}
	
}
