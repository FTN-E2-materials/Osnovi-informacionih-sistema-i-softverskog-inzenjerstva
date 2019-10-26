package rs.ac.uns.ftn.oisisi.swingKomponente;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class FrameOsnovno extends JFrame {

	private static final long serialVersionUID = -8794233313911790575L;

	public FrameOsnovno() {
		
			Toolkit kit = Toolkit.getDefaultToolkit();
	        Dimension screenSize = kit.getScreenSize();
	        int screenHeight = screenSize.height;
	        int screenWidth = screenSize.width;
	        // Podesavamo dimenzije prozora na polovinu dimenzija ekrana
	        setSize(screenWidth / 2, screenHeight / 2);
	        //Podesavamo naslov
	        setTitle("Prva GUI aplikacija");
	        //Postavljamo akciju pri zatvaranju prozora
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        //postavljamo JFrame na centar ekrana
	        setLocationRelativeTo(null);
	        // postavljamo boju pozadine
	        getContentPane().setBackground(Color.LIGHT_GRAY);
	        
	  }

}
