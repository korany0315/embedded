package ex3_casting;

public class Ex1_promotion {
	public static void main(String[] args) {
		
		// ĳ���� (����ȯ)
		// ���� �ٸ� �ڷ��� ���� ���� �ְ�ޱ� ���� ����(����)
		
		// 1.���θ�� ĳ����
		// 	- ū �ڷ����� ���� �ڷ����� �����ϴ� �� (�ڵ�)
		double d = 100.5; // 8.xxbyte
		int n = 200; // 4byte
		d = n ; // ������ ���� ���ʿ� �־��
		System.out.println(d); // 200.0
		
		char c = 'A'; // 2byte
		int n1 = 100;  // 4byte
		n1 = c;
		System.out.println(n1); // A�� �ش��ϴ� �ƽ�Ű�ڵ尪 65�� ��µȴ�.
		

	}//main
}
