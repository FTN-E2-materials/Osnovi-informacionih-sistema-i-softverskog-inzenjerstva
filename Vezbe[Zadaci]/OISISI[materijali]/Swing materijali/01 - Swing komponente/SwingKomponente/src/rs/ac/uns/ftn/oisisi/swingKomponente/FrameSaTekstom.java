package rs.ac.uns.ftn.oisisi.swingKomponente;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * Klasa koja prikazuje primer korišćenja labele
 * odnosno klase JLabel
 */

public class FrameSaTekstom extends JFrame {
	
	private static final long serialVersionUID = -5564846189262117145L;

	public FrameSaTekstom() {
			Toolkit kit = Toolkit.getDefaultToolkit();
	        Dimension screenSize = kit.getScreenSize();
	        int screenHeight = screenSize.height;
	        int screenWidth = screenSize.width;
	        setSize(screenWidth / 2, screenHeight / 2);
	        setTitle("JLabel, JTextField, JTextArea, JSplitPane, JScrollPane");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);

	        
	        JPanel leviPanel = new JPanel(new BorderLayout());
	        leviPanel.setBackground(Color.DARK_GRAY);
	        // dolenavedeni split pane se ne moze pomeriti skroz do leve ivice 
	        leviPanel.setMinimumSize(new Dimension(100, 100));
	        JPanel desniPanel = new JPanel(new BorderLayout(20, 20));
	        desniPanel.setBackground(Color.LIGHT_GRAY);
	        
	        // vertikalna linija koja razdvaja
	        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leviPanel, desniPanel);
	        // pozicija linije koja razdvaja
	        splitPane.setDividerLocation(200);
	        // klikom na liniju koja razdvaja jedna od komponente zauzme citav ekran
	        splitPane.setOneTouchExpandable(true);
	  
	        // obican tekst
	        JLabel label = new JLabel("Ovo je labela");
	        label.setPreferredSize(new Dimension(100, 50));
	        label.setToolTipText("Ovo je dodatno objasnjenje labele");
	        desniPanel.add(label, BorderLayout.NORTH);
	        
	        // Jednolinijsko tekstualno polje
	        JTextField textField = new JTextField("Ovo je jednolinijsko tekstualno polje");
	        textField.setPreferredSize(new Dimension(100, 50));
	        desniPanel.add(textField, BorderLayout.SOUTH);
	        
	        // viselinijsko tekstualno polje
	        JTextArea textArea = new JTextArea("Ovo je viselinijsko tekstualno polje");
	        // dodajemo scroller-e po potrebi
	        JScrollPane scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	        
	        desniPanel.add(scrollPane, BorderLayout.CENTER); 
	        
	        this.add(splitPane);	        
	       
	        
	  }
	


}
