package ejerestacionamiento;

import java.util.Arrays;

public class Estacionamiento {

	private Automovil[][] parkings;
	private int[] pasillos;
	private int[] posiciones;
	private final double TARIFA_POR_DIA_POLICIA = 40.50;
	private final double TARIFA_POR_DIA_TAXI = 65;
	private final double TARIFA_POR_DIA_COMUN = 110;

	public Estacionamiento(int pasillos, int posiciones) {
		initParkingPlaces();
	}

	private void initParkingPlaces() {
		for (int i = 0; i < parkings.length; i++) {
			for (int j = 0; j < parkings[i].length; j++) {
				parkings[i][j] = null;
			}
		}
	}

	public boolean itsBusy(int pasillo, int posicion) {
		boolean estaOcupado = false;
		if (parkings[pasillo][posicion] != null) {
			estaOcupado = true;
		}
		return estaOcupado;
	}

	public int freeSpaces() {
		int disponibles = 0;
		for (int i = 0; i < parkings.length; i++) {

			for (int j = 0; j < parkings[i].length; j++) {
				if (!itsBusy(i, j)) {
					disponibles++;
				}
			}
		}
		return disponibles;
	}

	public boolean occupySpace(int pasillo, int posicion, Automovil auto) {
		boolean retorno = false;
		if (!(itsBusy(pasillo - 1, posicion - 1))) {
			parkings[pasillo - 1][posicion - 1] = auto;
			retorno = true;
			System.out.println("Se agregó " + auto);
		} else {
			System.out.println("No se puede agregar auto");
		}

		return retorno;
	}

	public double collectToday() {
		double recaudacionDelDia = 0;
		for (int i = 0; i < parkings.length; i++) {
			recaudacionDelDia += recaudarElPasillo(i);
		}

		return recaudacionDelDia;
	}

	public double recaudarElPasillo(int pasillo) {
		double recaudacion = 0;
		Automovil auto;
		for (int j = 0; j < parkings[pasillo].length; j++) {
			auto = parkings[pasillo][j];
			switch (auto.getTipoAutomovil()) {
			case POLICIA:
				recaudacion += TARIFA_POR_DIA_POLICIA;
				break;
			case TAXI:
				recaudacion += TARIFA_POR_DIA_TAXI;
				break;
			case COMUN:
				recaudacion += TARIFA_POR_DIA_COMUN;
				break;
			default:
				break;
			}

		}
		return recaudacion;

	}

	public int cuantosAutosHayEnLaPosicion(int posicion) {
		int cantidadDeAutos = 0;
		for (int i = 0; i < parkings.length; i++) {
			if (itsBusy(i, posicion)) {
				cantidadDeAutos++;
			}
		}
		return cantidadDeAutos;
	}

	@Override
	public String toString() {
		return "Estacionamiento [parkings=" + Arrays.toString(parkings) + ", pasillos=" + Arrays.toString(pasillos)
				+ ", posiciones=" + Arrays.toString(posiciones) + ", TARIFA_POR_DIA_POLICIA=" + TARIFA_POR_DIA_POLICIA
				+ ", TARIFA_POR_DIA_TAXI=" + TARIFA_POR_DIA_TAXI + ", TARIFA_POR_DIA_COMUN=" + TARIFA_POR_DIA_COMUN
				+ "]";
	}
}
