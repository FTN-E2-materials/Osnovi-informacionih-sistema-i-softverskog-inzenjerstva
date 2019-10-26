package rs.ac.uns.ftn.sortiranje;

import java.util.List;
import java.util.ArrayList;

public class Knjiga {

	private String naziv;

	public Knjiga() {
	}

	public Knjiga(String naziv) {
		this.naziv = naziv;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	
	@Override
	public String toString() {
		return this.getNaziv();
	}
	
	public static void main(String[] args) {
		List<Knjiga> knjige = new ArrayList<>();
		knjige.add(new Knjiga("Tihi Don"));
		knjige.add(new Knjiga("Bela griva"));
		knjige.add(new Knjiga("Hajduk Stanko"));
		
		knjige.sort(new SorterKnjigaNaziv(1));
		for (Knjiga k: knjige) {
			System.out.println(k);
		}
		
		System.out.println();

		knjige.sort(new SorterKnjigaNaziv(-1));
		for (Knjiga k: knjige) {
			System.out.println(k);
		}
		
	}
}
