package model;

import interfaces.StrategyLimite;


public class Limite {
	private StrategyLimite iLimite;

	/**
	 * @param iVolar
	 */
	public Limite(StrategyLimite iLimite) {
		this.iLimite = iLimite;
	}
	
	
	public float getLimiteAltura() {
		return iLimite.limiteAltura();
	}
	
	public float getLimiteVelocidad() {
		return iLimite.limiteVelocidad();
	}
	
	public float sumaLimite() {
		return iLimite.limiteAltura()+ iLimite.limiteVelocidad();
	}
	
}
