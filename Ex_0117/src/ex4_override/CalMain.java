package ex4_override;

// 메인 클래스
public class CalMain {
public static void main(String[] args) {
		
		int res = 0;
		
		CalPlus cp = new CalPlus();
		res = cp.getResult(10, 5);
		System.out.println("plus : " + res);
		
		
		CalMinus cm = new CalMinus();
		res = cm.getResult(10, 5);
		System.out.println("minus :" +res);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main
	

}
