package javaproject;

import java.util.Comparator;

public class Shop  {
	//1.상품조회 | 2.상품 추가 | 3.상품 삭제 | 4.리뷰보기 | 5.리뷰입력 | 6. 끝
	private String title; // 상품명
	private String search; // 추천상품
	private String plus; // 상품담기
	private String delete; // 상품삭제
	private double watch; // 리뷰보기
	private String review; // 리뷰 입력
	private String maker; // 제조사
	private String exp; // 유통기한
	private String type; // 타입
	private double total; // 점수
	
	public Shop() {	} //기본 생성자

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}
	
	public String getMaker() {
		return maker;
	}
	
	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	public String getExp() {
		return exp;
	}
	
	public void setExp(String exp) {
		this.exp = exp;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

}// end class
