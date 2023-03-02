package ex1_if;

import java.util.Scanner;

public class Ex4_work1_m {
	public static void main(String[] args) {
	/*
	 * 성과급 계산 프로그램
	 * 
	 * 실적액을 입력받고 300만원 이상이면 50만원, 200만원이상이면 30만원, 100만원이상이면 20만원 
	 * 그 미만은 보너스 없음
	 * +1,000원 단위로 ,를 넣어주세요
	 * 
	 * 실적액은 360만원
	 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("실적액을 입력하세요.");
		int goal = sc.nextInt();
		
		if(goal>=300) {
			System.out.println("성고급은 50만원입니다.");
		}else if( goal >=200) {
			System.out.println("성과급은 30만원 입니다.");
		}else if (goal>100) {
			System.out.println("성과급은 20만원 입니다.");
		}else {
			System.out.println("성과급은 없습니다.");
		}
		
		
		
//		int goal = 3600000;
//		if(goal>= 3000000) {
//			System.out.println("축하합니다. 성과급은 500,000원 입니다.");
//		}else if(goal>= 2000000) {
//			System.out.println("축하합니다. 성과급은 300,000원 입니다.");
//		}else if(goal>= 1000000) {
//			System.out.println("축하합니다. 성과급은 200,000원 입니다.");
//		}else {
//			System.out.println("성과급은 없습니다.");
//		}
//		
		
		
		
		
		
	}//

}











