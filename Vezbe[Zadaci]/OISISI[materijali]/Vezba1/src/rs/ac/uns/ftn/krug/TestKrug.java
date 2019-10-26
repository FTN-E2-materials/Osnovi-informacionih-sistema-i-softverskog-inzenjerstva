package rs.ac.uns.ftn.krug;

public class TestKrug {

	public static void main(String[] args) {
		
		Krug k1 = new Krug(new Tacka(0, 0), 5);
		Tacka t1 = new Tacka(1, 1);
		Tacka t2 = new Tacka(3, 4);
		Tacka t3 = new Tacka(10, 10);
		System.out.printf("Iskaz: \"Tacka t1 se nalazi unutar kruga\" je: %b\n", k1.obuhvata(t1));
		System.out.printf("Iskaz: \"Tacka t1 se nalazi unutar kruga\" je: %b\n", k1.obuhvata(t2));
		System.out.printf("Iskaz: \"Tacka t1 se nalazi unutar kruga\" je: %b\n", k1.obuhvata(t3));
	}

}
