package ncs.test06;
//사용자 정의 예외 클래스
public class InvalidException extends Exception {

	//생성자 : 예외 메세지를 부모 Exception 클래스의 생성자로 전달
	public InvalidException(String message) {
		super(message);
	}	
}// end class
