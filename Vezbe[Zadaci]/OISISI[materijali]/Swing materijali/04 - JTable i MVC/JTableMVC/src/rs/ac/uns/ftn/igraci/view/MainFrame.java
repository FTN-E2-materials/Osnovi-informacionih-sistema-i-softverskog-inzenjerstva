package rs.ac.uns.ftn.igraci.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import rs.ac.uns.ftn.igraci.controller.IgraciController;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 4703527718003660405L;

	private static MainFrame instance = null;

	public static MainFrame getInstance() {
		if (instance == null) {
			instance = new MainFrame();
		}
		return instance;
	}

	private JTable tabelaIgraca;

	public MainFrame() {

		Dimension screenDimension = Toolkit.getDefaultToolkit().getScreenSize();
		setSize(screenDimension.width / 2, screenDimension.height / 2);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		inicijalizujAkcije();
		prikaziTabeluIgraca();
	}

	public void azurirajPrikaz(String akcija, int vrednost) {
		AbstractTableModelIgraci model = (AbstractTableModelIgraci) tabelaIgraca.getModel();
		if (akcija != null) {
			if (akcija.toUpperCase().trim().equals("DODAT")) {
				model.igracDodat();
			} else if (akcija.toUpperCase().trim().equals("UKLONJEN")) {
				model.igracUklonjen(vrednost);
			}
		}
		model.fireTableDataChanged();
		validate();
	}

	private void inicijalizujAkcije() {
		JPanel panelTop = new JPanel();
		JButton btnDodaj = new JButton("Dodaj");
		JButton btnIzbrisi = new JButton("Izbrisi");
		JButton btnIzmeni = new JButton("Izmeni");

		panelTop.add(btnDodaj);
		panelTop.add(btnIzbrisi);
		panelTop.add(btnIzmeni);

		this.add(panelTop, BorderLayout.NORTH);

		btnDodaj.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				IgraciController.getInstance().dodajIgraca();
			}
		});

		btnIzbrisi.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				IgraciController.getInstance().izbrisiIgraca(tabelaIgraca.getSelectedRow());
			}
		});

		btnIzmeni.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				IgraciController.getInstance().izmeniIgraca(tabelaIgraca.getSelectedRow());
			}
		});
	}

	private void prikaziTabeluIgraca() {
		tabelaIgraca = new IgraciJTable();

		JScrollPane scrollPane = new JScrollPane(tabelaIgraca);
		add(scrollPane, BorderLayout.CENTER);

		this.azurirajPrikaz(null, -1);
	}

}
