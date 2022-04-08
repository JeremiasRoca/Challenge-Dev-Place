package model;

public class JefeZona extends Empleado{

	
	private String despacho;
	private Secretario secreAcargo;
	private Vendedor[] listaVendedores;
	private int contVendedores;
	private Coche auto;
	
	
	public JefeZona(String nombre, String apellido, int dni, String direccion, String telefono, double salario) {
		super(nombre, apellido, dni, direccion, telefono, salario);
		
		if(getAntiguedad()>0) {
			salario= salario *1.2* getAntiguedad();
		}
		
		secreAcargo = null;
		auto = null;
		listaVendedores = new Vendedor[20];
		contVendedores =-1;
	}

	
	
	
	public void addSecretario(Secretario secre) {
		secreAcargo = secre;
	}

	public void removeSecretario() {
		secreAcargo=null;
	}
	
	public void addCoche(Coche coche) {
		auto = coche;
	}

	public void removeCoche() {
		auto=null;
	}
	
	public void addVendedor(Vendedor vendedor) {
		if(contVendedores<20) {
			listaVendedores[++contVendedores]=vendedor;
		}
	}
	public void removeVendedor() {
		if(contVendedores>0) {
			listaVendedores[contVendedores--]=null;
		}
	}

	@Override
	public String toString() {
		return "JefeZona "+super.toString()+"[despacho=" + despacho + ", auto=" + auto + "]";
	}

	
	
}
