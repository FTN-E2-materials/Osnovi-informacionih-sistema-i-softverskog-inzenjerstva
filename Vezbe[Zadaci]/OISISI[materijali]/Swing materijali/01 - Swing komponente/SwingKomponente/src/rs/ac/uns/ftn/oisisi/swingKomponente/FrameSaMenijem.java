package rs.ac.uns.ftn.oisisi.swingKomponente;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

/*
 * Primer korišćenja menija 
 */
public class FrameSaMenijem extends JFrame {

	private static final long serialVersionUID = 2593300780354379674L;

	public FrameSaMenijem() {

		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;
		setSize(screenWidth / 2, screenHeight / 2);
		setTitle("Primer 6 - korišćenje menija");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		// kreiranje naslednika klase JMenuBar i njeno postavljanje u glavni prozor
		// aplikacije
		MyMenuBar menu = new MyMenuBar();
		this.setJMenuBar(menu);

	}

}
