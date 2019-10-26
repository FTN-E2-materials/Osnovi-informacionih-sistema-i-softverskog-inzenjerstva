package rs.ac.uns.ftn.oisisi.panels.key;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.KeyListener;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import rs.ac.uns.ftn.oisisi.listeners.key.MyKeyListener;

public class KeyListenerPanel extends JPanel {
	
	private static final long serialVersionUID = -3365881260338646889L;

	public KeyListenerPanel(){
			super(new BorderLayout());
			
		  	setBorder(new TitledBorder(new EtchedBorder(),"Key Listener"));
		  	setBackground(new Color(117,203, 254));

		  	
		  	Dimension dim=new Dimension(120,20);
		  	KeyListener keyListener=new MyKeyListener();
		  	
		  	JPanel panJMBG=new JPanel(new FlowLayout(FlowLayout.LEFT));
		  	panJMBG.setBackground(new Color(117,203, 254));
		  	
		  	JLabel lblJMBG=new JLabel("JMBG:");
		  	lblJMBG.setPreferredSize(dim);
		  	JTextField txtJMBG=new JTextField();
		  	txtJMBG.setPreferredSize(dim);
		  	txtJMBG.setName("txtJMBG");
		  	txtJMBG.addKeyListener(keyListener);
		  	
		  	panJMBG.add(lblJMBG);
		  	panJMBG.add(txtJMBG);
		  	
		  	Box boxCentar=Box.createVerticalBox();
		  	boxCentar.add(Box.createVerticalStrut(20));
		  	boxCentar.add(panJMBG);
		  	boxCentar.add(Box.createGlue());
		  	add(boxCentar,BorderLayout.NORTH);
	        
	}

}
