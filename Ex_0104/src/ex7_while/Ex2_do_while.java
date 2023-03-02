package ex7_while;

import java.util.Random;

public class Ex2_do_while {
	public static void main(String[] args) {
		Random rnd = new Random();
		
		// do while : 선 처리 , 후 비교
		// 제어문들 중 유일하게 ; 으로 끝맺어야한다.
		// do{
		//  조건식이 참일때 실행되는 영역
		//} while( 조건식 );
		
		int i = 11;
		do {
			System.out.println(i);
			i++;
		}while(i <= 10);
		// while문과의 차이!
		// while 의 조건이 거짓이어도 조건을 보기전에 먼저 처리하기 때문에
		// i값 11을 한번 먼저 출력시킨다.
		// 오류여도 최소 한번은 출력이 된다.
		
		System.out.println("-------------------------------");
		
		// 변수 java, jsp, android에 랜덤으로
		// 0 ~130 사이의 값을 담는다.
		// do-while을 통해 세 과목의 점수가 0~100 사이 일때만
		// while을 빠져나와 각 과목별 랜덤성적을 출력
		// 결과 
		// 자바 : 92
		// jsp : 25
		// android : 100
		
		
		int java = 0;
		int jsp = 0;
		int android = 0;
		
		do {
			java = rnd.nextInt(131);
			jsp = rnd.nextInt(131);
			android = rnd.nextInt(131);
		}while( java>100 || jsp>100 || android>100);
		
		System.out.println("자바 : " + java);
		System.out.println("jsp : " + jsp);
		System.out.println("android : " + android);
		
		
	}//main
}

































