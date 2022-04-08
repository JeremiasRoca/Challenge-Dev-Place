package model;

import java.util.Arrays;

public class Vendedor extends Empleado{

	
	private Coche autoEmpresa;
	
	private String areaVenta;
	private Cliente[] listaClientes;
	private int contClientes;
	private double porcentajeVentas;
	
	
	public Vendedor(String nombre, String apellido, int dni, String direccion, String telefono, double salario,String areaVentas, double porcentaje) {
		super(nombre, apellido, dni, direccion, telefono, salario);
		
		this.areaVenta = areaVentas;
		listaClientes = new Cliente[20];
		contClientes = -1;
		porcentajeVentas=porcentaje; 
		
		if(getAntiguedad()>0) {
			salario= salario *1.1* getAntiguedad();
		}
		
	}

	public void addCliente(Cliente cli) {
		if(contClientes<20) {
			listaClientes[++contClientes]=cli;
		}
	}
	public void removeCliente() {
		if(contClientes>0) {
			listaClientes[contClientes--]=null;
		}
	}
	
	public void addCoche(Coche coche) {
		autoEmpresa = coche;
	}

	public void removeCoche() {
	autoEmpresa=null;
	}

	@Override
	public String toString() {
		return "Vendedor "+super.toString()+"[autoEmpresa=" + autoEmpresa + ", areaVenta=" + areaVenta + ", listaClientes="
				+ Arrays.toString(listaClientes) + ", contClientes=" + contClientes + ", porcentajeVentas="
				+ porcentajeVentas + "]";
	}
	
	

}
