package rs.ac.uns.ftn.oisisi.listeners.action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class MyActionListener1 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("Desio se događaj ActionEvent");
		System.out.println("Događaj inicirala komponenta:"+arg0.getSource()+" , "+arg0.getActionCommand());
		System.out.println("Tekst komponente: "+arg0.getActionCommand());
		System.out.println("Događaj se desio u :"+new Date(arg0.getWhen()));
		System.out.println("Događaj se desio u :"+new Date(arg0.getWhen()));
		
	}

}
