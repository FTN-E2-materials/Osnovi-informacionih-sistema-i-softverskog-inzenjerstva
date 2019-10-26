package rs.ac.uns.ftn.igraci.model;

import java.util.ArrayList;
import java.util.List;

public class BazaIgraca {

	private static BazaIgraca instance = null;

	public static BazaIgraca getInstance() {
		if (instance == null) {
			instance = new BazaIgraca();
		}
		return instance;
	}

	private long generator;

	private List<Igrac> igraci;
	private List<String> kolone;

	private BazaIgraca() {
		generator = 0;
	
		initIgrace();

		this.kolone = new ArrayList<String>();
		this.kolone.add("ID");
		this.kolone.add("IME");
		this.kolone.add("PREZIME");
		this.kolone.add("KLUB");

	}

	private void initIgrace() {
		this.igraci = new ArrayList<Igrac>();
		igraci.add(new Igrac(generateId(), "Mika", "Mikic", "Crvena Zvezda"));
		igraci.add(new Igrac(generateId(), "Zika", "Zikic", "FMP"));
		igraci.add(new Igrac(generateId(), "Pera", "Peric", "OKK Sabac"));
	}

	public List<Igrac> getIgraci() {
		return igraci;
	}

	public void setIgraci(List<Igrac> igraci) {
		this.igraci = igraci;
	}

	private long generateId() {
		return ++generator;
	}

	public int getColumnCount() {
		return 4;
	}

	public String getColumnName(int index) {
		return this.kolone.get(index);
	}

	public Igrac getRow(int rowIndex) {
		return this.igraci.get(rowIndex);
	}

	public String getValueAt(int row, int column) {
		Igrac igrac = this.igraci.get(row);
		switch (column) {
		case 0:
			return Long.toString(igrac.getId());
		case 1:
			return igrac.getIme();
		case 2:
			return igrac.getPrezime();
		case 3:
			return igrac.getKlub();
		default:
			return null;
		}
	}

	public void dodajIgraca(String ime, String prezime, String klub) {
		this.igraci.add(new Igrac(generateId(), ime, prezime, klub));
	}

	public void izbrisiIgraca(long id) {
		for (Igrac i : igraci) {
			if (i.getId() == id) {
				igraci.remove(i);
				break;
			}
		}
	}

	public void izmeniIgraca(long id, String ime, String prezime, String klub) {
		for (Igrac i : igraci) {
			if (i.getId() == id) {
				i.setIme(ime);
				i.setPrezime(prezime);
				i.setKlub(klub);
			}
		}
	}

}
