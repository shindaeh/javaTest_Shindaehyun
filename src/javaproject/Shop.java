package javaproject;

import java.util.Comparator;

public class Shop implements Comparator<Shop> {

	private String title; // 상품명
	private String search; // 추천상품
	private String plus; // 상품담기
	private String delete; // 상품삭제
	private double watch; // 리뷰보기
	private String review; // 리뷰 입력
	private String maker; // 제조사
	private String exp; // 유통기한
	private String type; // 타입
	private double total; // 리뷰 총 점수
	private double userone; // User 1 점수
	private double usertwo; // User 2 점수
	private double userthree; // User 3 점수
	private double userfour; // User 4 점수

	//  기본 생성자
	public Shop() {
	}

	//  모든 주요 필드를 초기화하는 생성자
	public Shop(String title, String maker, String exp, String type) {
		this.title = title;
		this.maker = maker;
		this.exp = exp;
		this.type = type;
	}

	//  리뷰 평균 계산 메서드
	public String totalScore() {
		double total = getUserone() + getUsertwo() + getUserthree() + getUserfour();
		double avg = total / 4.0;
		return String.format("%.2f", avg);
	}

	//  getter / setter 정리 (이름 및 역할 정확하게)

	public double getUserone() {
		return userone;
	}

	public void setUserone(double userone) {
		this.userone = userone;
	}

	public double getUsertwo() {
		return usertwo;
	}

	public void setUsertwo(double usertwo) {
		this.usertwo = usertwo;
	}

	public double getUserthree() {
		return userthree;
	}

	public void setUserthree(double userthree) {
		this.userthree = userthree;
	}

	public double getUserfour() {
		return userfour;
	}

	public void setUserfour(double userfour) {
		this.userfour = userfour;
	}

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

	@Override
	public int compare(Shop o1, Shop o2) {
		return o1.getTitle().compareTo(o2.getTitle());
	}
}

