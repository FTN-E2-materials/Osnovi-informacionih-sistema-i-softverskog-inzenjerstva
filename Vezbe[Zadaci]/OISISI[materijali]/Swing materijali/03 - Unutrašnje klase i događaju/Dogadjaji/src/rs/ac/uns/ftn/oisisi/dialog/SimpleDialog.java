package rs.ac.uns.ftn.oisisi.dialog;

import java.awt.Frame;

import javax.swing.JDialog;

public class SimpleDialog extends JDialog {

	private static final long serialVersionUID = 3591599721565020284L;

	public SimpleDialog(Frame parent, String title, boolean modal) {
		super(parent, title, modal);

		setSize(250, 250);
		setLocationRelativeTo(parent);

	}

}
