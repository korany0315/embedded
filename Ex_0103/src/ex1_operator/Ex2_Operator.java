package ex1_operator;

public class Ex2_Operator {
	
	public static void main(String[] args) {
		
		System.out.println("----------------------");
		System.out.println("3. 비교연산자");
		// 3. 비교연산자
		// 값을 비교해서 참과 거짓을 판단하는 연산자
		int n1 = 10;
		int n2 = 20;
		boolean res = n1 < n2;
		System.out.println("n1 < n2 : " + res); // true
		
		res = n1 >= n2;
		System.out.println("n1 >= n2 : " + res); // false
		
		res = n1 == n2; // double equal
		System.out.println("n1 == n2 : " + res); // false
		
		res = n1 != n2; // not equal 
		System.out.println("n1 != n2 : " + res); // true
		
		
		
		
		System.out.println("----------------------");
		System.out.println("4. 논리연산자"); // 중요!!
		// 4. 논리 연산자
		// 비교연산자를 통한 연산이 두개 이상 필요할 떄 사용
		int age = 30;
		int limit = 35;
		//and(&&)연산자 : 앞의 연산이 거짓이면 뒤쪽 연산을 수행하지 않는다. 
		// (곱하기 처럼 생각하기  )
		// t && t = t ( 1 * 1 = 1 )
		// t && f = f ( 1 * 0 = 0 )
		// f && t = f 
		// f && f = f 
	    res = (limit - age) < 5 && age > 30;
		System.out.println("&& and 연산 : " + res);
		System.out.println(age); // 30 // 앞이 거짓이면 뒤는 확인하지 않아서 더하기를 하지 않았음
		
		int i1 = 10;
		int i2 = 20;
		// or(||) 연산자 : 앞의 연산이 참이면 뒤쪽 연산을 수행하지 않는다.
		// ( 더하기 처럼 생각하기)
		// t || t = t ( 1 + 1 = 2 )
		// f || t = t 
		// t || f = t 
		// f || f = f ( 0 + 0 = 0 )
		res = (i1 += 10) > 20 || i2 - 10 == 11;
		System.out.println("|| or 연산 : " + res);
		
		
		// not 연산자
		System.out.println("!연산자 : " + res);
		System.out.println("!연산자 : " + !res);
		System.out.println(res); // 원래 거짓이었고 !을 붙였을때만 임시적으로 반대로 하는것이라서 (영구적이지 않음)
		
		
		
		
	}//main
}




















