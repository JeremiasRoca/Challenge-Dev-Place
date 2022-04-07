package model;

public class Carga extends Vehiculo{

	
	private Remolque remo ;
	
	public Carga(String matricula) {
		super(matricula);
		remo = null;
		// TODO Auto-generated constructor stub
	}

	public void ponRemolque(Remolque remo) {
		this.remo = remo;
	}
	
	public void quitaRemolque() {
		this.remo=null;
	}
	
	public boolean sinRemolque() {
		return this.remo==null; 
	}
	
	public void acelerar(float cantidadKm) throws EDemasiadoRapidoException {

		if(this.remo!=null && cantidadKm+super.getVelocidad() >=100) {
		
			throw new EDemasiadoRapidoException("Demasiado Rapido!!!!!!!!");
		}
		super.setVelocidad(super.getVelocidad()+cantidadKm);
	
	}
	

	@Override
	public String toString() {
		String re;
		if(this.remo!=null) {
			re = remo.toString(); 
		}else {
			re = "Sin remolque";
		}
		return super.toString()+"Carga ["+re+"]";
	}
	
	
	
}
