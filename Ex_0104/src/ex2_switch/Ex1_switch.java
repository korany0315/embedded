package ex2_switch;

public class Ex1_switch {
	public static void main(String[] args) {
		
		// switch -case �� : �񱳰��� ���ǰ��� ���� ����� ó���ϴ� ���
		
		// Ʈ�糪 �޽����� �Ǵ� �� �� ���� 
		// ������ ���� ���� ���� (��.���� �Ǵ� �Ұ�)
		// ���̷�Ʈ�� ����� ã�Ƴ��⶧���� ����ӵ��� ���� ����
	
		/*
		 
		 switch( �񱳰� ){
		 case ���ǰ� : 
		 		�񱳰��� ���ǰ��� ��ġ�ϴ� ��� ����Ǵ� ����
		 	break;
		 }
		 
		 */
		
		
		int  n = 2;
		
		switch( n ) { // �񱳰�
		case 1: // ���ǰ��� Ÿ���� �񱳰��� �ݵ�� ��ġ�ؾ��Ѵ�!!
			System.out.println("1. ���ӽ���");
			break;
		//case 1 : // case�� ���� ���ǰ��� ���� ������!
		//	break;
		case 2:
			System.out.println("2. ���ӼҰ�");
			break; // ���ǿ� �´� ���� �������� �극��ũ�� �ɷ� ����ġ���� ������ ���������� �ȴ�.
		case 3:
			System.out.println("3. �ɼ�");
			break;
		
		default:
			// �񱳰��� ���ǰ��� ��� ��ġ ���� ���� ���
			// �ݵ�� ����Ǵ� ����
			// else if �������� else ���� ����!
			System.out.println("1,2,3 �߿����� �Է��ϼ���");
		}//switch
		
		
		
		
		
		
	}//
}
