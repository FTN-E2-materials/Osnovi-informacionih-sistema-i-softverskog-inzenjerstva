package rs.ac.uns.ftn.firma;

public class DrzavniPosao {

	public static void main(String[] args) {
		Pausalac p = new Pausalac("Mika", "Mikic", 10, 30000.0, 1.1);
		Direktor generalni = new Direktor("Zika", "Zikica", 100000.0, 1.5, 30000.0);
		Direktor finansijki = new Direktor("Djordje", "Cvarkov", 50000.0, 1.3, 10000.0);
		
		System.out.println(p);
		System.out.println(generalni);
		System.out.println(finansijki);
	}

}
