package rs.ac.uns.ftn.oisisi.layoutManagers;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GridBagLayoutFrame extends JFrame {

	private static final long serialVersionUID = -8741929756312676069L;

	public GridBagLayoutFrame() {
		super();
		setTitle("GridLayout Manager");
		Dimension d = getToolkit().getScreenSize();
		setSize(d.width / 2, d.height / 2);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		JPanel panelBottom = new JPanel();
		panelBottom.add(new JButton("OK"));
		panelBottom.add(new JButton("Cancel"));
		this.add(panelBottom, BorderLayout.SOUTH);
		
		JPanel panelCenter = new JPanel();
		panelCenter.setLayout(new GridBagLayout());
		this.add(panelCenter, BorderLayout.CENTER);

		JLabel lblOsnovniPodaci = new JLabel("Osnovni podaci");
		JLabel lblImeIPrezime = new JLabel("Ime i prezime: ");
		JLabel lblIznos = new JLabel("Iznos (RSD): ");
		JLabel lblKomentar = new JLabel("Komentar");
		
		JTextField txtImeIPrezime = new JTextField();
		JTextField txtIznos = new JTextField();
		
		JTextArea txtArea = new JTextArea();
		
		JButton btnMore = new JButton("...");
		
		GridBagConstraints gbcLblOsnovniPodaci = new GridBagConstraints();
		gbcLblOsnovniPodaci.gridx = 0;
		gbcLblOsnovniPodaci.gridy = 0;
		gbcLblOsnovniPodaci.gridwidth = 3;
		gbcLblOsnovniPodaci.insets = new Insets(20, 0, 0, 0);
		panelCenter.add(lblOsnovniPodaci, gbcLblOsnovniPodaci);
		
		GridBagConstraints gbcLblImeIPrezime = new GridBagConstraints();
		gbcLblImeIPrezime.gridx = 0;
		gbcLblImeIPrezime.gridy = 1;
		gbcLblImeIPrezime.insets = new Insets(20, 0, 0,0);
		panelCenter.add(lblImeIPrezime, gbcLblImeIPrezime);
		
		GridBagConstraints gbcTxtImeIPrezime = new GridBagConstraints();
		gbcTxtImeIPrezime.gridx = 1;
		gbcTxtImeIPrezime.gridy = 1;
		gbcTxtImeIPrezime.weightx = 100;
		gbcTxtImeIPrezime.fill = GridBagConstraints.HORIZONTAL;
		gbcTxtImeIPrezime.insets = new Insets(20, 20, 0, 20);
		panelCenter.add(txtImeIPrezime, gbcTxtImeIPrezime);
		
		GridBagConstraints gbcBtnMore = new GridBagConstraints();
		gbcBtnMore.gridx = 2;
		gbcBtnMore.gridy = 1;
		gbcBtnMore.insets = new Insets(20, 0, 0,0);
		panelCenter.add(btnMore, gbcBtnMore);
		
		GridBagConstraints gbcLblIznos = new GridBagConstraints();
		gbcLblIznos.gridx = 0;
		gbcLblIznos.gridy = 2;
		gbcLblIznos.insets = new Insets(20, 0, 0, 0);
		panelCenter.add(lblIznos, gbcLblIznos);
		
		GridBagConstraints gbcTxtIznos = new GridBagConstraints();
		gbcTxtIznos.gridx = 1;
		gbcTxtIznos.gridy = 2;
		gbcTxtIznos.weightx = 100;
		gbcTxtIznos.fill = GridBagConstraints.HORIZONTAL;
		gbcTxtIznos.insets = new Insets(20, 20, 0, 20);
		panelCenter.add(txtIznos, gbcTxtIznos);
		
		
		GridBagConstraints gbcLblKomentar = new GridBagConstraints();
		gbcLblKomentar.gridx = 0;
		gbcLblKomentar.gridy = 3;
		gbcLblKomentar.gridwidth = 3;
		gbcLblKomentar.insets = new Insets(20, 20, 0, 20);
		panelCenter.add(lblKomentar, gbcLblKomentar);
		
		
		GridBagConstraints gbcTxtArea = new GridBagConstraints();
		gbcTxtArea.gridx = 0;
		gbcTxtArea.gridy = 4;
		gbcTxtArea.gridwidth = 3;
		gbcTxtArea.weightx = 100;
		gbcTxtArea.weighty = 100;
		gbcTxtArea.fill = GridBagConstraints.BOTH;
		gbcTxtArea.insets = new Insets(20, 20, 20, 20);
		panelCenter.add(txtArea, gbcTxtArea);
		
		
	}
}
