package ex1_scanner;

import java.util.Scanner;

public class Ex1_Scanner {
	public static void main(String[] args) {
		
		// Scanner : Ű���忡�� ���� �Է¹��� �� �ֵ��� ���ִ� Ŭ����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		System.out.println("�Է¹��� �� : "+ num);
		
		System.out.print("���� : ");
		String str = sc.next(); // next�� ������ �� ���� ����
								// ����123�� �ᵵ ���ڷ� �ν��� "123"
		System.out.println("��� : "+ str);
		
		
		
		
		
		
		
		
	}//main
}





















