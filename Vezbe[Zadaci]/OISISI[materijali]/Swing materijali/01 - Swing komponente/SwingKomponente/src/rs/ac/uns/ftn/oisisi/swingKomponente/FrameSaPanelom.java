package rs.ac.uns.ftn.oisisi.swingKomponente;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * Primer korišćenja klase JPanel u kome se nalazi
 * integrisana slika pozadine
 */
public class FrameSaPanelom extends JFrame {

	private static final long serialVersionUID = -7910349483029474575L;

	public FrameSaPanelom() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;
		setSize(screenWidth / 2, screenHeight / 2);
		setTitle("Primer 3 - klasa JPanel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		// kreiramo jedan panel i dodajemo ga u JFrame
		ImagePanel panel = new ImagePanel(new ImageIcon("images/ftn-logo.png").getImage());
		this.add(panel);

	}

	/*
	 * klasa ImagePanel je unutrašnja klasa klase Frame3 i predstavlja u stvari
	 * panel
	 */
	class ImagePanel extends JPanel {
		
		private static final long serialVersionUID = -913549961315147911L;
		
		private Image img;

		public ImagePanel(String img) {
			this(new ImageIcon(img).getImage());
		}

		public ImagePanel(Image img) {
			this.img = img;
		}

		/*
		 * metoda paintComponent se redefinise iz nasledjene klase i ona ce biti
		 * zaduzena da iscrta zadatu sliku na pozadini JPanel-a
		 */
		public void paintComponent(Graphics g) {
			g.drawImage(img, (int) (this.getSize().getWidth() - img.getWidth(null)) / 2,
					(int) (this.getSize().getHeight() - img.getHeight(null)) / 2, null);
		}
	}

}
