package javaproject;

import java.util.Comparator;

public class Movie implements Comparator<Movie> {
	private String title; // 영화 제목
	private double metacritic; // 메타크리틱 점수
	private double rottentomato; // 로튼토마토 점수
	private double naver; // 네이버 점수
	private double daum; // 다음 점수
	private double total; // 리뷰 총 점수
	private String review; // 리뷰
	private String producer; // 감독
	private String openning; // 개봉일
	private String genre; // 장르

	public String totalScore(double total) {
		double avg;
		total = getMetacritic() + getRottentomato() + getNaver() + getDaum();
		avg = total / 4.0;
		return String.format("%.2f", avg);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getMetacritic() {
		return metacritic;
	}

	public void setMetacritic(double metacritic2) {
		this.metacritic = metacritic2;
	}

	public double getRottentomato() {
		return rottentomato;
	}

	public void setRottentomato(double rottentomato) {
		this.rottentomato = rottentomato;
	}

	public double getNaver() {
		return naver;
	}

	public void setNaver(double naver) {
		this.naver = naver;
	}

	public double getDaum() {
		return daum;
	}

	public void setDaum(double daum) {
		this.daum = daum;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getOpenning() {
		return openning;
	}

	public void setOpenning(String openning) {
		this.openning = openning;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public int compare(Movie o1, Movie o2) {
		return o1.getTitle().compareTo(o2.getTitle());
	}
}
