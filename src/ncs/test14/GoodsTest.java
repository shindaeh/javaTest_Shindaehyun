package ncs.test14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoodsTest {

	public static void main(String[] args) {
		Goods goods = null;
		System.out.println("다음 항목의 값을 입력하시오");
		//try오류발생할수있는 코드,catch(예외변수타입),오류 발생했을 때 실행할 코드
		try (InputStreamReader ir = new InputStreamReader
				(System.in);
				BufferedReader br = new BufferedReader(ir)) {
			System.out.print("상품명 : ");
			String name = br.readLine();
			System.out.print("가격 : ");
			int price = Integer.parseInt(br.readLine());
			System.out.print("수량 : ");
			int quantity = Integer.parseInt(br.readLine());
			goods = new Goods(name, price, quantity);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("입력된 결과는 다음과 같습니다.");
		System.out.println(goods.toString());
		System.out.println("총 구매 가격 : " + goods.getPrice() * goods.getQuantity() + "원");
		
	} //end main()
}// end class
