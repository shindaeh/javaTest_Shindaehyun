package ncs.tset07;

//Human부모클래스 extends로 Student에 상속
public class Student extends Human {

	private String number;
	private String major;
	
	//공백생성자
	public Student() {
		
	}
	//name, age ,height , weight는 상속된거 갖고온거라 super로 객채초기화값 넣어야함.
	public Student(String name, int age, int height, int weight,
					String number, String major) {
		//super로 상속된거 갖고오기, 맨위에 써야함
		super(name, age, height, weight);
		this.number = number;
		this.major = major;
	}
	
	@Override
	public String toString() {
		return String.format("%s %10s %10s", super.toString(), number, major);
	}
	
} // end class
