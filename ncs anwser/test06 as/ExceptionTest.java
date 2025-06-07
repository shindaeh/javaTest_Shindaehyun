package ncs.test06;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		int data;
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 :" );
		data = sc.nextInt();
		sc.close();
		
		double sum = Calculator.getSum(data);
		
		System.out.println("결과값 : " + sum);

	}//end main()

}//end class
