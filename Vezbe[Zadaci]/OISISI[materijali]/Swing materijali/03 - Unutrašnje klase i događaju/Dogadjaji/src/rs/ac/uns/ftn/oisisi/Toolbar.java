package rs.ac.uns.ftn.oisisi;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

import rs.ac.uns.ftn.oisisi.listeners.action.MyActionListener1;

public class Toolbar extends JToolBar {

	private static final long serialVersionUID = -5707394191276063225L;

	public Toolbar() {

		super(JToolBar.HORIZONTAL);
		setFloatable(false);

		JButton btnNew = new JButton();
		// registrujemo slusaoca dogadjaja
		btnNew.addActionListener(new MyActionListener1());
		btnNew.setActionCommand("New");
		btnNew.setIcon(new ImageIcon("images/icons/new_16x16.jpg"));

		btnNew.setToolTipText("New");
		add(btnNew);

	}

}
