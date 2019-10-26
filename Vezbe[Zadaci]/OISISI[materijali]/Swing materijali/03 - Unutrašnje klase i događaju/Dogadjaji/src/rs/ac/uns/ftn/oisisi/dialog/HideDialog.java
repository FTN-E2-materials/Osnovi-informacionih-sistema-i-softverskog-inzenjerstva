package rs.ac.uns.ftn.oisisi.dialog;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class HideDialog extends JDialog implements ActionListener {

	private static final long serialVersionUID = -514322840576145538L;

	public static final int OK = 0;
	public static final int CANCEL = 1;

	private int mode = 1;
	private JTextArea area;

	public HideDialog(JFrame parent) {
		super(parent, "Dijalog koji se samo skriva!!!", true);
		mode = HideDialog.CANCEL;
		setLayout(new BorderLayout());

		setSize(450, 250);
		setLocationRelativeTo(parent);

		JLabel lbl = new JLabel("Unesite tekst, zatvorite dijalog i kada ga ponovo otvorite tekst će biti tu!!");
		area = new JTextArea(10, 10);

		JPanel panCommands = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(this);
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addActionListener(this);

		panCommands.add(btnOk);
		panCommands.add(btnCancel);

		add(lbl, BorderLayout.NORTH);
		add(new JScrollPane(area), BorderLayout.CENTER);
		add(panCommands, BorderLayout.SOUTH);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getActionCommand().equals("OK")) {
			mode = HideDialog.OK;
		} else {
			mode = HideDialog.CANCEL;
		}
		setVisible(false);

	}

	public int getMode() {
		return mode;
	}

	public void setMode(int mode) {
		this.mode = mode;
	}

	public JTextArea getArea() {
		return area;
	}

	public void setArea(JTextArea area) {
		this.area = area;
	}

}
