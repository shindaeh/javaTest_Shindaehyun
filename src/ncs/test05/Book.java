package ncs.test05;

public class Book {
	
	String title;
	String author;
	int price; 
	String publisher;
	Double discountRate;
	
	public Book() {
		//기본생성자(공백)
	}
	
	public Book(String title,String author) {
		this.title = title;
		this.author = author;
	}
	
	public Book(String title,String author,int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public Book(String title,String author,int price,String publisher) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}
	
	public Book(String title,String author,int price,String publisher,Double discountRate) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
		this.discountRate =discountRate;
	}
	
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}

	public String getPublisher() {
		return publisher;
	}
	public Double getDiscountRate() {
		return discountRate;
	}
	
	// 할인된 가격 계산 메서드 추가
    public int getDiscountedPrice() {
        return (int)(price * (1 - discountRate));
    }

	public int getPrice() {
		return price;
	}
} //end class
