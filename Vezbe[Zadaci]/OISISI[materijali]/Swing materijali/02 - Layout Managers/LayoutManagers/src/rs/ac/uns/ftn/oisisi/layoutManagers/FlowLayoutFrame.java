package rs.ac.uns.ftn.oisisi.layoutManagers;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class FlowLayoutFrame extends JFrame {

	private static final long serialVersionUID = 2442132164970220096L;

	public FlowLayoutFrame(String param) {
		super();
		setTitle("FlowLayout Manager");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);

		// postavljanje menadžera rasporeda pozivom metode setLayout i prosleđivanjem
		// novog objekta tipa FlowLayout
		if (param.equals("1a"))
			setLayout(new FlowLayout());
		else if (param.equals("1b"))
			setLayout(new FlowLayout(FlowLayout.LEFT));
		else if (param.equals("1c"))
			setLayout(new FlowLayout(FlowLayout.LEFT, 50, 50));

		for (int i = 0; i < 30; i++) {
			JButton btn = new JButton("" + i);
			if (i % 2 == 0) {
				// FlowLayout poštuje preferirane veličine komponenata koje se stavljaju u
				// kontejner
				btn.setPreferredSize(new Dimension(100, 100));
			}

			add(btn);
			validate();

			try {
				// zaustavlja izvršavanje programa za 700 milisekundi(0.7 s)
				Thread.sleep(500);
			} catch (Exception e) {

			}

		}

	}

}
