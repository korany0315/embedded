package ex4_constructor;

public class Pen {

	private String brand;
	private String color;
	private int price;
	
	// �����ڸ����ؼ� �⺻ ������ ���� �� �ִ�
	public Pen() {
		brand = "monami";
		color = "black";
		price = 500;
		
	}
	
	// ������ ����� ������
	// Ư�� �����ڸ� ����� �⺻�����ڵ� ������ ��밡���ϴ�
	public Pen(String color, int price) {
		this.color = color;
		this.price = price;
		brand = "monami";
		
	}
	public void result() {
		System.out.println("�귣�� : " + brand);
		System.out.println("���� : " + color);
		System.out.println("���� : " + price);
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
