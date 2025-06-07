package ncs.tset08;

//clone의 CloneNotSupportedException 사용하려면 Cloneable impleaments해야한다.
//throws 필요
public class User implements Cloneable{
	
	String id;
	String password;
	String name;
	int age;
	char gender;
	String phone;
	
	//공백생성자
	public User() {
	}
	//객체초기화
	public User(String id, String password, String name, int age, char gender, String phone) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}
	
	//get,set 설정
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	// \t는 탭(띄어쓰기)
	@Override
	public String toString() {
		return id + "\t" + password + "\t" + name + "\t" + age + "\t" + gender + "\t" + phone;
	}
	
	//equals 메서드는 두 객체가 같은지 비교하는 메서드
	//문자열로 비교
	@Override
	public boolean equals(Object obj) {
		return this.toString().equals(obj.toString());
	}

	//clone 메서드는 현재 객체를 복제(복사)해서 새로운 객체를 만들어 반환하는 메서드
	//
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
} // end class
