package ex1_operator;

public class Ex3_Operator {
	public static void main(String[] args) {
		
		
		System.out.println("----------------------");
		System.out.println("5. 증감 연산자"); 
		// 5. 증감 연산자 // 중요!!
		// 1씩 증가하시키거나 1씩 감소시키는 연산자
		// 선행증감과 후행증감의 차이점만 확실히 구별하자!
		int a = 10;
		System.out.println("a : " + ++a); // 선행 증가 11
		System.out.println("a : " + --a); // 선행 감소 10
		// 원래 가진 값에서 다이렉트로 1을 증가시키고 a값을 출력시킴
		
		int b = 10;
		System.out.println("b : " + b++); // 후행 증가 10
		// b값 출력을 다 끝내고 나서 ++를 인식하기때문에 출력에 영향을 주지 못함
		System.out.println(b); // 다음역할에선 증가가 되어있다 11
		
		b++; //11 / 12
		--b; //11
		--b; //10
		++b; // 11
		b--; // 11 / 10
		b--; // 10 / 9
		b++; // 9 / 10
		++b; // 11
		System.out.println(b--);
		// 값 : 11
		
		// 증감 연산자는 1씩만 증가시킬 수 있다.
		++b;
		++b;
		//2이상의 증감을 하려면 대입 연산자를 사용하는것이 좋다! 위 코드 줄이기!
		b +=2;
		
		
		
		System.out.println("----------------------");
		System.out.println("6. 삼항 연산자"); 
		//6. 삼항 연산자
		// 조건을 두고, 그 조건에 대한 결과가 참일때와 거짓일때에 따라 
		// 다른 대답을 돌려주는 연산자
		int aa = 10;
		int bb = 15;
		boolean res = ++aa >= b   ?   true : false  ;
	    //              비교연산          ?                 ;
		
		System.out.println(res); //false
		
		char res2 = ++aa < bb ? 'y' : 'n'; // 참이면 앞 : 거짓이면 뒤
		System.out.println(res2);
		
	}//main
}


















