package ex2_string;

import java.util.Scanner;

public class Ex1_String {
	public static void main(String[] args) {
		
		// �ֹ� ��ȣ�� �Է��ϼ���
		// ��) 960621-1012345
		// ����� 96�� 6�� 21�Ͽ� �¾ ���� �Դϴ�!
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֹε�Ϲ�ȣ�� �Է��ϼ���.");
		System.out.println("��)901111-2222222");
		System.out.println(">> ");
		
		String id = sc.next();
		
		if( id.trim().length() < 14 || id.trim().charAt(6) != '-') {
			System.out.println("�ֹι�ȣ ������ �ùٸ��� �ʽ��ϴ�.");
		}else {
			String year = id.substring(0,2);
			String month = id.substring(3, 4);
			String date = id.substring(4, 6);
			String gender = id.substring(7, 8);
			if(gender.equals("1") || gender.equals("3")) {
				System.out.printf("����� %s�� %s�� %s�Ͽ� �¾ ���� �Դϴ�!",year,month,date,gender);
			}else if(gender.equals("2")|| gender.equals("4")){
				System.out.printf("����� %s�� %s�� %s�Ͽ� �¾ ���� �Դϴ�!",year,month,date,gender);
			}
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//m

}
