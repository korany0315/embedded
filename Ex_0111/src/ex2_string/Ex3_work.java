package ex2_string;

import java.util.Scanner;

public class Ex3_work {
	public static void main(String[] args) {

		// ȸ�� �Ǵ��ϱ�
		// ȸ���� ������ �о �ڿ��� �о �Ȱ��� ������ ����

		// �� : a1221a
		// a1221a (��)�� ȸ���� �Դϴ�.

		// �� : a1221b
		// a1221b (��)�� ȸ������ �ƴմϴ�.

		System.out.println("---�� Ǯ��--------------------");

		Scanner sc = new Scanner(System.in);
		System.out.print("�� : ");
		String origin = sc.next();

		String reverse = "";
		for (int i = origin.length() - 1; i >= 0; i--) {
			// reverse = reverse+origin.charAt(i);
			reverse += origin.charAt(i);

		}
		if (origin.contentEquals(reverse)) {
			System.out.println("ȸ���� �Դϴ�.");
		} else {
			System.out.println("ȸ������ �ƴմϴ�.");
		}

//		System.out.println("---������ Ǯ��--------------------");

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("���� �Է��ϼ���");
//		String ori = sc.next(); //������
//		

//		String rev = "";  //String class�� ���� ������ �� ū����ǥ�� �ϴ°� ����
//		
//		//���� ���ڿ� ori�� ����� rev ������ ����
//		for( int i = ori.length()-1;  i>=0;  i--) {
//
//			rev += ori.charAt(i);	//�ٽ� rev = String class�̱� ������ +=�� �̾���̱�!
//									//����� �ϳ��� �̾���̱�
//		}//for
//		
//		// �տ� !�� ������ ���� ������
//		if(!ori.contentEquals( rev )) {
//			System.out.println(ori + "��(��) ȸ������ �ƴ�");
//		}else {
//			System.out.println(ori + "��(��) ȸ����");
//		}
//		

	}// m

}
