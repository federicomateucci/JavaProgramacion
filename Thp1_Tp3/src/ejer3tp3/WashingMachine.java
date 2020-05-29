package ejer3tp3;

public class WashingMachine extends Electrodomestico {
	
	
	
	private int maximunCharge;
	private String levelOfAutomation;
	
	public WashingMachine(String brand, String model, String serialNumber, String voltage, String state, int price) {
		super(brand, model, serialNumber, voltage, state, price);

		setMaximunCharge(maximunCharge);
		setLevelOfAutomation(levelOfAutomation.toUpperCase());
	}
	@Override
	public void showForBuyList() {
		System.out.println(model+"--"+brand+"--"+maximunCharge+"--"+levelOfAutomation+"--"+"$"+price);
	}
	@Override
	public void showForTicket() {
		System.out.println(super.model+"--"+super.brand+"--"+"$"+super.price);
	}
	
	public int getMaximunCharge() {
		return maximunCharge;
	}
	public void setMaximunCharge(int maximunCharge) {
		this.maximunCharge = maximunCharge;
	}
	public String getLevelOfAutomation() {
		return levelOfAutomation;
	}
	public void setLevelOfAutomation(String levelOfAutomation) {
		this.levelOfAutomation = levelOfAutomation;
	}
	@Override
	public String toString() {
		return "WashingMachine "+
				                 "Price= "+super.getPrice()+
				                 "State= "+super.getState()+
				                 "Voltage= "+super.getVoltage()+
                                 "SerialNumber= "+super.getSerialNumber()+
				                 "Model= "+super.getModel()+
				                 "Marca= "+super.getBrand()+
	                             "maximunCharge= "+ maximunCharge + 
	                             "levelOfAutomation= " + levelOfAutomation ;
	}
	

}
