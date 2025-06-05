package ncs.test06;
//🌸 사용자로부터 키보드 입력을 받을 때 Scanner 클래스를 사용함
//→ 프로그램 실행 중에 사용자가 입력한 값을 읽어올 때 꼭 필요!
//→ (예) "2~5 사이의 정수를 입력하세요"라고 안내 후, 키보드에서 입력된 숫자를 받아오기 위해

import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		// Scanner 객체 생성: 사용자 입력을 받기 위해 준비
		// - new Scanner(System.in) → 키보드 입력(System.in)과 연결
		Scanner sc = new Scanner(System.in); // 사용자 입력 받는 객체 생성

		System.out.print("2~5 사이의 정수를 입력하세요: ");

		// 사용자 입력 받기
		// - sc.nextInt()는 사용자가 키보드에 입력한 숫자를 읽어와서 정수(int)로 저장
		// - 입력값은 data 변수에 저장
		int data = sc.nextInt(); // 사용자 입력 값 저장 (예: 3을 입력하면 data = 3)

		// 🌸 Calculator 객체 생성: 계산 기능(합계 계산)을 사용하기 위해 Calculator 클래스를 호출
		Calculator calc = new Calculator();

		try {
			// getSum 메서드를 호출: 사용자 입력 값(data)을 전달해서 계산 요청
			// - 내부에서 data 값 검증 (2~5 범위 확인)
			// - 범위 벗어나면 예외(InvalidException) 발생
			// - 정상 범위면 합계(double) 반환
			double result = calc.getSum(data);

			// 계산 성공 시, 결과 출력
			System.out.println("1부터 " + data + "까지의 합은 " + result + "입니다.");

		} catch (InvalidException e) {
			// 예외 발생 시, 오류 메시지 출력
			System.out.println(e.getMessage());
		}

	}// end main()
}// end class
