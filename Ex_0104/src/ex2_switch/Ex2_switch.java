package ex2_switch;

import java.util.Scanner;

public class Ex2_switch {
	public static void main(String[] args) {
		
		
		String str = "B";
		
		switch (str) { // �񱳰�
		case "A" :// ���ǰ��� Ÿ���� �ݵ�� ��ġ�ϰ�
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
			System.out.println("59����");
		
		default:
			System.out.println("�ùٸ� ������ �ۼ��ؾ� �մϴ�.");
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
		
		System.out.println("�Է����ּ���");
		String str3 = sc.next(); 
		
		switch(str3) {
		case "woo":
			System.out.println("����� ���� �Դϱ�?");
			
		case "ko":
			System.out.println("����� �����Դϱ�?");
		}
		
		
		
		
		
		
	}//
}












