package rs.ac.uns.ftn.oisisi.listeners.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class MyActionListener2 implements ActionListener{

	
	//metoda zaduzena za drugu tekstualnu komponentu:
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		//samo ako smo sigurni da je dogadjaj prouzrokovala komponenta JTextField:
		//može se izvršiti Cast-ovanje 
		JTextField txtField1=(JTextField) arg0.getSource();
		System.out.println("U JTextField-u se nalazi:"+ txtField1.getText());
		
	}

}
