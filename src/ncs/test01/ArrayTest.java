package ncs.test01;

//[문제 1] 다음과 같은 조건을 만족하는 프로그램을 작성 하시오 
//2차원 배열에 들어 있는 데이터들의 합계와 평균을 구한다. 

public class ArrayTest {

	public static void main(String[] args) {
		int [][] array = {{12, 41, 36, 56, 21},
				{82, 10, 12, 61, 45},
				{14, 16, 18, 78, 65},
				{45, 26, 72, 23, 34}}; 
		// 합구하려면 합이 0임을 선언
		int sum = 0;
		// 소수점이 들어가는 평균구해야 하기 때문에 double 변수 선언 
		double avg;
		// 2차원 배열 합구하기
		for(int i = 0; i < array.length; i++) {
			//행의 인덱스 1개가 열이니까 arra[i].length가 되는 것
			for(int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
			}
		}
		System.out.println("합계:" + sum);
		
		// 정수를 소수점으로 변환해야 하니까 double
		avg = sum / (double)(array.length * array[0].length);
		System.out.println("평균:" + avg);
	 
			
	} //end main()

} //end class

//실행 결과  
//출력 결과는 다음과 같다. 소수점 아래 둘째자리까지 출력되게 한다. 
//합계 : 767.00  
//평균 : 38.35  
