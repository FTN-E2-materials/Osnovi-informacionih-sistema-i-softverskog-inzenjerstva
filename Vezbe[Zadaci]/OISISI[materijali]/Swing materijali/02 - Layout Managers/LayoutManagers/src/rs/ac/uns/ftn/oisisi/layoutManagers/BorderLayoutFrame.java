package rs.ac.uns.ftn.oisisi.layoutManagers;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class BorderLayoutFrame extends JFrame {

	private static final long serialVersionUID = 2516952964305708540L;

	public BorderLayoutFrame(String param) {
		super();
		setTitle("BorderLayout Manager");
		setSize(800, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);

		// postavljanje menadžera rasporeda
		if (param.equals("2a"))
			setLayout(new BorderLayout());
		else if (param.equals("2b"))
			setLayout(new BorderLayout(40, 40));

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		JButton btnTop = new JButton("NORTH (100x100)-poštuje visinu 100px");
		btnTop.setPreferredSize(new Dimension(100, 100));
		add(btnTop, BorderLayout.NORTH);
		validate();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		JButton btnBottom = new JButton("SOUTH (200x50) - poštuje visinu 50px");
		btnBottom.setPreferredSize(new Dimension(200, 50));
		add(btnBottom, BorderLayout.SOUTH);
		validate();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		JButton btnLeft = new JButton("WEST (250x150) - poštuje širinu 250px;");
		btnLeft.setPreferredSize(new Dimension(250, 150));
		add(btnLeft, BorderLayout.WEST);
		validate();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		JButton btnRight = new JButton("EAST (250x150) - poštuje širinu 250px;");
		btnRight.setPreferredSize(new Dimension(250, 150));
		add(btnRight, BorderLayout.EAST);
		validate();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		JButton btnCenter = new JButton("CENTER - sve što je ostalo");
		add(btnCenter, BorderLayout.CENTER);
		validate();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
