package ex1_work;

import java.util.Scanner;

public class WorkMain {
	public static void main(String[] args) {
		
		//������ ���ڿ� ���� ��ȣǥ�� �迭�� �غ�
		char[] alphaCode = {'`', '~', '!', '@', '#', '$', '%', '^', '&', '*', 
				            '(', ')', '-', '_', '+', '=', '|', '[', ']', '{', 
				            '}', ';', ':', ',', '.', '/'};
		
		char[] numCode = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�� : ");
		String str = sc.next();
		
		//��ȣȭ�� �Ϸ�� ����� ������ ����
		String result = "";
		
		//��ȣȭ �۾��� ���� Ŭ���� ȣ��
		Work work = new Work();
		result = work.setEnc(
				str, alphaCode, numCode);
		
		System.out.println("���� : " + str);
		System.out.println("��ȣȭ : " + result);
	}//main
}


















