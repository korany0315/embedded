package ex6_static;

public class Ex1_StaticTest {
	
	String str1 = "일반 멤버변수";
	static String str2 = "스테틱 변수";
	
	public void test1() {
		//일반 메서드에서는 static변수와 일반변수를 모두 사용할 수 있다.
		str1 = "hi";
		str2 = "hello"; 
		
		// 일반 메서드에서는 static키워드를 가진 변수를만들 수없다.
		//static String str3 = "빈값";
		
		int num = 100; // 지역 변수로 일반변수를 사용하는것은 가능
		
		// static메서드에서는 static변수를 지역변수로 생성하는것이 불가
		// static int num6 = 300;
	}
	
	public static void test2() {
		// static 메서드에서는 일반 멤버변수 사용이 불가능하다
		// str1 = "hi";
		str2 = "hello";
	}
	
	
	
	
	
	
	

}
