package rs.ac.uns.ftn.oisisi.layoutManagers;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class GridLayoutFrame extends JFrame {

	private static final long serialVersionUID = 525921494542022364L;

	public GridLayoutFrame(String param) {
		super();
		setTitle("GridLayout Manager");
		setSize(400, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);

		// postavljanje menadžera rasporeda
		if (param.equals("3a")) {
			setLayout(new GridLayout(3, 2));
		} else if (param.equals("3b")) {
			setLayout(new GridLayout(3, 2, 10, 10));
		}

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		JButton btnTop = new JButton("Prvo (100x100)");
		btnTop.setPreferredSize(new Dimension(100, 100));
		add(btnTop);
		validate();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		JButton btnBottom = new JButton("Drugo (200x50)");
		btnBottom.setPreferredSize(new Dimension(200, 50));
		add(btnBottom);
		validate();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		JButton btnLeft = new JButton("Treće (250x150) ");
		btnLeft.setPreferredSize(new Dimension(250, 150));
		add(btnLeft);
		validate();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		JButton btnRight = new JButton("Četvrto (250x150)");
		btnRight.setPreferredSize(new Dimension(250, 150));
		add(btnRight);
		validate();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		JButton btnCenter = new JButton("Peto (100x100)");
		btnRight.setPreferredSize(new Dimension(100, 100));
		add(btnCenter);
		validate();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
