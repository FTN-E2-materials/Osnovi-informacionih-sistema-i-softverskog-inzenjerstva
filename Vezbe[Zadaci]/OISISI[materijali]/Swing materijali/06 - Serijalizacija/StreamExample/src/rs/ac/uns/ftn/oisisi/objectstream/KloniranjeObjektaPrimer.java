/**
 * 
 */
package rs.ac.uns.ftn.oisisi.objectstream;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 * @author Danijel
 *
 */
public class KloniranjeObjektaPrimer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final JFrame frame = new JFrame("Prozor");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTextArea ta = new JTextArea(15, 30);
		frame.add(ta);
		JButton btn = new JButton("Kloniraj me");

		// Na kloniranom frame-u nece biti nakacen listener. Listeneri se ne
		// serijalizuju.
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cloneFrame(frame);
			}
		});
		frame.add(btn, BorderLayout.SOUTH);

		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}

	private static void cloneFrame(JFrame frame) {
		try {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			try {
				oos.writeObject(frame);
			} finally {
				oos.close();
			}

			ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bis);
			try {
				JFrame newFrame = (JFrame) ois.readObject();
				newFrame.setLocation(newFrame.getLocation().x + 100, newFrame.getLocation().y + 100);
				newFrame.setVisible(true);
			} finally {
				ois.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
