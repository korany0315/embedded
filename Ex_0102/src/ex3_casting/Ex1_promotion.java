package ex3_casting;

public class Ex1_promotion {
	public static void main(String[] args) {
		
		// 캐스팅 (형변환)
		// 서로 다른 자료형 간의 값을 주고받기 위한 문법(개념)
		
		// 1.프로모션 캐스팅
		// 	- 큰 자료형에 작은 자료형을 대입하는 것 (자동)
		double d = 100.5; // 8.xxbyte
		int n = 200; // 4byte
		d = n ; // 오른쪽 값을 왼쪽에 넣어라
		System.out.println(d); // 200.0
		
		char c = 'A'; // 2byte
		int n1 = 100;  // 4byte
		n1 = c;
		System.out.println(n1); // A에 해당하는 아스키코드값 65가 출력된다.
		

	}//main
}
