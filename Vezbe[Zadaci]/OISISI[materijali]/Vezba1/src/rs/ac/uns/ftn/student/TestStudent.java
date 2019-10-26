package rs.ac.uns.ftn.student;

import java.util.ArrayList;
import java.util.List;

public class TestStudent {

	public static void main(String[] args) {
		Student nizStudenata[] = new Student[3];
		// instanciranje objekata klase student
		Student s1 = new Student("RA 1/1995", "Mika", "Mikic", new Grad("Novi Sad", 21000L));
		Student s2 = new Student("RA 2/1995", "Zika", "Zikic", new Grad("Beograd", 11000L));
		Student s3 = new Student("RA 3/1995", "Pera", "Peric", new Grad("Sabac", 15000L));
		// dodavanje studenata u staticki definisan niz
		nizStudenata[0] = s1;
		nizStudenata[1] = s2;
		nizStudenata[2] = s3;
		
		System.out.println("Prikaz sadrzaja staticki definisanog niza");
		for (int i = 0; i < nizStudenata.length; i++) {
			System.out.printf("%d, %s\n", i + 1, nizStudenata[i]);
		}

		// dodavanje studenata u dinamicki niz (ArrayList)
		List<Student> listaStudenata = new ArrayList<Student>();
		listaStudenata.add(s1);
		listaStudenata.add(s2);
		listaStudenata.add(s3);
		
		System.out.println("\n\n\nPrikaz sadrzaja liste");
		for(Student s: listaStudenata) {
			System.out.printf("%d, %s\n", listaStudenata.indexOf(s) + 1, s);		
		}
		
	}

}
