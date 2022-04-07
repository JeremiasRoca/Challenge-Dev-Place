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
	
	public void acelerar(float cantidadKm) throws Exception {

		if(this.remo!=null && cantidadKm >=100) {
		
			throw new Exception("Demasiado Rapido!!!!!!!!");
		
		
	}else {
		System.out.println("no");
		super.setVelocidad(cantidadKm);
	}
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
