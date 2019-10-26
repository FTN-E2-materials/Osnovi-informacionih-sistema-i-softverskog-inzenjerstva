package rs.ac.uns.ftn.igraci.controller;

import rs.ac.uns.ftn.igraci.model.BazaIgraca;
import rs.ac.uns.ftn.igraci.model.Igrac;
import rs.ac.uns.ftn.igraci.view.MainFrame;

public class IgraciController {

	private static IgraciController instance = null;
	
	public static IgraciController getInstance() {
		if (instance == null) {
			instance = new IgraciController();
		}
		return instance;
	}
	
	private IgraciController() {}
	
	public void dodajIgraca() {
		// izmena modela
		BazaIgraca.getInstance().dodajIgraca("Zucko", "Korac", "OKK Beograd");
		// azuriranje prikaza
		MainFrame.getInstance().azurirajPrikaz("DODAT", -1);
	}
	
    public void izbrisiIgraca(int rowSelectedIndex) {
    	if (rowSelectedIndex < 0) {
			return;
		}
    	// izmena modela
    	Igrac igrac = BazaIgraca.getInstance().getRow(rowSelectedIndex);
		BazaIgraca.getInstance().izbrisiIgraca(igrac.getId());
		// azuriranje prikaza
		MainFrame.getInstance().azurirajPrikaz("UKLONJEN", rowSelectedIndex);
    }
	
	public void izmeniIgraca(int rowSelectedIndex) {
		if (rowSelectedIndex < 0) {
			return;
		}
		// izmena modela
		Igrac igrac = BazaIgraca.getInstance().getRow(rowSelectedIndex);
		BazaIgraca.getInstance().izmeniIgraca(igrac.getId(), "Radivoj", "Korac", "OKK Beograd");
		// TODO: izmena dodatnih polja modela tabele
		
		// azuriranje prikaza
		MainFrame.getInstance().azurirajPrikaz(null, -1);
	}
	
	
	
}
