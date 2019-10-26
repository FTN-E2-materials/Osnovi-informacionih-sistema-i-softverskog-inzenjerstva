package rs.ac.uns.ftn.enumeracije;

public enum GodisnjeDoba {
	PROLECE, LETO, JESEN, ZIMA;
	
	private String opis[] = {"prolece", "leto", "jesen", "zima"};
	
	@Override
	public String toString() {
		return this.opis[this.ordinal()];
	}
	
}
