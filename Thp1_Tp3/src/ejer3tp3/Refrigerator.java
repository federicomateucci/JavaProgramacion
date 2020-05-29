package ejer3tp3;

public class Refrigerator extends Electrodomestico {

	
	private int ltCapacity;
	private String isFrost;
	
	public Refrigerator(String brand, String model, String serialNumber, String voltage, String state, int price,int ltCapacity,String isFrost) {
		super(brand, model, serialNumber, voltage, state, price);
		setLtCapacity(ltCapacity);
	}
	@Override
	public void showForBuyList() {
		System.out.println(model+"--"+brand+"--"+ltCapacity+"--"+isFrost+"--"+"$"+price);
	}
	@Override
	public void showForTicket() {
		System.out.println(super.model+"--"+super.brand+"--"+"$"+super.price);
	}
	public int getLtCapacity() {
		return ltCapacity;
	}
	public void setLtCapacity(int ltCapacity) {
		this.ltCapacity = ltCapacity;
	}
	public String getIsFrost() {
		return isFrost;
	}
	public void setIsFrost(String isFrost) {
		this.isFrost = isFrost;
	}
	@Override
	public String toString() {
		return super.toString()+
	                           "ltCapacity=" + ltCapacity + 
	                           "isFrost=" + isFrost ;
	}
	
	
}
