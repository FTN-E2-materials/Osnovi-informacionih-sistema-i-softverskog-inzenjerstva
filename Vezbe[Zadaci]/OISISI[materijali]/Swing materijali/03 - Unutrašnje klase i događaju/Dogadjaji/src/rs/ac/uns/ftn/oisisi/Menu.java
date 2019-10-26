package rs.ac.uns.ftn.oisisi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

import rs.ac.uns.ftn.oisisi.dialog.HideDialog;
import rs.ac.uns.ftn.oisisi.dialog.SimpleDialog;
import rs.ac.uns.ftn.oisisi.listeners.action.MyActionListener1;

public class Menu extends JMenuBar {

	private static final long serialVersionUID = -4993387552790893124L;
	//private JFrame parent = null;
	private HideDialog hideDialog = null;

	/*
	 * u konstruktoru menija ocekuje se referenca na glavni prozor aplikacije u kome
	 * ce se nalaziti Menu
	 */
	public Menu(final JFrame parent) {
		//this.parent = parent;

		JMenu mnuFile = new JMenu("File");
		// Mnemonik
		mnuFile.setMnemonic(KeyEvent.VK_F);

		// deo za rad sa ActionListener-om
		JMenuItem mniNew = new JMenuItem("New");
		// precica (akcelerator)
		mniNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.ALT_MASK + ActionEvent.SHIFT_MASK));
		mnuFile.add(mniNew);
		// registrujemo slusaoca dogadjaja
		mniNew.addActionListener(new MyActionListener1());
		add(mnuFile);

		// deo za rad sa dijalozima>>>>
		JMenu mnuDialog = new JMenu("Dijalozi");
		// primer modalnog dijaloga
		JMenuItem mniModalDialog = new JMenuItem("Modalni dijalog");
		mniModalDialog.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				SimpleDialog dialog = new SimpleDialog(parent, "Primer modalnog prozora", true);
				dialog.setVisible(true);

			}
		});
		mnuDialog.add(mniModalDialog);

		// primer kreiranja nemodalnog dijaloga
		JMenuItem mniUnmodalDialog = new JMenuItem("Nemodalni dijalog");
		mniUnmodalDialog.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				SimpleDialog dialog = new SimpleDialog(parent, "Primer nemodalnog dijaloga", false);
				dialog.setVisible(true);

			}
		});
		mnuDialog.add(mniUnmodalDialog);

		mnuDialog.addSeparator();

		// primer dijaloga koji se samo skriva
		JMenuItem mniHideDialog = new JMenuItem("Dijalog koji se samo skriva prilikom zatvaranja");
		mniHideDialog.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// samo prvi put ce hideDialog biti jednak null
				if (hideDialog == null) {
					hideDialog = new HideDialog(parent);
				}
				hideDialog.setVisible(true);
				if (hideDialog.getMode() == HideDialog.OK) {
					JOptionPane.showMessageDialog(null, "Uneli ste:" + hideDialog.getArea().getText());
				}

			}
		});
		mnuDialog.add(mniHideDialog);

		mnuDialog.addSeparator();

		add(mnuDialog);
	}

}
