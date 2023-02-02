package ex7_work;
//음료수도 객체이기 때문에 클래스가 필요함!
public class Can_Const {
	 private String canName;
	 private int price;
	 
	 public Can_Const(String canName,int price ) {
		 this.canName = canName;
		 this.price = price;
	 }
	 
	public String getCanName() {
		return canName;
	}
	public void setCanName(String canName) {
		this.canName = canName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	 
//	 

}
