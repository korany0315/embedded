package ex3_work;

import java.util.Scanner;


public class WorkMain {
	public static void main(String[] args) {
		
		/*
		 * �Ʒ��� ���� ����� ����ϵ�,
		 * 	try-catch ������ ������� �ʰ� �ڵ带 �ۼ��� ������
		 	���� : 123
		 	123�� �����Դϴ�.
		 	
		 	���� : ab91
		 	ab91�� ������ �ƴ�
		 */
		

		 Scanner sc = new Scanner(System.in);
		 System.out.println("������ �Է��ϼ���");
		 String str = sc.next(); //����������
		 
		 Work work = new Work();
		 String ss = work.isNumber(str);
		 System.out.println(ss);
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main

}
