package rs.ac.uns.ftn.oisisi;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

import rs.ac.uns.ftn.oisisi.listeners.window.MyWindowListener;
import rs.ac.uns.ftn.oisisi.panels.action.ActionListenerPanel;
import rs.ac.uns.ftn.oisisi.panels.focus.FocusListenerPanel;
import rs.ac.uns.ftn.oisisi.panels.key.KeyListenerPanel;
import rs.ac.uns.ftn.oisisi.panels.mouse.MouseListenerPanel;

public class MainFrame extends JFrame {
	
	private static final long serialVersionUID = -8026416994513756565L;

	public MainFrame() {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;

		setSize(screenWidth / 2, screenHeight / 2);
		setTitle("Event - Listener");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		addWindowListener(new MyWindowListener());

		// glavni meni aplikacije - ActionListener
		Menu menu = new Menu(this);
		setJMenuBar(menu);
		// toolbar aplikacije - ActionListener
		Toolbar toolbar = new Toolbar();
		add(toolbar, BorderLayout.NORTH);

		// glavni panel aplikacije je podeljen na 4 panela
		// Po jedan panel za testiranje ActionListenera, FocusListenera
		// KeyListenera, MouseListenera
		JPanel panCentar = new JPanel(new GridLayout(2, 2));

		// primeri koriscenja ActionListener-a
		JPanel panActionListener = new ActionListenerPanel();
		panCentar.add(panActionListener);

		// Primeri koriscenja Focus Listenera
		JPanel panFocusListener = new FocusListenerPanel();
		panCentar.add(panFocusListener);

		// primeri koriscenja key listenera
		JPanel panKeyListener = new KeyListenerPanel();
		panCentar.add(panKeyListener);

		// primeri koriscenja mouse listenera
		JPanel panMouseListener = new MouseListenerPanel();
		panCentar.add(panMouseListener);

		JPanel statusBar = new JPanel();
		statusBar.setBackground(Color.LIGHT_GRAY);
		statusBar.setPreferredSize(new Dimension(100, 30));

		add(panCentar, BorderLayout.CENTER);
		add(statusBar, BorderLayout.SOUTH);

	}

}
