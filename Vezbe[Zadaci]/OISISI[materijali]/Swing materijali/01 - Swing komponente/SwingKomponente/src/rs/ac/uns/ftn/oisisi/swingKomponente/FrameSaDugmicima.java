package rs.ac.uns.ftn.oisisi.swingKomponente;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;

/*
 * Primer rada sa različitim vrstama dugmadi u swingu
 */
public class FrameSaDugmicima extends JFrame {

	private static final long serialVersionUID = -4332723567861174042L;

	public FrameSaDugmicima() {

		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;
		setSize(screenWidth / 2, screenHeight / 2);
		setTitle("Razne vrste dugmica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		// kreiramo jedan panel i dodajemo ga u JFrame
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		this.add(panel);

		// kreiramo različite vrste dugmadi sa nazivom, bez ikona:
		JButton btn1 = new JButton("JButton 1");
		panel.add(btn1);

		JToggleButton tglBtn1 = new JToggleButton("JToggleButton 1");
		panel.add(tglBtn1);

		JRadioButton radBtn1 = new JRadioButton("JRadioButton 1");
		JRadioButton radBtn2 = new JRadioButton("JRadioButton 2");
		// grupa regulise da samo jedan RadioButton može biti čekiran
		ButtonGroup btnGroup1 = new ButtonGroup();
		btnGroup1.add(radBtn1);
		btnGroup1.add(radBtn2);

		panel.add(radBtn1);
		panel.add(radBtn2);

		JCheckBox checkBox1 = new JCheckBox("JCheckBox");
		panel.add(checkBox1);

		// kreiramo različite vrste dugmadi sa nazivom i ikonama

		Icon icon = new ImageIcon("images/firefox_32x32.jpg");
		// ikona se može dodati kroz konstruktor
		JButton btn2 = new JButton("JButton 2", icon);
		panel.add(btn2);

		icon = new ImageIcon("images/chrome_32x32.jpg");
		// ikona se može dodati kroz set metodu
		JToggleButton tglBtn2 = new JToggleButton("JToggleButton 2", icon);
		panel.add(tglBtn2);

		// kreiramo jedno dugme i dodajemo ga u panel
		JButton lastBtn = new JButton("JButton 1");
		// promena vrednosti komponente
		lastBtn.setBackground(Color.RED);

		lastBtn.setForeground(Color.GREEN);
		lastBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lastBtn.setFont(new Font("TAHOMA", Font.BOLD, 18));

		panel.add(lastBtn);
	}

}
