package ex1_string;

import java.util.Scanner;

public class Ex1_String {
	public static void main(String[] args) {
		
		// String class �� �ΰ����� Ư¡�� ������ �ִ�.
		// 1) ��ü ���� ����� �ΰ��� (�Ͻ���, �����)
		// 2) �ѹ� ������ ���ڿ��� ������ ������ �ʴ´�. (�Һ��� Ư¡)
		
		// �ձ��ڰ� �빮���� Ŭ������ ������� ������ �ƴ� ��ü �̴�!
		// s1 = ��ü
		// ��� ������ �ƴ����� String�� ������� �ҷ��� ������
		// (Scanner sc�� sc�� ��ü��)
		
		// �Ͻ��� ��ü����
		String s1 = "abc"; 
		String s2 = "abc";
		
		// ����� ��ü ����
		String s3 = new String("abc"); 
		String s4 = new String("abc"); 
		
		// ==�� �⺻ �ڷ��� ���� ���ϴ� ��� ���� ��
		// ��ü���� == �񱳴� �ּҰ��� ���Ѵ�!!
		// ��������� ��ü�� �����Ǹ� �츮 ���� ���Ƶ� �ּҰ��� �޶� ���� �ʴ�
		if(s1 == s2) {
			System.out.println("�����ϴ�");
		}else {
			System.out.println("�ٸ��ϴ�.");
		}
		
		// String Ŭ������ ��ü�� �ּҺ� ���� ���� ���ϴ� ��찡 �ξ� ����
		if(s1.equals(s3)) { //==�� �ƴ� .euals(���� ��)�� ����.
		System.out.println("���� �����ϴ�.");	
		}
		
		System.out.println("---------------------------");
		
		Scanner sc = new Scanner(System.in);
//		s3 = sc.next(); // ���� abc�� �־��ٰ� ����
		
		//����
//		if( s1 == s3 ) {
//			System.out.println("�����ϴ�.");
//		}
		
		// .equals
		if(s1.equals(s3)) {
			System.out.println("�����ϴ�.");
		}
		
		
		
		
		System.out.println("---------------------------");	
		
		// �̾� ���̱�
		// �ѹ� ���� ���ڿ��� �Һ��ϴ�
		
		String greet = "�ȳ�";
		greet += "�ϼ���";
		
		System.out.println(greet);
		
		
		System.out.println("---------------------------");	
		// 
		
		s1 = "bbb";
		s2 = "bbb";
		s2 = "ccc";
		
		
		
		
		
		
		
		
		
		
		
		
	}//main
}


















