package rs.ac.uns.ftn.igraci.view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.table.AbstractTableModel;

import rs.ac.uns.ftn.igraci.model.BazaIgraca;

public class AbstractTableModelIgraci extends AbstractTableModel {

	private static final long serialVersionUID = 2710362894062472488L;

	public static String kolonaDugme = "DUGME";
	public static String kolonaCheck = "CHECK";

	private List<Boolean> koJeOtkacen;

	public AbstractTableModelIgraci() {
		this.koJeOtkacen = new ArrayList<>();
		for (int i = 0; i < BazaIgraca.getInstance().getIgraci().size(); i++) {
			koJeOtkacen.add(false);
		}
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return columnIndex >= 4;
	}

	@Override
	public int getRowCount() {
		return BazaIgraca.getInstance().getIgraci().size();
	}

	@Override
	public int getColumnCount() {
		return BazaIgraca.getInstance().getColumnCount() + 2;
	}

	@Override
	public String getColumnName(int column) {
		if (column >= BazaIgraca.getInstance().getColumnCount()) {
			return column == 4 ? kolonaDugme : kolonaCheck;
		}
		return BazaIgraca.getInstance().getColumnName(column);
	}

	// da bismo mogli prikazati dugme
	@Override
	public Class<?> getColumnClass(int columnIndex) {
		switch (columnIndex) {
		case 0:
		case 1:
		case 2:
		case 3:
			return String.class;
		case 4:
			return JButton.class;
		case 5:
			return Boolean.class;
		default:
			return null;
		}
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		if (columnIndex < 4)
			return BazaIgraca.getInstance().getValueAt(rowIndex, columnIndex);
		else if (columnIndex == 4) {
			JButton btn = new JButton("" + rowIndex);
			return btn;
		} else if (columnIndex == 5) {
			return koJeOtkacen.get(rowIndex);
		}
		return null;
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		super.setValueAt(aValue, rowIndex, columnIndex);
		if (columnIndex != 5) {
			return;
		}
		koJeOtkacen.set(rowIndex, !koJeOtkacen.get(rowIndex));
	}

	public void igracDodat() {
		this.koJeOtkacen.add(false);
	}
	
	public void igracUklonjen(int rowIndex) {
		this.koJeOtkacen.remove(rowIndex);
	}
	
}
