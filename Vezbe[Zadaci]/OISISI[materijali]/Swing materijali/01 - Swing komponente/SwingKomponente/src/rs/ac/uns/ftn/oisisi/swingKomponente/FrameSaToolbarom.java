package rs.ac.uns.ftn.oisisi.swingKomponente;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

/*
 * Primer korišćenja toolbar-a
 */
public class FrameSaToolbarom extends JFrame {

	private static final long serialVersionUID = -2505800516440747620L;

	public FrameSaToolbarom() {

		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;
		setSize(screenWidth / 2, screenHeight / 2);
		setTitle("Primer 7 - korišćenje toolbara aplikacije");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		// kreiranje naslednika klase JMenuBar i njeno postavljanje u glavni prozor
		// aplikacije
		MyMenuBar menu = new MyMenuBar();
		this.setJMenuBar(menu);

		// kreiramo instancu klase Toolbar
		MyToolbar toolbar = new MyToolbar();
		// dodajemo u Frame naš Toolbar, klasa BorderLayout se odnosi na rad sa
		// prostorim rasporedom
		// komponenti, za sada je dovoljno znati da na ovaj način Toolbar se postavlja
		// na vrh glavne forme
		add(toolbar, BorderLayout.NORTH);

	}

}
