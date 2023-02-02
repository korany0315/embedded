package ex4_work;

import java.util.Random;
import java.util.Scanner;

public class UpdownMain {
	public static void main(String[] args) {
		
		// 1~50 사이의 난수 발생시킨다.
		// 메인클래스에서 정수값을 입력받는다
		// 입력받은값이 up인지 down인지 정답인지를 판단
		// 정답인 경우 main크래스의 while문을 빠져나가도록 처리
		
		// 숫자 : 30
		// DOWN
		// 숫자 : 15
		// UP
		// 숫자 : 25
		// 3회 만에 정답!
		
		Scanner sc = new Scanner(System.in);
		Updown ud = new Updown();
		
		
		Updown updown = new Updown(); // 
		
		while(true) {
			// up down및 정답 처리
			// 정답인 경우 while문을 빠져나가기
			
			System.out.println("숫자 : ");
			int n = sc.nextInt();
			boolean res = ud.checkResult(n);
			
			if(res) { // res == true res만 있으면 참인지 물어보는 것
				//정답을 맞힌 경우 
				break; //while문을 빠져나간다.
				
				
			}
		}//while
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main
}
















