package model;

import java.util.Date;

public class Vendedor {

	private String nombre;
	private String apellido;
	private String dni;
	private String direccion;
	private double salario;
	private Date fechaNacimiento;
	private int idFacturacion;
	/**
	 * @param nombre
	 * @param apellido
	 * @param dni
	 * @param direccion
	 * @param salario
	 * @param fechaNacimiento
	 * @param idFacturacion
	 */
	public Vendedor(String nombre, String apellido, String dni, String direccion, double salario, Date fechaNacimiento,
			int idFacturacion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.direccion = direccion;
		this.salario = salario;
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public Date getFechaNacimiento() {
		return  fechaNacimiento;
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
