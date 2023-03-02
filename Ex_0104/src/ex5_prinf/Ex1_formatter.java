package ex5_prinf;

public class Ex1_formatter {
	public static void main(String[] args) {
		
		/*
		 포멧터 : 사용할 데이터의 결과를 원하는 구조로 출력 가능하게 해주는 문법
		 */
		
		// 오늘은 23년 01월 05일 입니다.
		
		int y =23;
		int m = 16;
		int d = 5;
		
		System.out.println("오늘은 " + y + "년 " + m + "월 "+ d + "일 입니다.");
		System.out.printf("오늘은 %d년 %03d월 %02d일 입니다.\n", y, m, d);
		
		// print 뒤에 f 를 붙여준다.
		// %d : 앞으로 값이 변경 될 변수를 뒤에 콤마로 붙여준다. 순차적으로!
		// %02d월 : 두자리를 만들건데 숫자가 없으면앞에 0을 붙여줘
		
		// \n : 줄변경
		
		
		// 오늘의 날씨는 13.5도 입니다.
		System.out.printf("오늘의 날씨는 %.2f도 입니다.\n", 13.05f);
		
		/*
		    1. %d : 정수
		    2. %f : 실수
		    3. %c : 문자
		    4. %s : 문자열
		    5. %% : %를 출력하려는 목적
		    
		     %.1f도 : 소숫점 한자리까지 표시하고싶을때 
		    
		 */
		
		// 저는 A형 입니다.
		char bt = 'B';
		System.out.printf("저는 %c형 입니다. \n", bt);
		
		// 제 이름은 고민지 입니다.
		System.out.printf("제 이름은 %s 입니다. \n", "고민지");
		
		// 오늘은 100% 이해 했습니다.
		System.out.printf("오늘은 %d%% 이해 했습니다. \n", 100);
		
	}//main
}



























