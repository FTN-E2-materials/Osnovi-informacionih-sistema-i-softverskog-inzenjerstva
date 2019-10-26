package rs.ac.uns.ftn.oisisi.main;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

import rs.ac.uns.ftn.oisisi.lib.JTabbedPaneCloseButton;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3987690974281770416L;
	
	private JPanel mainToolbar;
	private JSplitPane mainSplitPane;
	private JPanel leftPanel;
	private JButton addTabButton;
	private JTabbedPaneCloseButton tabbedPane;
	
	int tabNumber = 0;
	
	// ========================= Singleton obrazac
	private static MainFrame instance = null;

	private MainFrame() {
		this.createToolbar();
		this.createSplitPane();
		this.initPosition();
	}
	
	public static MainFrame getInstance() {
		if (instance == null) {
			instance = new MainFrame();
		}
		return instance;
	}
	// =========================
	
	private void createToolbar() {
		mainToolbar = new JPanel();
		mainToolbar.add(new JLabel("Ovo je glavni toolbar"));
		this.add(mainToolbar, BorderLayout.NORTH);

	}

	private void createSplitPane() {
		this.createLeftPanel();
		this.createTabbedPane();
		mainSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, this.leftPanel, this.tabbedPane);
		this.add(mainSplitPane, BorderLayout.CENTER);

	}

	private void createLeftPanel() {
		leftPanel = new JPanel();
		addTabButton = new JButton("Dodaj tab");
		addTabButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				addMyTabToTabbedPane("Knjiga " + (++tabNumber));
			}
		});
		leftPanel.add(addTabButton);
	}

	private void createTabbedPane() {
		this.tabbedPane = new JTabbedPaneCloseButton();
	}

	
	private void initPosition() {
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	// dodavanje taba u TabbedPaned
	private void addMyTabToTabbedPane(String bookName) {
		// ucitavanje ikonice
		ImageIcon icon = createImageIcon("images/img.png", true);
		// kreiranje instance MyTab
		BookTab mt = new BookTab(bookName);
		// dodavanje taba
		tabbedPane.addTab(bookName, icon, mt, "Prvi tab - Tooltip");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainFrame.getInstance();
	}

	protected static ImageIcon createImageIcon(String path, boolean scaleImage) {
		if (scaleImage) {
			// ukoliko vam je potrebno skaliranje slike
			ImageIcon imageIcon = new ImageIcon(path); // load the image to a imageIcon
			Image image = imageIcon.getImage(); // transform it
			Image newimg = image.getScaledInstance(16, 16, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
			imageIcon = new ImageIcon(newimg); // transform it back
			return imageIcon;

		} else {
			return new ImageIcon(path);
		}
	}

}
