package ncs.test10;

public class Sales extends Employee implements Bonus {

	//기본생성자
	public Sales() {
	}
	
	//extends Employeer값 입력
	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}
	
	public double tax() {
		return super.getSalary()*0.13;
	}
	
	public void incentive(int pay) {
		int sum = (int)(getSalary() + pay*1.2);
		setSalary(sum);
	}
	
} // end class
