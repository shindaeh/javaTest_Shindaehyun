package ncs.test04;

import java.util.Scanner;

public class ProductTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("상품명 : ");
		String name = sc.nextLine();
		System.out.println("상품가격 : ");
		int price = sc.nextInt();
		System.out.println("상품수량 : ");
		int quantity = sc.nextInt();	
		sc.close(); // 스캐너종료
		
		//Product 객체 생성
		Product product = new Product(name,price,quantity);
		System.out.println(product.information());
		System.out.println();
		System.out.printf("총 구매 가격: %d 원",  product.getPrice()*product.getQuantity());
	} // end main()
} // end class
