/**
 * 
 */
package rs.ac.uns.ftn.oisisi.objectstream;

import java.io.Serializable;

/**
 * @author Danijel
 *
 */
public class Motor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4336128700158739048L;

	public static enum Tip {
		BENZINSKI, DIZEL, ELEKTRICNI, HIBRID
	}

	private double zapremina;
	private int snaga;
	private String serijskiBroj;
	private Tip tip;

	public Motor(double zapremina, int snaga, String serijskiBroj, Tip tip) {
		super();
		this.zapremina = zapremina;
		this.snaga = snaga;
		this.serijskiBroj = serijskiBroj;
		this.tip = tip;
	}

	public double getZapremina() {
		return zapremina;
	}

	public void setZapremina(double zapremina) {
		this.zapremina = zapremina;
	}

	public int getSnaga() {
		return snaga;
	}

	public void setSnaga(int snaga) {
		this.snaga = snaga;
	}

	public String getSerijskiBroj() {
		return serijskiBroj;
	}

	public void setSerijskiBroj(String serijskiBroj) {
		this.serijskiBroj = serijskiBroj;
	}

	public Tip getTip() {
		return tip;
	}

	public void setTip(Tip tip) {
		this.tip = tip;
	}

	@Override
	public String toString() {
		return "Motor [zapremina=" + zapremina + ", snaga=" + snaga + ", serijskiBroj=" + serijskiBroj + ", tip=" + tip
				+ "]";
	}

}
