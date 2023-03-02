package ex4_constructor;

public class PenMain {
	public static void main(String[] args) {
		
		Pen p1 = new Pen();
		p1.result();
		
		Pen p2 = new Pen();
		p2.result();
		
		// 생성자가 setter의 역할을 대신하고 있음
		// 값을 바꿀 수 없음!
		Pen p3 = new Pen("gold", 3000);
		p3.result();
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//main

}
