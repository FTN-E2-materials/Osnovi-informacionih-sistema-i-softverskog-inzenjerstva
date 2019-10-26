package rs.ac.uns.ftn.sortiranje;

import java.util.Comparator;

public class SorterKnjigaNaziv implements Comparator<Knjiga> {

	int smer;
	
	public SorterKnjigaNaziv() {
		this.smer = 1;
	}
	
	public SorterKnjigaNaziv(int smer) {
		assert smer == 1 || smer == -1;
		this.smer = smer;
	}
	
	@Override
	public int compare(Knjiga k1, Knjiga k2) {
		return k1.getNaziv().compareTo(k2.getNaziv()) * this.smer;
	}
	

}
