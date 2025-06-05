package javaproject;

import java.util.ArrayList;
import java.util.Scanner;

public class Javaproject {
	
	// Scanner = sc 객체생성, (System.in)
	private static Scanner sc = new Scanner(System.in);
	// Shop 생성자에 입력한 메뉴정보를 넣은 리스트를 olive 객체로 만듦
	private static ArrayList<Shop> olive = new ArrayList<>();

	public static void main(String[] args) {

		// boolean으로 choic변수 지정 후 true , false 값을 나오게 함
		boolean choic = true;

		while (choic) {
			// 메뉴출력
			System.out.println("|=====================Daehyun Shop===========================|");
			System.out.println("|------------------------------------------------------------|");
			System.out.println("| 1.상품조회 | 2.상품담기 | 3.상품삭제 | 4.리뷰보기 | 5.리뷰입력 | 6. 끝   |");
			System.out.println("|------------------------------------------------------------|");
			System.out.println("                     번호를 입력해주세요.                           ");

			// 콘솔창에 번호(int) 입력받기
			// 사용자로부터 한 줄 입력을 받아서, 정수로 변환한 후 selectNum 변수에 저장한다
			// scanner.nextLine() 사용자 입력을 한줄 전체를 문자열로 읽는다.
			// nextLine()은 사용자가 입력하고 enter를 칠 떄까지의 전체 문자열은 가져온다.(공백포함)   
			// Integer.parseInt()문자열을 정수(int)로 바꿔주는 메서드
			// int selectNum = selectNum이라는 int 변수에 저장
			int selectNum = Integer.parseInt(sc.nextLine());
			//switch문은 int, String, char, enum만 받을 수 있고, boolean은 switch에서 쓸 수 없어요.
			switch (selectNum) {
			case 1:
				searchCos();
				break;
			case 2:
				plusCos();
				break;
			case 3:
				deleteCos();
				break;
			case 4:
				reviewWatch();
				break;
			case 5:
				review();
				break;
			case 6:
				choic = false;
				System.out.println("                   이용해 주셔서 감사합니다.                         ");
				break;
				
			default:
				System.out.println("                     다시 입력해주세요.                            ");
			}

		} // end while

	}// end main

	//1.상품조회
	private static void searchCos() {
		System.out.println("                     상품을 입력해주세요.                           ");
		// 사용자가 입력한 한 줄을 문자열로 받아서, 그 값을 Shop 변수에 저장한다."
		String shop = sc.nextLine();
		//검색 결과가 없을 경우를 나타내기 위한 변수, 기본값은 false
		boolean nonResult =false;
		// for(반복)문 olive 리스트의 크기만큼  (0부터 시작)
		for (int i = 0; i < olive.size(); i++) {
		// olive 리스트에서 i번째 Shop 객체를 꺼내서 s에 저장
			Shop s = olive.get(i);
			if(s.getSearch().equals(shop)) {
				nonResult = true;
				System.out.println("| 상품 : " + s.getSearch() + " | 제조사 : " + s.getMaker() + " | 유통기한 : "
						+ s.getExp() + " | 타입 : " + s.getType() + " | 평점 : " + s.getTotal() + " |");
				System.out.println("| 리뷰 : " + s.getReview());
				break;
			}//end if
			
			//전체 조회
			//if()
			
	
			
		// 등록되지 않은 상품 구문
			if (!nonResult) {
				System.out.println("                  아직 등록되지 않은 상품입니다.                      ");
				System.out.println("                      다시 검색해 주세요.                          ");
			} 
		}//end for
	}//end serchCos
	
	// 2. 상품 추가
	private static void plusCos() {
		System.out.print("상품명 : ");
		String title = sc.nextLine();
		System.out.print("제조사 : ");
		String maker = sc.nextLine();
		System.out.print("유통기한 : ");
		String exp = sc.nextLine();
		System.out.print("타입 : ");
		String type = sc.nextLine();
		sc.nextLine();
		Shop s = new Shop();
		s.setTitle(title);
		s.setMaker(maker);
		s.setExp(exp);
		s.setType(type);
		olive.add(s);
		System.out.println("                    상품이 추가되었습니다.                          ");

	}//end plusCos

	private static void deleteCos() {
		System.out.println("상품명 : ");
		String Shop = sc.nextLine();
		boolean noneResult = false;
		for (int i = 0; i < olive.size(); i++) {
			Shop s = olive.get(i);
			if(s.getTitle().equals(olive)) {
				noneResult = true;
				Shop.remove(i);
				System.out.println("                    상품이 삭제되었습니다.                          ");
				break;
			}
		}
	}// end deleteCos

	private static void reviewWatch() {
		System.out.println("");
	}

	private static void review() {
		System.out.println("");
	}

}// end class
