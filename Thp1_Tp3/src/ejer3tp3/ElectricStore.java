package ejer3tp3;

import java.util.ArrayList;
import java.util.Scanner;

public class ElectricStore {

	public static Scanner sc = new Scanner(System.in);

	private ArrayList<Electrodomestico> electrodomesticos;
	private ArrayList<Electrodomestico> cartShop;
	private String nameStore;

	public ElectricStore(String nameStore) {
		super();
		this.electrodomesticos = new ArrayList<Electrodomestico>();
		this.cartShop = new ArrayList<Electrodomestico>();
		this.nameStore = nameStore;
	}

	public ArrayList<Electrodomestico> getElectrodomesticos() {
		return electrodomesticos;

	}

	public void setElectrodomesticos(ArrayList<Electrodomestico> electrodomesticos) {
		this.electrodomesticos = electrodomesticos;

	}

	public String getNameStore() {
		return nameStore;

	}

	public void setNameStore(String nameStore) {
		this.nameStore = nameStore;

	}

	public ArrayList<Electrodomestico> getCartShop() {
		return cartShop;

	}

	public void setCartShop(ArrayList<Electrodomestico> cartShop) {
		this.cartShop = cartShop;

	}

	public void addElectrodomestico(Electrodomestico electrodomestico) {
		this.electrodomesticos.add(electrodomestico);

	}

	public void addElectrodomesticoCart(Electrodomestico electrodomestico) {
		this.cartShop.add(electrodomestico);

	}

	public void showTheProducts() {
		String salida;
		Electrodomestico elecAux;
		int i = 0;
		int corte = 0;
		final int CORTE = 0;
		int cut = -1;
		int ticket;

		while (i < electrodomesticos.size()) {
			elecAux = electrodomesticos.get(i);

			elecAux.showForBuyList();
			System.out.println("Presione S (agregar) / N (siguiente) ");
			salida = readAndGiveStr();
			if (salida.equals("S")) {
				addElectrodomesticoCart(elecAux);
				System.out.println("Se agrego este producto en el carrito");

			}

			i++;
		}
		System.out.println("pulse 0 para ver el total de su factura de compra");
		ticket = readAndGiveInt();
		if (ticket != CORTE) {
			System.out.println("Gracias por su visita");
			
		}else {
			showTicket();
		}

	}

	private void ShowProductsinTkt() {
		for (Electrodomestico elec : cartShop) {
			elec.showForTicket();
		}

	}

	private void showTicket() {
		int totalTkt = 0;
		for (Electrodomestico elec : cartShop) {
			totalTkt += elec.price;
		}
		ShowProductsinTkt();
		System.out.println("------------------------------------");
		System.out.println("TOTAL = " + totalTkt);

	}

	private int readAndGiveInt() {
		int salida = sc.nextInt();
	
		return salida;

	}

	private String readAndGiveStr() {

		String salida = sc.next();
		sc.nextLine();
		return salida.toUpperCase();

	}

}
