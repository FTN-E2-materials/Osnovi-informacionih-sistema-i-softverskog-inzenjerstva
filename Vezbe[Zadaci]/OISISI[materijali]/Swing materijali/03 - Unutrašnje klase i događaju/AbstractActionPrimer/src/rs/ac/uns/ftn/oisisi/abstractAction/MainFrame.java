package rs.ac.uns.ftn.oisisi.abstractAction;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JToolBar;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = -1616367561107980353L;

	public MainFrame() {
		setSize(800, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		CreateDocumentAction cda = new CreateDocumentAction();
		JButton btn = new JButton(cda);
		add(btn, BorderLayout.SOUTH);

		JToolBar toolbar = new JToolBar();
		toolbar.add(cda);

		add(toolbar, BorderLayout.NORTH);

		JMenuBar mb = new JMenuBar();
		JMenu mFile = new JMenu("File");
		mFile.add(cda);
		mb.add(mFile);
		setJMenuBar(mb);
	}

	public static void main(String[] args) {
		new MainFrame().setVisible(true);

	}

}
