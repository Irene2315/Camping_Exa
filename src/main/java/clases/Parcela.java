package clases;

import java.util.ArrayList;

/**
 * 
 * @author Eñaut Esta clase DTO representa la entidad PARCELA de la BBDD
 *
 */
public class Parcela {
	private int id;
	private String numero;
	private int mCuadrados;
	private double precioDia;

	public Parcela(int id, String numero, int mCuadrados, double precioDia) {
		super();
		this.id = id;
		this.numero = numero;
		this.mCuadrados = mCuadrados;
		this.precioDia = precioDia;
	}

	public Parcela() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getmCuadrados() {
		return mCuadrados;
	}

	public void setmCuadrados(int mCuadrados) {
		this.mCuadrados = mCuadrados;
	}

	public double getPrecioDia() {
		return precioDia;
	}

	public void setPrecioDia(double precioDia) {
		this.precioDia = precioDia;
	}

	@Override
	public String toString() {
		return "Parcela [id=" + id + ", numero=" + numero + ", mCuadrados=" + mCuadrados + ", precioDia=" + precioDia
				+ "]";
	}

}
