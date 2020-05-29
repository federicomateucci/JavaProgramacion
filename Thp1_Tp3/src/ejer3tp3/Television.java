package ejer3tp3;

public class Television extends Electrodomestico {
	
	
	private int dimension;
	private boolean IsSmart;
	
	
	public Television(String brand, String model, String serialNumber, String voltage, String state, int price,int dimension,boolean IsSmart) {
		super(brand, model, serialNumber, voltage, state, price);
		setDimension( dimension);
		setIsSmart(IsSmart);
		
	}
	
	@Override
	public void showForBuyList() {
		System.out.println(model+"--"+brand+"--"+dimension+"--"+isSmart(IsSmart)+"--"+"$"+price);
	}
	@Override
	public void showForTicket() {
		System.out.println(super.model+"--"+super.brand+"--"+"$"+super.price);
	}
	
	private String isSmart(boolean value) {
	String valueOf;
	if(value) {valueOf = "Smart TV";}
	else {valueOf = "SmartTvNOOOOO";}
	return valueOf;
	}
	
	
	public int getDimension() {
		return dimension;
	}
	public void setDimension(int dimension) {
		this.dimension = dimension;
	}
	public boolean getIsSmart() {
		return IsSmart;
	}
	public void setIsSmart(boolean isSmart) {
		IsSmart = isSmart;
	}
	@Override
	public String toString() {
		return super.toString() +
	                       " dimension=" + dimension + 
				           "IsSmart=" + IsSmart  ;
	}
	
	

}
