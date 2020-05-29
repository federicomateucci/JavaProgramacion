package ejer3tp3;
import java.util.Scanner;
import java.util.ArrayList;

public class Test {
 static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int cutProgram = 0;
		String marca,modelo;
		
		ElectricStore elec1 = new ElectricStore("Garbarino");
		
		//Television flatTv = new Television("Sony","newLed","aaa222","220v","Off",1000,32,true);
		Television groundTv = new Television("SamSung","FlatLed","bbb222","120v","on",1500,27,false);
		Television flatTv1 = new Television("Sony","newLed","aaa222","240v","Off",1000,32,true);
		Television flatTv2 = new Television("Sony","newLed","aaa222","420v","Off",1000,32,true);
		//Television flatTv3 = new Television("Sony","newLed","aaa222","520v","Off",2000,32,true);
		
		
		Blenders speedBlender = new Blenders ("Atma","HighVPower","ccc123","120v","OFF",1000,200,23);
		Blenders speedBlender1 = new Blenders ("Atma","HighVPower","ccc123","120v","OFF",1000,200,23);
		Blenders speedBlender2 = new Blenders ("Atma","HighVPower","ccc123","120v","OFF",1000,200,23);
		Blenders speedBlender3 = new Blenders ("Atma","HighVPower","ccc123","120v","OFF",1000,200,23);
		Blenders speedBlender4 = new Blenders ("Atma","HighVPower","ccc123","120v","OFF",1000,200,23);
		elec1.addElectrodomestico(groundTv);
		elec1.addElectrodomestico(flatTv1);
		elec1.addElectrodomestico(speedBlender4);
		elec1.addElectrodomestico(speedBlender3);
		elec1.addElectrodomestico(speedBlender2);
		elec1.addElectrodomestico(speedBlender);
		elec1.addElectrodomestico(speedBlender1);
		elec1.addElectrodomestico(flatTv2);
		
		
	//System.out.println(elec1.getElectrodomesticos());
		

	elec1.showTheProducts();
		
		
		
		
	}
}
