package rs.ac.uns.ftn.pixel;

public class Pixel extends Tacka{
	protected String boja;
	
	public Pixel() {
		super();
	}
	
	public Pixel(double x, double y, String boja) {
		// instanciranje roditeljske klase
		super(x, y);
		// prosirivanje stanja objekta roditeljske klase
		this.boja = boja;
	}
	
	

	public String getBoja() {
		return boja;
	}

	public void setBoja(String boja) {
		this.boja = boja;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s, %s", super.toString(), this.boja);
	}

	@Override
	public boolean equals(Object obj) {
		if (super.equals(obj)) {
			if (obj instanceof Pixel) {
				return this.boja.equals(((Pixel)obj).getBoja());
			}
		}
		return false;
	}

	@Override
	public Tacka deepCopy() {
		// TODO Auto-generated method stub
		return new Pixel(this.x, this.y, this.boja);
	}

	public static void main(String[] args) {
		Pixel p1 = new Pixel(1, 2, "plava");
		Tacka p2 = p1;
		Tacka p3 = new Pixel(3, 4, "crvena");
		Tacka p4 = new Pixel(1, 2, "crvena");
		Tacka p5 = p1.deepCopy();
		
		System.out.printf("p1: %s\n", p1);
		System.out.printf("p2: %s\n", p2);
		System.out.printf("p3: %s\n", p3);
		System.out.printf("p4: %s\n", p4);
		System.out.printf("p5: %s\n", p5);
		
		System.out.printf("Poredjenje 1: %b\n", p1.equals(null));
		System.out.printf("Poredjenje 2: %b\n", p1.equals(p2));
		System.out.printf("Poredjenje 3: %b\n", p1.equals(p3));
		System.out.printf("Poredjenje 4: %b\n", p1.equals(p4));
		System.out.printf("Poredjenje 5: %b\n", p1.equals("p1"));
		System.out.printf("Poredjenje 6: %b\n", p1.equals(p5));
		System.out.printf("Poredjenje 7: %b\n", p1.equals(new Tacka(p1.getX(), p1.getY())));
	}

}
