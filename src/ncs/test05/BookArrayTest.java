package ncs.test05;

public class BookArrayTest {

	public static void main(String[] args) {
		// 배열이니까 
		 Book[] bArry = new Book[3]; // 배열만 3개 만들었음, 객체안에 값은 없음
		 bArry[0] = new Book("자바의 정석", "남궁성", 30000, "도우출판", 0.1); // Book 객체를 3개 생성 값입력.
		 bArry[1] = new Book("열혈강의 자바", "구정은", 29000, "프리렉", 0.1);
		 bArry[2] = new Book("객체지향", "금영욱", 30000, "북스홈", 0.1);
		 // 배열에 넣는다
		 
		 //인덱스 정수로 int 만들고 i = 0인덱스가 0일때 값으로 설정
		 for(int i=0 ; i < bArry.length; i++) {
			 System.out.println(bArry[i].getTitle() + ", " + bArry[i].getAuthor() + ", " 
		                + bArry[i].getPublisher() + ", " + bArry[i].getPrice() + "원, " 
		                + (int)(bArry[i].getDiscountRate() * 100) + "% 할인");
			 System.out.println("할인된 가격 :" + bArry[i].getDiscountedPrice() + "원");
		 }
		// 배열에 있는 객체 정보를 모두 getter 로 출력 한다. – for 문을 이용 할 것 
		// 실행 결과와 같이 계산 출력 
		 
	} //end main()

	} //end class

/*
Book b1 = new Book();
Book b2 = new Book();
Book b3 = new Book();

Book[] bArray = new Book[3]; // 배열 만들고
bArray[0] = b1;              // 이미 만든 객체 넣기
bArray[1] = b2;
bArray[2] = b3;
이렇게도 가능하다.
*/