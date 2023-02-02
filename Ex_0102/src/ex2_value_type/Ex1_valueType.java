package ex2_value_type;

public class Ex1_valueType {
	
	public static void main(String[] args) {
		
		// 기본자료형(valueType) : 그릇과 같음
		/*
		 논리형 : boolean - 1bit
		 문자형 : char - 2byte
		 정수형 :  byte - 1byte ..... -128 ~ 127
		 	 	short - 2byte..... -32768 ~ 32767
		 		int - 4byte ...... -21억 ~ 21억
		 		long - 8byte...... -900경 ~ 900경
		 실수형 : float - 4.xxbyte
		 		double - 8.xxbyte
		 */
		
		// 변수 : 특정값을 저장하기 위한 공간
		// 그릇(자료형)을 구별하는 식별자
		
		// 변수 선언 규칙!
		// 1) 자료형 변수명; (선언)
		// 2) 변수명 = 값; (대입)
		// 3) 자료형 변수명 = 값; (초기화 :선언과 대입을 동시에)
		
		// 변수 선언 시 주의사항!
		// 1) 같은 영역에서 변수이름을 중복되지 않도록 한다
		// 2) _를 제외하고는 특수문자를 포함할 수 없다
		// 3) 변수명은 반드시 소문자로 시작한다!!!!
		// 4) 숫자로 시작 할 수 없으며 반드시 영문으로 작성 할 것.
		
		// 1) 논리형 boolean
		// 참과 거짓. true와 false값 만을 저장하는 자료형 타입
		boolean b;
		b = true;
		b = false;
		
		// 자료형 타입에 맞는 값을 넣어줘야한다! 
		// boolean b2 = 1; (X)
		System.out.println( b );
		
		b = true;
		System.out.println(b);
		
		// 2) 문자형 char
		// ''안에 딱 한글자만 저장 가능한 자료형
		char c = 'A';
		System.out.println("c : " + c);
		
		char e = 'd';
		System.out.println(e);
		System.out.println("e : " + e);
		
		char c2 = 65 + 1;
		// 아스키코드표 상의 66의 10진수 값이 B이다...
		System.out.println("c2 : " + c2); // c2 : B
		
		// 아스키코드표에 B는 66인데 1을 더해서 67이 됨 그래서 c3값은 67 => 아스키 코드표 상의 C
		char c3 = 'B' + 1;
		System.out.println("c3 : " + c3); // c3 : C
		
		
		// 3) 정수형 byte, short, int, long
		// byte by = 123;
		int n1 = 2100000000; // 21억까지 가능
		
		// java는 실행속도를 빠르게 처리하기 위해서 정수형 자료형은 기본적으로 int로 인식한다.
		// 따라서 이번만은 long값으로 인식하게 하고싶을때 
		// 뒤에 L을 붙여준다 (대소문자 구분 안함)
		// int의 범위를 벗어나는 값을 long타입에 저장하려면 반드시 L키워드를 추가해야한다.
		long n2 = 2200000000L; 
		
		System.out.println("long값 : " + n2);
		
		// 4) 실수형  float double
		// 소수점을 가진 값들을저장하기 위한 자료형
		float f1 = 3.14F;
		double f2 = 3.14;
		System.out.println("f1 : " + f1);
		System.out.println("f2 : " + f2);
		
		f1 = 100;
		f2 = 200;
		// 실수형 자료형타입에 정수를 넣어도 알아서 정수를 .0을 붙여서 실수 타입으로 바꾼다.
		System.out.println(f1); // 100.0
		System.out.println(f2); // 200.0 
		
		
		
		
		// 연습장 
		/*
		 * 자료형의 종류
		 * 1. 논리형 : boolean : 참과 거짓 1bit
		 * 2. 문자형 : char "" 무조건 큰 따옴표 안에 있어야함 딱 한글자만 가능
		 * 		정수형 char는 한글자의 결과밖에 못얻지만 숫자 더하기를 쓸수 있는것은 아스키 코드표에 80에
				대응 하는 알파벳(p)가 존재하기 때문에 한글자 정수로 인식할 수 있다.
		
		 * 2. 정수형 : byte short int long
		 * 
		 * 			byte - 2byte 
		 * 			short - 거의 사용하지 않음
		 * 			int - 많이 사용함 / -21억~21억까지 가능 / 
		 * 			long - 22억 이상부터인데 인식시켜주기 위해 l키워드를 추가 해야함
		 * 4. 실수형
		 */
		char f = 35 + 45;
		System.out.println("f : " + f);
		
		System.out.println("f+1 : " + (f+1));
		
		char g = 'P' + 1;
		System.out.println("g : " + g);
		
		
		
		
		
	} // main
}
