package ex2_string;

import java.util.Scanner;

public class Ex4_work {
	public static void main(String[] args) {

		String[][] actor = { { "[song]", "�����", "����", "����" }, 
							{ "[lee]", "��λ�", "�����ڵ�", "����" },
							{ "[ryu]", "�û���", "��Ű", "Ÿ¥" } };

		// �˻��� ��� : song
		// [song]
		// ����
		// ����
		// ����
		// ------------- �˻��� �ùٸ��� �� ���

		// �˻��� ��� : park
		// �ش� ��찡 �����ϴ�.
		// ------------- �˻������ ���� ���
		
		System.out.println("--�� Ǯ�� ----------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�˻��� ��� : ");
		String answer = sc.next();
		int count = 0;
		for(int i=0; i<actor.length; i++) {
			
			if(actor[i][0].equals("["+answer+"]")) {
				for(int j = 0; j<actor[i].length; j++) {
					System.out.println(actor[i][j]);
				}
				
			}else {
				count++;
				if(count == actor.length) {
					System.out.println("�ش��찡 �����ϴ�.");
				}
			}
		}
		
		
		
//		System.out.println("----������ Ǯ��---------------------");

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("�˻��� ��� : ");
//		
//		
//		String name = sc.next();
//		
//		int count = 0;
//		
//		// �޼��忡�� �ݵ�� () �ʿ�
//		// �Ʒ� ���� �迭������ �Ϲ��� �����̱� ������ () �ʿ� ����
//		for(int i = 0; i<actor.length; i++) {
//			if( actor[i][0].equalsIgnoreCase("[" +name+ "]") ) {
//				
//				//ã�� ����� �� ��� ����ϱ�
//				for(int j = 0; j<actor[i].length; j++) {
//					
//					System.out.println(actor[i][j]);
//				}//inner
//				
//				
//			}else { //�߿�!
//				count++; //����� ��ȸ�ߴ��� �˾ƺ��� ����
//				
//				if(count == actor.length) {  // ������ �� ��ȸ�ϰ� else�� �������� ������
//					System.out.println("�ش����� �̷��� ��ϵǾ� ���� �ʽ��ϴ�.");
//				}
//				
//			}
//		}//outer


	}// main
}
