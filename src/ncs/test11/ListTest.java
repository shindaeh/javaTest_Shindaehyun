package ncs.test11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest {
	public static void main(String[] args) {
		//List는 인터페이스,순서가있는 컬렉션 접근
		//<integer>제네릭 타입으로 정수형 데이터를 저장
		//ArrayList는 List를 구현한 클래스,배열자동생성
		List<Integer> list = new ArrayList<Integer>();
		//Random 무작위숫자생성, r객체생성
		Random r = new Random();
		
		//100까지 범위의 난수 설정
		for (int i = 0; i < 10; i++)
			//add : list에 요소 추가 
			list.add(r.nextInt(100) + 1);

		System.out.print("정렬 전 :");
		display(list);
		
		//sort - 정렬기준으로 오름차순 또는 사용자 정의 방식으로 정렬
		list.sort(new Decending());
		System.out.print("정렬 후 :");
		display(list);

	}// end main()

// list객체 display
	public static void display(List list) {
		System.out.println(list);
	}
} // end class
