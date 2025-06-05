package ncs.test06;
//합계 계산 기능을 제공하는 클래스
// 사용자 입력값이 2~5의 범위를 벗어나면 InvalidException을 발생시킴

public class Calculator {
	//기본생성자
	public Calculator() {}
	
	// 1부터 data까지 합을 계사하는 메서드
	// data가 2~6범위를 벗어나면 InvalidException예외발생
	// getSum : 입력된 data를 검증하고 1부터 data 까지의 합을 계산하는 역할
	// - 입력값이 범위(2~5)를 벗어나면 InvalidException 발생 (예외 던짐)
    // - 정상 값이면 합계를 계산하고 반환
	public double getSum(int data) throws InvalidException {
		//입력값 검증 2~5 범위를 벗어나면 예외 발생시킴
		if (data < 2 || data > 5) {
			// 잘못된 입력값이 때 InvalidException발생
			throw new InvalidException("입력 값에 오류가 있습니다.");
	}	
		
	//정상적인 경우: 1부터 data까지의 합 계상	
	int sum = 0;
	for (int i = 1; i < data; i++) {
		sum += 1;
	}
		//계산된 합계를 double 타입으로 반환
		return (double) sum;
	}
		
}//end class 