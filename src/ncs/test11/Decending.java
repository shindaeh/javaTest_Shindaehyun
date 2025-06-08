package ncs.test11;

import java.util.Comparator;
//Comparator 객체들을 정렬할 수 있는 기준을 정의하는 인터페이스
//외부에서 따로 정의하고 싶을때 사용
//Integer 값을 내림차순으로 정렬하기 위해 Comparator 
public class Decending implements Comparator<Integer> {

	//오버라이드 필요
	@Override
	//음수,양수
	public int compare(Integer o1, Integer o2) {
		//오름차순
		//작은숫자가 앞으로 출력
		//return o1.compareTo(o2);
		
		//내림차순
		// 큰숫자가 앞으로 출력
		return o2.compareTo(o1);
	}
}// end class
