package ex4_method;

public class Ex1_param {
	
	public String test1( String s ) { // main���� �ȳ�Ѿ�� s=�ȳ�
		s += "�ݰ����ϴ�"; // s = �ȳ�+�ݰ����ϴ�
		System.out.println("param : " + s);
		return s;//param : �ȳ�ݰ����ϴ�
	}
	
	public void test2( int[] a ) { // �Ѱܹ��� �����Ͱ� �ּҰ� ���� ������ ������ ������
		
		a [0]= 4;
		a [1]= 5;
		a [2]= 6;

		for( int i = 0; i<a.length; i++) {
			System.out.println( a[i] );
		}
		
		System.out.println("-----------------");
	}
	
}
