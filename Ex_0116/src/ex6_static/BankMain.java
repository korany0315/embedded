package ex6_static;

public class BankMain {
	public static void main(String[] args) {
		
		Bank b1 = new Bank("신촌", "02-111-1111");
		Bank b2 = new Bank("이대", "02-222-2222");
		Bank b3 = new Bank("홍대", "02-333-3333");

//		하나하나 다 바꾸기에 너무 번거로움
		// 하나만 바뚸도 모두 바뀐다
//		b1.interest = 0.1f;
//		b2.interest = 0.1f;
//		b3.interest = 0.1f;
//		. . .
		
		// 유일하게 static변수만 유일하게 클래스를 통해서다이렉트 호출이 가능하다!
		// static 으로 지정된 변수나 메서드는
		// 클래스명.static변수 
		//형태로 바로 접근이 가능
		Bank.interest = 0.1f;
		
		
		
		b1.getResult();
		b2.getResult();
		b3.getResult();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
