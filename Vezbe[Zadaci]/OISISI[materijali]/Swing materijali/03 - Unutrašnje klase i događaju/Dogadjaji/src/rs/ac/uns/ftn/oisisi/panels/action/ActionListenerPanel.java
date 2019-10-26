package rs.ac.uns.ftn.oisisi.panels.action;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import rs.ac.uns.ftn.oisisi.listeners.action.MyActionListener1;
import rs.ac.uns.ftn.oisisi.listeners.action.MyActionListener2;

public class ActionListenerPanel extends JPanel {

	private static final long serialVersionUID = 25668997021644702L;

	public ActionListenerPanel() {

		setBorder(new TitledBorder(new EtchedBorder(), "Action Listener"));

		JLabel lblTxtField1 = new JLabel("Unesite tekst i pritisnite ENTER:");
		JTextField txtField1 = new JTextField(20);
		// registrujemo slusaoca dogadjaja
		txtField1.addActionListener(new MyActionListener1());

		Box boxActionListenerTxtField1 = Box.createVerticalBox();
		boxActionListenerTxtField1.add(lblTxtField1);
		boxActionListenerTxtField1.add(txtField1);
		add(boxActionListenerTxtField1);

		JLabel lblTxtField2 = new JLabel("Unesite tekst i pritisnite ENTER:");
		JTextField txtField2 = new JTextField(20);
		// registrujemo slusaoca dogadjaja
		txtField2.addActionListener(new MyActionListener2());

		Box boxActionListenerTxtField2 = Box.createVerticalBox();
		boxActionListenerTxtField2.add(lblTxtField2);
		boxActionListenerTxtField2.add(txtField2);
		add(boxActionListenerTxtField2);

	}

}
