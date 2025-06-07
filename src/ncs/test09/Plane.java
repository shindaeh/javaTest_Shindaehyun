package ncs.test09;

//추상메소드
//인스터스를 만들 수 없는 클래스 , 상속 전제로 설계된 클래스, 추상메서드를 포함할 수 있음.
//abstract가 붙은 메서드는 구현 없이 선언만 함
//abstract가 붙은 클래스는 직접 객체 생성 불가
//자식 클래스에서 꼭 구현(Override)해야 함

public abstract class Plane {
	
	protected String planeName;
	protected int fuelSize;
	
	//생성자 클래스
	public Plane() {
		super();
	}
	
	//객체초기화
	public Plane(String planeName, int fuelSize) {
		super();
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}
	
	public void refuel(int fuel){
		this.fuelSize += fuel;
		System.out.println(fuelSize);
	}
	
	public abstract void flight(int distance);
	
	//get , set
	public String getPlaneName() {
		return planeName;
	}

	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}

	public int getFuelSize() {
		return fuelSize;
	}

	public void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}
	
} // end class
