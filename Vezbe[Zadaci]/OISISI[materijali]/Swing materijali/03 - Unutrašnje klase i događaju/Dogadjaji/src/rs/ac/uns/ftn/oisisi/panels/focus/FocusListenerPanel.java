package rs.ac.uns.ftn.oisisi.panels.focus;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import rs.ac.uns.ftn.oisisi.listeners.focus.MyFocusListener;

public class FocusListenerPanel extends JPanel {

	private static final long serialVersionUID = 7826375022683547554L;

	public FocusListenerPanel() {

		super(new BorderLayout());
		setBorder(new TitledBorder(new EtchedBorder(), "Focus Listener"));
		setBackground(new Color(254, 254, 208));

		Dimension dim = new Dimension(120, 20);
		MyFocusListener focusListener = new MyFocusListener();

		JPanel panPrezime = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panPrezime.setBackground(new Color(254, 254, 208));

		JLabel lblPrezime = new JLabel("Prezime*:");
		lblPrezime.setPreferredSize(dim);
		JTextField txtPrezime = new JTextField();
		txtPrezime.setPreferredSize(dim);
		txtPrezime.setName("txtPrezime");
		txtPrezime.setBackground(Color.GRAY);
		txtPrezime.addFocusListener(focusListener);

		panPrezime.add(lblPrezime);
		panPrezime.add(txtPrezime);

		JPanel panIme = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panIme.setBackground(new Color(254, 254, 208));
		JLabel lblIme = new JLabel("Ime:");
		lblIme.setPreferredSize(dim);
		JTextField txtIme = new JTextField();
		txtIme.setBackground(Color.GRAY);
		txtIme.setName("txtIme");
		txtIme.addFocusListener(focusListener);
		txtIme.setPreferredSize(dim);
		panIme.add(lblIme);
		panIme.add(txtIme);

		JPanel panAdresa = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panAdresa.setBackground(new Color(254, 254, 208));
		JLabel lblAdresa = new JLabel("Adresa:");
		lblAdresa.setPreferredSize(dim);
		JTextField txtAdresa = new JTextField();
		txtAdresa.setBackground(Color.GRAY);
		txtAdresa.setName("txtAdresa");
		txtAdresa.addFocusListener(focusListener);
		txtAdresa.setPreferredSize(dim);
		panAdresa.add(lblAdresa);
		panAdresa.add(txtAdresa);

		Box boxCentar = Box.createVerticalBox();
		boxCentar.add(Box.createVerticalStrut(20));
		boxCentar.add(panPrezime);
		boxCentar.add(panIme);
		boxCentar.add(panAdresa);
		boxCentar.add(Box.createGlue());
		add(boxCentar, BorderLayout.NORTH);

	}

}
