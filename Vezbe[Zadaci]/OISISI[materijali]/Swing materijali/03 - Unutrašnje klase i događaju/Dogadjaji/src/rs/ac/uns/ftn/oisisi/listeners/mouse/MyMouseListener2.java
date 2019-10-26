package rs.ac.uns.ftn.oisisi.listeners.mouse;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

public class MyMouseListener2 implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent arg0) {

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		JOptionPane.showMessageDialog(null, "Ušli ste u prostor komponente na poziciji:" + arg0.getPoint());

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		JOptionPane.showMessageDialog(null, "Izašli ste u prostor komponente na poziciji:" + arg0.getPoint());

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

}
