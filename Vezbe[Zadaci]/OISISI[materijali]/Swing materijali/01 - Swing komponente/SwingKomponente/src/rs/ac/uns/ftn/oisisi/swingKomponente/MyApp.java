package rs.ac.uns.ftn.oisisi.swingKomponente;

public class MyApp {

	/*
	 * u argumentu args nalaze se vrednosti unete u delu Run->Run
	 * configurations->Arguments->Program arguments U slučaju potrebe za većim
	 * brojem ulaznih parametara, unose se odvojeni sa "parametar1" "parametar2"
	 */
	public static void main(String[] args) {

		// provera da li uopste postoji uneta vrednost ulaznog argumenta
		if (args.length != 0) {

			int param = 0;
			String arg0 = args[0];
			try {
				param = Integer.parseInt(arg0);
			} catch (Exception e) {
				System.out.println("Neispravna vrednost ulaznog parametra");
				System.exit(0);
			}
			
			switch (param) {
			case 1:// Primer uopštenog korišćenja kontejnera
				FrameOsnovno frame1 = new FrameOsnovno();
				frame1.setVisible(true);
				break;
			case 2: // Primer rada sa panelom u kome se nalazi integrisan logo aplikacije
				FrameSaPanelom frame2 = new FrameSaPanelom();
				frame2.setVisible(true);
				break;
			case 3: // Primer rada sa dugmadima
				FrameSaDugmicima frame3 = new FrameSaDugmicima();
				frame3.setVisible(true);
				break;
			case 4: // Primer rada sa labelom:
				FrameSaTekstom frame4 = new FrameSaTekstom();
				frame4.setVisible(true);
				break;
			case 5: // Primer rada sa glavnim menijem forme
				FrameSaMenijem frame5 = new FrameSaMenijem();
				frame5.setVisible(true);
				break;
			case 6:
				FrameSaToolbarom frame6 = new FrameSaToolbarom();
				frame6.setVisible(true);
				break;

			default:
				System.out.println("Uneli ste nepostojeću vrednost!");
				break;
			}
		} else {

			System.out.println("Niste uneli vrednost ulaznog parametra!");

		}

	}

}
