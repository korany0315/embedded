package ex1_if;

import java.util.Scanner;

public class Ex4_work1_m {
	public static void main(String[] args) {
	/*
	 * ������ ��� ���α׷�
	 * 
	 * �������� �Է¹ް� 300���� �̻��̸� 50����, 200�����̻��̸� 30����, 100�����̻��̸� 20���� 
	 * �� �̸��� ���ʽ� ����
	 * +1,000�� ������ ,�� �־��ּ���
	 * 
	 * �������� 360����
	 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�������� �Է��ϼ���.");
		int goal = sc.nextInt();
		
		if(goal>=300) {
			System.out.println("������� 50�����Դϴ�.");
		}else if( goal >=200) {
			System.out.println("�������� 30���� �Դϴ�.");
		}else if (goal>100) {
			System.out.println("�������� 20���� �Դϴ�.");
		}else {
			System.out.println("�������� �����ϴ�.");
		}
		
		
		
//		int goal = 3600000;
//		if(goal>= 3000000) {
//			System.out.println("�����մϴ�. �������� 500,000�� �Դϴ�.");
//		}else if(goal>= 2000000) {
//			System.out.println("�����մϴ�. �������� 300,000�� �Դϴ�.");
//		}else if(goal>= 1000000) {
//			System.out.println("�����մϴ�. �������� 200,000�� �Դϴ�.");
//		}else {
//			System.out.println("�������� �����ϴ�.");
//		}
//		
		
		
		
		
		
	}//

}











