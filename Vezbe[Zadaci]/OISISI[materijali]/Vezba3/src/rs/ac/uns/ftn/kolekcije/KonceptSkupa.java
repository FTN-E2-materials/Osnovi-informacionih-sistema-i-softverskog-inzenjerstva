package rs.ac.uns.ftn.kolekcije;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class KonceptSkupa {
	
	public static void main(String[] args) {
		Set<String> imena;
		
		imena = new HashSet<String>();
		//imena = new LinkedHashSet<String>();
		//imena = new TreeSet<String>();
		
		imena.add("Marko");
		imena.add("Janko");
		imena.add("Marko");
		imena.add("Branko");
		Iterator<String> it = imena.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
