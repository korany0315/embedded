package ex4_constructor;

public class Pen {

	private String brand;
	private String color;
	private int price;
	
	// 생성자를통해서 기본 정보를 담을 수 있다
	public Pen() {
		brand = "monami";
		color = "black";
		price = 500;
		
	}
	
	// 한정판 만들고 싶을때
	// 특정 생성자를 만들면 기본생성자도 만들어야 사용가능하다
	public Pen(String color, int price) {
		this.color = color;
		this.price = price;
		brand = "monami";
		
	}
	public void result() {
		System.out.println("브랜드 : " + brand);
		System.out.println("색상 : " + color);
		System.out.println("가격 : " + price);
		System.out.println("----------------");
	}
	
	
	
	
	
//	public void setBrand(String brand) {
//		this.brand = brand;
//	}
//	public void setColor(String color) {
//		this.color = color;
//	}
//	public void setPrice(int price) {
//		this.price = price;
//	}
}
