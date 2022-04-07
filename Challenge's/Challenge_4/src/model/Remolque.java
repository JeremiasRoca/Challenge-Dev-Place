package model;

public class Remolque {

	private int peso;
	private String nroSerie;
	/**
	 * @param pesoCarga
	 * @param nroSerie
	 */
	public Remolque(int peso, String nroSerie) {
		this.peso = peso;
		this.nroSerie = nroSerie;
	}
	@Override
	public String toString() {
		return "Remolque [peso Carga=" + peso + ", nroSerie=" + nroSerie + "]";
	}
	
	
}
