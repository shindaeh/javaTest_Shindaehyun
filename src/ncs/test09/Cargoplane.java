package ncs.test09;

public class Cargoplane extends Plane {

	public Cargoplane() {
		
	}
	
	public Cargoplane(String planName, int fuelSize) {
		super(planName,fuelSize);
	}
	
	public void flight(int distance) {
		super.fuelSize -= distance*5;
		System.out.println(super.fuelSize);
	}
	
}//end class
