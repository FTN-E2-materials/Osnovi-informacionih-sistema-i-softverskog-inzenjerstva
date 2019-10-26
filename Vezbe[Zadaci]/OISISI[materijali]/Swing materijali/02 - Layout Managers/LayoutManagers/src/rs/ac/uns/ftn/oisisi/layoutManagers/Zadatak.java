package rs.ac.uns.ftn.oisisi.layoutManagers;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Zadatak extends JFrame {

	private static final long serialVersionUID = -2579878407822026190L;

	public Zadatak() {
		super();
		setTitle("Zadatak termin 3");
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);

		JPanel panTop = new JPanel();
		panTop.setPreferredSize(new Dimension(100, 30));
		panTop.setBackground(Color.LIGHT_GRAY);
		panTop.add(new JLabel("Ovo je obična labela"));

		JPanel panLeft = new JPanel(new BorderLayout());
		panLeft.setPreferredSize(new Dimension(100, 100));
		JTextArea area1 = new JTextArea();
		panLeft.add(new JScrollPane(area1));

		JPanel panCenter = new JPanel(new BorderLayout(20, 20));
		panCenter.setBackground(Color.LIGHT_GRAY);
		JPanel panTop2 = new JPanel();
		panTop2.setPreferredSize(new Dimension(100, 30));
		panTop2.setBackground(Color.GRAY);
		panTop2.add(new JTextField("Na panelu se nalazi JTextField"));

		panCenter.add(panTop2, BorderLayout.NORTH);

		JTextArea textArea2 = new JTextArea();
		panCenter.add(new JScrollPane(textArea2), BorderLayout.CENTER);

		JSplitPane splitPane1 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panLeft, panCenter);

		JPanel panBottom = new JPanel();
		panBottom.setPreferredSize(new Dimension(100, 30));
		panBottom.setBackground(Color.LIGHT_GRAY);
		panBottom.add(new JLabel("I ovo je obična labela"));

		add(panTop, BorderLayout.NORTH);
		add(splitPane1, BorderLayout.CENTER);
		add(panBottom, BorderLayout.SOUTH);
	}
}
