package rs.ac.uns.ftn.oisisi.swingKomponente;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;

public class MyToolbar extends JToolBar {

	private static final long serialVersionUID = 1209699209668701828L;

	public MyToolbar() {
		// u konstruktor natklase, tj kalse JToolbar prosleđuje
		// se orijentacija toolbar-a, moguća i sa konstantom: SwingConstants.VERTICAL
		super(SwingConstants.HORIZONTAL);
		
		JButton btnNew = new JButton();
		btnNew.setToolTipText("New");
		btnNew.setIcon(new ImageIcon("images/new_22x22.jpg"));
		add(btnNew);

		addSeparator();

		JButton btnOpen = new JButton();
		btnOpen.setToolTipText("Open");
		btnOpen.setIcon(new ImageIcon("images/open_22x22.jpg"));
		add(btnOpen);

		addSeparator();

		JToggleButton tglBtnBold = new JToggleButton();
		tglBtnBold.setToolTipText("Bold");
		tglBtnBold.setIcon(new ImageIcon("images/bold_22x22.jpg"));
		add(tglBtnBold);

		// toolbar je pokretljiv, probati i sa statičnim toolbarom
		setFloatable(true);
		setBackground(new Color(255, 255, 204));

	}

}
