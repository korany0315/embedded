package ex2_switch;

import java.util.Scanner;

public class Ex2_switch {
	public static void main(String[] args) {
		
		
		String str = "B";
		
		switch (str) { // 비교값
		case "A" :// 조건값의 타입은 반드시 일치하게
			System.out.println("90 ~ 100");
			break;
			
		case "B":
			System.out.println("80 ~ 89");
			break;
			
		case "C":
			System.out.println("70 ~ 79");
			break;
			
		case "D":
			System.out.println("60 ~ 69");
			break;
			
		case "F":
			System.out.println("59이하");
		
		default:
			System.out.println("올바른 성적을 작성해야 합니다.");
			break;
		}
		
		
		String str2 = "woo";

		switch(str2) {
		case "ko":
			System.out.println("Are u minzi?");
			break;
		case "woo":
			System.out.println("U are jinny!");
			break;
		}
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("입력해주세요");
		String str3 = sc.next(); 
		
		switch(str3) {
		case "woo":
			System.out.println("당신은 진이 입니까?");
			
		case "ko":
			System.out.println("당신은 민지입니까?");
		}
		
		
		
		
		
		
	}//
}












