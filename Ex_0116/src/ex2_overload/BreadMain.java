package ex2_overload;

import java.util.Scanner;

public class BreadMain {
	public static void main(String[] args) {
		
		Bread bread = new Bread();
		Scanner scanner = new Scanner(System.in);
		
		
		// makeBread() 1�� ȣ���
		// ���� ��������ϴ�.
		bread.makeBread();
		System.out.println("----------------------");
		
		// makeBread() 2�� ȣ���
		// ���� ��������ϴ�.
		// ���� ��������ϴ�.
		// 2���� ���� ��������
		System.out.print("���� ������ �Է��ϼ��� : \n");
		int n = scanner.nextInt();
		bread.makeBread(n);
		System.out.println("----------------------");
		// makeBread() 3�� ȣ���
		// ũ������ ��������ϴ�.
		// ũ������ ��������ϴ�.
		// ũ������ ��������ϴ�.
		// 3���� ũ������ ��������
		
		System.out.print("���� ������ �Է��ϼ��� :\n");
		int n2 = scanner.nextInt();
		System.out.print("���� ������ �Է��ϼ���: \n");
		String s = scanner.next();
		bread.makeBread(s,n);
		System.out.println("----------------------");
		
		
		
		
		
		
		
		
		
		
		
		
	}//main

}
