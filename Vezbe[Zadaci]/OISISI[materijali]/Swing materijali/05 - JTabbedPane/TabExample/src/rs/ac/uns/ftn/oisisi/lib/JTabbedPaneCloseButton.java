package rs.ac.uns.ftn.oisisi.lib;

import javax.swing.*;
import javax.swing.plaf.metal.MetalIconFactory;

import rs.ac.uns.ftn.oisisi.main.BookTab;

import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

/**
 * @author 6dc
 *
 *         A class which creates a JTabbedPane and auto sets a close button when
 *         you add a tab
 */
public class JTabbedPaneCloseButton extends JTabbedPane {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6162048567980039381L;

	public JTabbedPaneCloseButton() {
		super();
	}

	/* Override Addtab in order to add the close Button everytime */
	@Override
	public void addTab(String title, Icon icon, Component component, String tip) {
		super.addTab(title, icon, component, tip);
		int count = this.getTabCount() - 1;
		setTabComponentAt(count, new CloseButtonTab(component, title, icon));
	}

	@Override
	public void addTab(String title, Icon icon, Component component) {
		addTab(title, icon, component, null);
	}

	@Override
	public void addTab(String title, Component component) {
		addTab(title, null, component);
	}

	/* Button */
	public class CloseButtonTab extends JPanel {
		/**
		 * 
		 */
		private static final long serialVersionUID = 4141334065998335653L;

		public CloseButtonTab(final Component tab, String title, Icon icon) {
			setOpaque(false);
			FlowLayout flowLayout = new FlowLayout(FlowLayout.CENTER, 3, 3);
			setLayout(flowLayout);
			JLabel jLabel = new JLabel(title);
			jLabel.setIcon(icon);
			add(jLabel);
			JButton button = new JButton(MetalIconFactory.getInternalFrameCloseIcon(16));
			button.setMargin(new Insets(0, 0, 0, 0));
			button.addMouseListener(new CloseListener(tab));
			add(button);
		}
	}

	/* ClickListener */
	public class CloseListener implements MouseListener {
		private Component tab;

		public CloseListener(Component tab) {
			this.tab = tab;
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			if (e.getSource() instanceof JButton) {
				JButton clickedButton = (JButton) e.getSource();
				System.out.println(clickedButton.getParent());
				System.out.println(clickedButton.getParent().getParent());
				System.out.println(clickedButton.getParent().getParent().getParent());
				JTabbedPane tabbedPane = (JTabbedPane) clickedButton.getParent().getParent().getParent();
				if (tab instanceof BookTab) {
					// kod koji dodajete prilikom zatvaranja taba
					((BookTab) tab).saveBookState();
				}
				tabbedPane.remove(tab);
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
		}

		@Override
		public void mouseReleased(MouseEvent e) {
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			if (e.getSource() instanceof JButton) {
				JButton clickedButton = (JButton) e.getSource();
				clickedButton.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 3));
			}
		}

		@Override
		public void mouseExited(MouseEvent e) {
			if (e.getSource() instanceof JButton) {
				JButton clickedButton = (JButton) e.getSource();
				clickedButton.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 3));
			}
		}
	}
}
