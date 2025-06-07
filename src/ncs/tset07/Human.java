package ncs.tset07;

public class Human {

	private String name;
	private int age;
	private int height;
	private int weight;

	// 공백생성자
	public Human() {
	}

	// 객체초기화값
	public Human(String name, int age, int height, int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public String toString() {
		return String.format("%s %5d %5d %5d", name, age, height, weight);
	}

}// end class
