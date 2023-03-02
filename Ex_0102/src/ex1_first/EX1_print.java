package ex1_first;

public class EX1_print {
    
	public static void main( String[] args ) {
		// 주석 : 컴파일 시 JVM이 인지 하지 못하는 메모용도의 텍스트 영역
		// main 메서드 : 컴파일 시 가장 먼저 호출되는 영역
		System.out.println( 100 ); // <-- 한 줄이 끝나면 반드시  ;로 마무리
		System.out.println(200);
		
		System.out.println( 500);
		
		// 문장을 입력하고자 할때는 "" 안에 출력하고자 하는 데이터를 넣어줘야한다.
		System.out.println( "안녕하세요");
		System.out.println(" 저는 고민지 입니다. ");
		
		// 연산자는 알아서 연산 후 결과를 보여줌
		System.out.println(10 + 10);
		System.out.println(10 * 10);
		System.out.println(10/5);
		System.out.println("10/5 = " + (10/5));
		
		// ""안에 있는것들은 무조건 문장(문자열)로 인식한다
		// "" 뒤에 정수를 이어붙이고싶으면 +를 써야한다!
		System.out.println("10*10 =" + 100);
		System.out.println("10*10 = " + 10 * 10);
		// "" 뒤에 붙는 모든 +는 이어붙인다로 인식한다
		System.out.println(" 5 + 1 = " + 5 + 1);
		System.out.println(" 5+2 = " + 5 + 2); //  5+2 = 52 로 나옴
		
		// "" 뒤에 붙는 -는 인식을 하지 못하므로 먼저 계산하게 하기위해서 괄호를 사용한다
		System.out.println(" 5 - 1 = " + ( 5 - 1 ));
		System.out.println("-1+5 = " + ( -1 + 5));
		
		// "" 앞을 더하기는 그냥 더하기로 먼저 계산한다 : 2 1 + 1 = 11
		System.out.println(1 + 1 + " 1 + 1 = " + 1 + 1 );
		// "" 앞에 곱하기여도 상관없음! : 1 1 + 1 = 11 
		System.out.println( 1 * 1 + " 1 + 1 = " + 1 + 1);
		
		System.out.println( 3 + 3 + " 5 + 5 = " + 7 + 8); // 6 5 + 5 = 78
		
		
	}
}
