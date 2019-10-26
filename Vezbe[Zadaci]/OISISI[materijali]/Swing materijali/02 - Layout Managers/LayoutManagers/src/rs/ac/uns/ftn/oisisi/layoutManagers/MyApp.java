package rs.ac.uns.ftn.oisisi.layoutManagers;

import javax.swing.JFrame;

public class MyApp {

	public MyApp() {
		super();
	}

	public static void main(String[] args) {

		// provera da li uopste postoji uneta vrednost ulaznog argumenta
		if (args.length != 0) {

			String param1 = args[0];
			JFrame mainFrame = null;

			if (param1.equals("1a") || param1.equals("1b") || param1.equals("1c")) {
				// primeri za flow layout sa različitim poravnanjem
				mainFrame = new FlowLayoutFrame(param1);
			} else if (param1.equals("2a") || param1.equals("2b")) {
				// primeri za border layout
				mainFrame = new BorderLayoutFrame(param1);
			} else if (param1.equals("3a") || param1.equals("3b")) {
				// primer grid layout-a
				mainFrame = new GridLayoutFrame(param1);
			} else if (param1.equals("4")) {
				mainFrame = new BoxLayoutFrame();
			} else if (param1.equals("5")) {
				mainFrame = new GridBagLayoutFrame();
			} else if (param1.equals("6")) {
				mainFrame = new Zadatak();
			} else {
				System.out.println("Neodgovarajuca vrednost argumenta komandne linije.");
			}

			mainFrame.setVisible(true);

		} else {

			System.out.println("Niste uneli vrednost ulaznog parametra!");

		}

	}

}
