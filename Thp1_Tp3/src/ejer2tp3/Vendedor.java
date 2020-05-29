package ejer2tp3;

import ejer1tp3.Subcontratado;

public class Vendedor extends Subcontratado {

	private float percentaje;

	public Vendedor(String name,int age,float canHour,float pricexHour, float percentaje) {
		super(name,age,canHour,pricexHour);
		this.percentaje = percentaje;
	}

	public float getPercentaje() {
		return percentaje;
	}

	public void setPercentaje(float percentaje) {
		this.percentaje = percentaje;
	}

	@Override
	public String toString() {
		return "Vendedor "+getName()+" gana: "+calcularPago();
	}

	@Override
	public float calcularPago() {
		
	
		return (super.calcularPago()*(this.percentaje/100))+super.calcularPago();
		
	}

}
