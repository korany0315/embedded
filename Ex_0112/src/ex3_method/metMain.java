package ex3_method;

public class metMain {
	public static void main(String[] args) {
		
		Method1 m1 = new Method1();
		m1.test1();
		
		int su = 100;
		su = m1.test2(su); // 값을 넘길땐 파라미터 
					// 메서드로 호출을 하면 지역변수이기때문에 값이 돌아왔을때 이후에 소멸됨
		System.out.println("su : " + su);
		
		
		String res = m1.test3("nyang", 9);
		System.out.println(res);
		
		res = m1.test3("woo", 27);
		System.out.println(res);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main
}
