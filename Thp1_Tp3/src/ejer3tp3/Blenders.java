package ejer3tp3;

public class Blenders extends Electrodomestico {

	private int powerInWatts;
	private int numOfSpeeds;

	public Blenders(String brand, String model, String serialNumber, String voltage, String state, int price,
			int powerInWatts, int numOfSpeeds) {
		super(brand, model, serialNumber, voltage, state, price);
		setPowerInWatts(powerInWatts);
		setNumOfSpeeds(numOfSpeeds);

	}
	
	@Override
	public void showForBuyList() {
		System.out.println(super.model+"--"+super.brand+"-- WTSPOWER = "+powerInWatts+"-- NUMOFSPEEDS = "+numOfSpeeds+"--"+"$"+super.price);
	}
	@Override
	public void showForTicket() {
		System.out.println(super.model+"--"+super.brand+"--"+"$"+super.price);
	}

	public int getPowerInWatts() {
		return powerInWatts;
	}

	public void setPowerInWatts(int powerInWatts) {
		this.powerInWatts = powerInWatts;
	}

	public int getNumOfSpeeds() {
		return numOfSpeeds;
	}

	public void setNumOfSpeeds(int numOfSpeeds) {
		this.numOfSpeeds = numOfSpeeds;
	}

	@Override
	public String toString() {
		return super.toString() + "powerInWatts= " + powerInWatts + " numOfSpeeds= " + numOfSpeeds;
	}

}
