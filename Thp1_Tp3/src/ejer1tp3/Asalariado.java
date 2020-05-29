package ejer1tp3;



// Asalariado hereda de la superclase Empleado
public class Asalariado extends Empleado {

	private float Salary;
// constructor normal
	public Asalariado() {
		super();
		this.Salary = 0;
		;
	}
//constructor con parametros de la superclase y la clase hija
	public Asalariado(String name,int age, float salary) {
		//hereda...(todos sus metodos y atributos )
		super(name,age);
		Salary = salary;

	}

	
	public float getSalary() {
		return Salary;
	}

	public void setSalary(float salary) {
		Salary = salary;
	}
	

	@Override
	public String toString() {
		return super.toString()+" gana: "+calcularPago();
	}

	
	//Hereda el metodo calcularPago y le aplico polimorfismo.
	@Override
	public float calcularPago() 
	{
		return getSalary();
	}
}
