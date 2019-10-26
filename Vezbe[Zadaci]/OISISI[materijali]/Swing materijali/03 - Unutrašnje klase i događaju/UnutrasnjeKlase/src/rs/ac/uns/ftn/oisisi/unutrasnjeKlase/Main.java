package rs.ac.uns.ftn.oisisi.unutrasnjeKlase;

import rs.ac.uns.ftn.oisisi.unutrasnjeKlase.OuterClass.InnerClass;
import rs.ac.uns.ftn.oisisi.unutrasnjeKlase.OuterClass.StaticInnerClass;

public class Main {

	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		// mora postojati instanca klase OuterClass
		InnerClass innerClass = outerClass.new InnerClass();
		// ne mora postojati instanca klase OuterClass
		StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass();
		// nije instanciranje interface-a, vec anonimne unutrasnje klase
		SayHi anonymousInnerClass = new SayHi() {

			@Override
			public void sayHi() {
				System.out.println("Hi from anonymous class");
			}
		};

		outerClass.sayHi();
		innerClass.sayHi();
		staticInnerClass.sayHi();
		anonymousInnerClass.sayHi();

	}

}
