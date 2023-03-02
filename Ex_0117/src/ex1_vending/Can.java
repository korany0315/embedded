package ex1_vending;

public class Can {
	private String canName;
	private int price;
	
	public Can( String canName, int price ) {
		//생성자
		this.canName = canName;
		this.price = price;
	}

	//getter만 만들어줌
	public String getCanName() {
		return canName;
	}

	public int getPrice() {
		return price;
	}
	
	
	
	
}
