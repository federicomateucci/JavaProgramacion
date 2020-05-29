package ejer1tp3;
// le decimos que herede de Empleado
public class Subcontratado extends Empleado{
	
	
	private float cantHour;
	private float pricexHour;
	
	
	public Subcontratado() {
		super();
		this.cantHour = 0;
		this.pricexHour = 0;
	}
	// hereda sus metodos y atributos de la superclase en este constructor
	public Subcontratado(String name,int age,float cantHour, float pricexHour) {
		super(name,age);
		this.cantHour = cantHour;
		this.pricexHour = pricexHour;
	}
	// sobre escribo el metodo heredado calcularPago aplicando polimorfismo
	@Override
	public float calcularPago()
	{
		float salary;
		salary=cantHour*pricexHour;
		return salary;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + " gana: " + calcularPago() ;
	}
	
	

}
