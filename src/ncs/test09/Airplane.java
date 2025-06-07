package ncs.test09;

public class Airplane extends Plane {

	// 기본 생성자
	public Airplane() {
	}
	
	//extends Plane(부모)한테 상속 했기 때문에 Plane 멤버변수 사용가능
	//super(planeName, fuelSize); 부모 클래스의 생성자에 값을 전달해야 하기 때문
	public Airplane(String planeName, int feulSize) {
		super(planeName, feulSize);
	}
	
	//추상메서드 distance
	public void flight(int distance) {
		
		super.fuelSize -= distance*3;
		System.out.println(super.fuelSize);
	}
} // end class
