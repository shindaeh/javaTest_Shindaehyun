package ncs.test04;

public class Product {

	String name; //상품이름
	int price; //상품가격
	int quantity; // 상품수량

	public Product() {

	} //기본 생성자 공백

	//매개변수 생성자 : this로 값을 줄때마다 초기화
	public Product(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	//get ,set 문장구현
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	//문자열 출력을 위해 String사용
	public String information() {
		//return "상품명:" + name+"\n가격:"+price+"\n수량:"+quantity ;
		return String.format("상품명 : %s\n가격 : %d 원\n수량 : %d 개", name, price, quantity);
	}
} // end class