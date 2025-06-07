package ncs.tset08;

public class UserTest {
	//호출하는 쪽에 throws CloneNotSupportedException있어야한다...ㅠㅠ
	public static void main(String[] args) throws CloneNotSupportedException {
		//User 배열 생성 배열의 users객체 생성 
		User[] users = new User[3];
		users[0] = new User("user01", "pass01", "김철수", 32, 'M', "010-1234-5678");
		users[1] = new User("user02", "pass02", "이영희", 25, 'F', "010-5555-7777");
		users[2] = new User("user03", "pass03", "황진이", 20, 'F', "010-9874-5632");
		
		//users list
		System.out.println("users list --------------------------------------------");
		//반복문 실행
		for(int i=0; i<users.length; i++) {
			//users객체호출 tostring 리턴값 출력 
			System.out.println(users[i].toString());
		}
		
		User[] copyUsers = new User[users.length];
		for(int i=0;i<users.length;i++){			
			copyUsers[i]=(User)users[i].clone();
		}
		
		System.out.println("CopyUsers --------------------------------------------");
		for(User u :copyUsers){
			System.out.println(u);
		}
		System.out.println("비교결과 --------------------------------------------");
		for(int i=0; i< users.length; i++){
			System.out.println(users[i].equals(copyUsers[i]));			
		}
		
	}// end main
}// end class
