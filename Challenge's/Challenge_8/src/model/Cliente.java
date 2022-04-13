package model;

import java.util.Date;

public class Cliente {

	private String nombre;
	private String apellido;
	private String dni;
	private Date fechaNacimiento;
	private int idFacturacion;
	/**
	 * @param nombre
	 * @param apellido
	 * @param dni
	 * @param fechaNacimiento
	 * @param idFacturacion
	 */
	public Cliente(String nombre, String apellido, String dni, Date fechaNacimiento, int idFacturacion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.idFacturacion = idFacturacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public int getIdFacturacion() {
		return idFacturacion;
	}
	public void setIdFacturacion(int idFacturacion) {
		this.idFacturacion = idFacturacion;
	}
	
	
	
	
}
