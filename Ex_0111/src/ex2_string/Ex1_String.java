package ex2_string;

import java.util.Scanner;

public class Ex1_String {
	public static void main(String[] args) {
		
		// 주민 번호를 입력하세요
		// 예) 960621-1012345
		// 당신은 96년 6월 21일에 태어난 남자 입니다!
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호를 입력하세요.");
		System.out.println("예)901111-2222222");
		System.out.println(">> ");
		
		String id = sc.next();
		
		if( id.trim().length() < 14 || id.trim().charAt(6) != '-') {
			System.out.println("주민번호 형식이 올바르지 않습니다.");
		}else {
			String year = id.substring(0,2);
			String month = id.substring(3, 4);
			String date = id.substring(4, 6);
			String gender = id.substring(7, 8);
			if(gender.equals("1") || gender.equals("3")) {
				System.out.printf("당신은 %s년 %s월 %s일에 태어난 남자 입니다!",year,month,date,gender);
			}else if(gender.equals("2")|| gender.equals("4")){
				System.out.printf("당신은 %s년 %s월 %s일에 태어난 여자 입니다!",year,month,date,gender);
			}
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//m

}
