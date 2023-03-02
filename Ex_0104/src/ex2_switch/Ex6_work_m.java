package ex2_switch;
import java.util.Scanner;

public class Ex6_work_m {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 월을 입력 해주세요.");
		
		int month = sc.nextInt();
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println(month + "월은 31일 까지 입니다.");
			break;
		case 4: case 6: case 9: case 11: 
			System.out.println(month + "월은 30일 까지 입니다.");
			break;
		case 2:
			System.out.println(month + "월은 28일까지 입니다.");
			break;	
		default:
			System.out.println(month + "월은 없습니다.");		
		}
		
		
		
	}//
}





