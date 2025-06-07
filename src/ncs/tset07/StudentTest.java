package ncs.tset07;

public class StudentTest {
	public static void main(String[] args) {

		//Student클래스의 배열 3개 생성 st객체 생성
		Student[] st = new Student[3];
		//배열에 값 넣기
		st[0] = new Student("홍길순", 25, 171,81,"201401","영어영문학");
		st[1] = new Student("한사랑", 23,183,72,"201402", "건축학");
		st[2] = new Student("임꺽정", 26, 175, 65, "201403", "체육학");
		
		//반복문 실행
		//인덱스 배열값이 0일때 st배열의 인덱스 값이 1씩 증가
		for(int i=0; i<st.length; i++) {
			System.out.println(st[i]);
		}
	} //end main()
} //end class
