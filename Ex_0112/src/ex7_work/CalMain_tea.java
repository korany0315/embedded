package ex7_work;

import java.util.Scanner;

public class CalMain_tea {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��1 : ");
		int su1 = sc.nextInt();
		
		System.out.println("��2 : ");
		int su2 = sc.nextInt();
		
		System.out.println("������ : ");
		String op = sc.next();
		
		Calculator_tea cal = new Calculator_tea(); //�޸� �Ҵ� ����
		cal.getResult(op, su1,su2);
		
		
		
	}

}
