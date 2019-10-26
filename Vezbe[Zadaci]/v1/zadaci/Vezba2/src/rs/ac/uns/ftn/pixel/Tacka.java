package rs.ac.uns.ftn.pixel;

public class Tacka {
	protected double x;
	protected double y;
	
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

	@Override
	public String toString() {
		return String.format("(%f, %f)", x, y);
	}

	@Override
	public boolean equals(Object obj) {
		
		if (obj == null) return false;
		
		// isti objekat u memoriji
		if (obj == this) return true;
		
		if (obj instanceof Tacka) {
			Tacka t = (Tacka) obj;
			// da li imaju iste vrednosti atributa
			return this.x == t.x && this.y == t.y;
		}
		
		return false;
	}
	
	public Tacka deepCopy() {
		return new Tacka(this.x, this.y);
	}
	
	public static void main(String[] args) {
		Tacka t1 = new Tacka(1, 2);
		Tacka t2 = t1;
		Tacka t3 = new Tacka(3, 4);
		Tacka t4 = new Tacka(1, 2);
		Tacka t5 = t1.deepCopy();
		
		System.out.printf("t1: %s\n", t1);
		System.out.printf("t2: %s\n", t2);
		System.out.printf("t3: %s\n", t3);
		System.out.printf("t4: %s\n", t4);
		System.out.printf("t5: %s\n", t5);
		
		System.out.printf("Poredjenje 1: %b\n", t1.equals(null));
		System.out.printf("Poredjenje 2: %b\n", t1.equals(t2));
		System.out.printf("Poredjenje 3: %b\n", t1.equals(t3));
		System.out.printf("Poredjenje 4: %b\n", t1.equals(t4));
		System.out.printf("Poredjenje 5: %b\n", t1.equals("t1"));
		System.out.printf("Poredjenje 6: %b\n", t1.equals(t5));
	}
	
	
}
