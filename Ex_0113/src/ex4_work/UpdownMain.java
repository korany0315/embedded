package ex4_work;

import java.util.Random;
import java.util.Scanner;

public class UpdownMain {
	public static void main(String[] args) {
		
		// 1~50 ������ ���� �߻���Ų��.
		// ����Ŭ�������� �������� �Է¹޴´�
		// �Է¹������� up���� down���� ���������� �Ǵ�
		// ������ ��� mainũ������ while���� ������������ ó��
		
		// ���� : 30
		// DOWN
		// ���� : 15
		// UP
		// ���� : 25
		// 3ȸ ���� ����!
		
		Scanner sc = new Scanner(System.in);
		Updown ud = new Updown();
		
		
		Updown updown = new Updown(); // 
		
		while(true) {
			// up down�� ���� ó��
			// ������ ��� while���� ����������
			
			System.out.println("���� : ");
			int n = sc.nextInt();
			boolean res = ud.checkResult(n);
			
			if(res) { // res == true res�� ������ ������ ����� ��
				//������ ���� ��� 
				break; //while���� ����������.
				
				
			}
		}//while
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main
}
















