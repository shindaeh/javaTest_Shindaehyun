package ncs.test12;

public class Fruit {
	String name;
	int price;
	int quantity;

	//기본생성자
	public Fruit() {
		
	}
	//객체초기화
	public Fruit(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	//tostring
	public String toString() {
		return name + ", " + price + "원, " + quantity + "개";
	}
	
	//get, set
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getprice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getquantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}// end class
