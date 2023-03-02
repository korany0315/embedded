package ex1_overload;

public class Ex1_Overload {
	// 메서드 오버로딩
	
	// 오버로딩은 메서드의 '중복정의'라고 하며 하나의 클래스내부에서
	// 같은 이름을 가진 메서드가 여러개 정의 되는것을 말한다.
	
	// 오버로드의 장점
	
	//** 오버로드를 위한 규칙**
	//1) 메서드 인자의 개수가 달라야 한다.
	//2) 인자의 개수가 같을때, 타입이 달라야한다
	//3) 인자의 수와 타입이 같을때, 인자 순서가 달라야한다
	
	
	public void result() {
		System.out.println("인자가 없는 메서드");
	}
	
	public void result(int n) { // 1)
		System.out.println("정수를 인자로 받는 메서드");
	}
	
	public void result(char c) { // 2)
		System.out.println("문자를 인자로 받는 메서드");	
	}
	
//	public void result(char ch ) { 
//		System.out.println(" 변수의 이름이 같아도 인자의 타입이 같으면 오류!");
//	}
	
	public void result(String s) { // 2)
		System.out.println("문장을 인자로 받는 메서드");
	}
	
	public void result(String s, int n) {
		System.out.println("문장, 정수 순으로 인자를 받는 메서드");
	}
	
	public void result(int n, String s) { // 3)
		System.out.println("정수, 문장 순으로 인자를 받는 메서드");
	}
	
	
	
	
	
	
}
