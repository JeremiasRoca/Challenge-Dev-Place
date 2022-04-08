package model;

public class Empleado {

	
	private String nombre;
	private String apellido;
	private int dni;
	private String direccion;
	private int antiguedad;
	private String telefono;
	private double salario;
	private Empleado supervisor;
	/**
	 * @param nombre
	 * @param apellido
	 * @param dni
	 * @param direccion
	 * @param antiguedad
	 * @param telefono
	 * @param salario
	 * @param supervisor
	 */
	public Empleado(String nombre, String apellido, int dni, String direccion, String telefono,	double salario) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.direccion = direccion;
		this.antiguedad = 0;
		this.telefono = telefono;
		this.salario = salario;
		this.supervisor = null;
	}
	
	public int getAntiguedad() {
		return antiguedad;
	}
	
	public void addSupervisor(Empleado emp) {
			supervisor = emp;
	}
	
	public void removeSupervisor() {
		supervisor=null;
	}
	
	public void incrementarSalario(double aumento) {
		salario+=aumento;
	}
	
	
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", direccion=" + direccion
				+ ", antiguedad=" + antiguedad + ", telefono=" + telefono + ", salario=" + salario + ", supervisor="
				+ supervisor + "]";
	}
	
	
	
	
	
	
}
