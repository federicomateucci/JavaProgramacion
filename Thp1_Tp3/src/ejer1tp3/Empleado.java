package ejer1tp3;

public class Empleado {

	private String name;
	private int edad;

	public Empleado() {
		this.edad = 0;
		this.name = null;

	}

	public Empleado(String name, int edad) {
		this.edad = edad;
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Empleado " + getName() + " edad " + calcularPago();
	}

	public float calcularPago() {
		return 0.0f;
	}
}
