package rs.ac.uns.ftn.enumeracije;

public class TestGodisnjaDoba {

	public static void main(String[] args) {
		GodisnjeDoba gd = GodisnjeDoba.PROLECE;
		System.out.println("Trenutno je " + gd);
	
		System.out.println(GodisnjeDoba.LETO.ordinal());
		
		for(GodisnjeDoba doba: GodisnjeDoba.values()) {
			System.out.println(doba);
		}
	}
	
}
