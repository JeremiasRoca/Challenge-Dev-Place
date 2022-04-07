package model;

public abstract class Vehiculo {

	private String matricula;
	private float velocidad;
	
	
	/**
	 * @param matricula
	 * @param velocidad
	 */
	public Vehiculo(String matricula) {
		this.matricula = matricula;
		this.velocidad = 0;
	}

	protected void setVelocidad(float velocidad) {
		this.velocidad = velocidad;
	}
	
	public float getVelocidad() {
		return this.velocidad;
	}
	
	public void acelerar(float cantidadKm) throws EDemasiadoRapidoException {
		velocidad += cantidadKm;
	}
	
	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", velocidad=" + velocidad + "]";
	}
	
	
	
	
	
	
}
