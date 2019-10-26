package rs.ac.uns.ftn.igraci;

import rs.ac.uns.ftn.igraci.controller.IgraciController;
import rs.ac.uns.ftn.igraci.model.BazaIgraca;
import rs.ac.uns.ftn.igraci.view.MainFrame;

public class MainApp {

	public static void main(String[] args) {
		BazaIgraca.getInstance();
		IgraciController.getInstance();
		MainFrame.getInstance();
	}
	
}
