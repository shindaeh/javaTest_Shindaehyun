package ncs.test10;

//추상클래스
//설계도처럼 생각
abstract class Employee {

	private String name;
	private int number;
	private String depatment; //부서
	private int salary; // 급여
	
	//기본생성자
	public Employee() {
	}
	
	//객체초기화값
	public Employee(String name, int number, String depatment, int salary) {
		this.name = name;
		this.number = number;
		this.depatment = depatment;
		this.salary = salary;
	}
	
	//세금
	public abstract double tax() ;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getDepatment() {
		return depatment;
	}
	
	public void setDepatment(String depatment) {
		this.depatment = depatment;
	}
	
	public int getSalary() {
		return salary;
	}
	//public void int setSalary 오류
	//void는 반환하지 않는다 인데 int는 정수로 반환한다는 뜻이되버린다.
	//그래서 void가 들어가면 int를 없애야한다.
	public void  setSalary(int salary) {
		this.salary = salary;
	}
	
} // end class
