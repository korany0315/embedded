package ex1_operator;

public class Ex3_Operator {
	public static void main(String[] args) {
		
		
		System.out.println("----------------------");
		System.out.println("5. ���� ������"); 
		// 5. ���� ������ // �߿�!!
		// 1�� �����Ͻ�Ű�ų� 1�� ���ҽ�Ű�� ������
		// ���������� ���������� �������� Ȯ���� ��������!
		int a = 10;
		System.out.println("a : " + ++a); // ���� ���� 11
		System.out.println("a : " + --a); // ���� ���� 10
		// ���� ���� ������ ���̷�Ʈ�� 1�� ������Ű�� a���� ��½�Ŵ
		
		int b = 10;
		System.out.println("b : " + b++); // ���� ���� 10
		// b�� ����� �� ������ ���� ++�� �ν��ϱ⶧���� ��¿� ������ ���� ����
		System.out.println(b); // �������ҿ��� ������ �Ǿ��ִ� 11
		
		b++; //11 / 12
		--b; //11
		--b; //10
		++b; // 11
		b--; // 11 / 10
		b--; // 10 / 9
		b++; // 9 / 10
		++b; // 11
		System.out.println(b--);
		// �� : 11
		
		// ���� �����ڴ� 1���� ������ų �� �ִ�.
		++b;
		++b;
		//2�̻��� ������ �Ϸ��� ���� �����ڸ� ����ϴ°��� ����! �� �ڵ� ���̱�!
		b +=2;
		
		
		
		System.out.println("----------------------");
		System.out.println("6. ���� ������"); 
		//6. ���� ������
		// ������ �ΰ�, �� ���ǿ� ���� ����� ���϶��� �����϶��� ���� 
		// �ٸ� ����� �����ִ� ������
		int aa = 10;
		int bb = 15;
		boolean res = ++aa >= b   ?   true : false  ;
	    //              �񱳿���          ?                 ;
		
		System.out.println(res); //false
		
		char res2 = ++aa < bb ? 'y' : 'n'; // ���̸� �� : �����̸� ��
		System.out.println(res2);
		
	}//main
}


















