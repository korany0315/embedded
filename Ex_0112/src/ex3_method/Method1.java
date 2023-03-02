package ex3_method;

public class Method1 {

	// 메서드의 구성 및 정의

	// void는 빈손으로 돌아감
	public void test1() {
		System.out.println("안녕하세요");

	}

	public int test2(int n) {
		// 반환형이 void가 아닌경우, 마지막에 반드시
		// return값이 포함되어있어야함!!
		n += 100;
		System.out.println("n: " + n);

		// 리턴값은 반드시 반환형 타입과 맞춰야 함!
		// 값을 돌려보낼땐 리턴!
		return n;
		// 리턴은 딱 한개만 보낼 수있다.
		// System.out.println(); 리턴 이후 작성 불가
	}
	
	public String test3( String s , int n) {
		String str = "저는" + s + "이고" +n  + "세입니다.";
		return str;
	}
	
	
}
