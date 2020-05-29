package ejer3tp3;

public abstract class Electrodomestico {
	
	
	
	protected String brand;
	protected String model;
	private String serialNumber;
	private String voltage;
	private String state;
	protected int price;
	
	
	
	public Electrodomestico(String brand, String model, String serialNumber, String voltage, String state,int price) {
		this.brand = brand;
		this.model = model;
		this.serialNumber = serialNumber;
		this.voltage = voltage;
		this.state = state;
		this.price = price;
	}
	
	
	public abstract void showForTicket();
	public abstract void showForBuyList();
	
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getVoltage() {
		return voltage;
	}
	public void setVoltage(String voltage) {
		this.voltage = voltage;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	

	

	
	
}
