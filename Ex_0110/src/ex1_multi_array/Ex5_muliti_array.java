package ex1_multi_array;

import java.util.Scanner;

public class Ex5_muliti_array {
	public static void main(String[] args) {

		// 학생들의 이름 , 수학, 영어 성적을 등록하고 한번에 출력하고싶다.
		// 첫 실행시 몇명의 정보를 입력할 것인지를 키보드에서 받아서
		// 학생정보 등록 및 출력을 진행해보자
		
		// 등록 인원이 몇명입니까? : 2
		// 이름 : hong
		// 수학 : 90
		// 영어 : 87
		// ------------
		// 이름 : kim 
		// 수학 : 40
		// 영어 : 27
		//-------------
		// 2명 등록 완료
		// hong		90	87
		// kim		40	27
		
		Scanner sc = new Scanner(System.in);
		System.out.print("등록할 인원이 몇명입니까? ");
		int n = sc.nextInt();
		
		String[] info = {"이름 : ", "수학 : ", "영어 : ","국어: "};
		String[][] str = new String[n][info.length];
		
		for(int i =0; i<str.length; i++) {
			
			for(int j = 0; j<str[i].length; j++) {
				
				System.out.print(info[j]);
				str[i][j]= sc.next();
				
				
			}//inner
			
			System.out.println("---------------------");
		}//outer
		System.out.println( n + "명 등록 완료"); //str.length + "명 등록 완료"  도 가능
		
		for(int i = 0; i<str.length; i++) {
			
			for(int j = 0; j<str[i].length; j++) {
				
				System.out.printf("%s\t",str[i][j]);
				
			}//inner
			System.out.println();
		}//outer
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}// main
}


















