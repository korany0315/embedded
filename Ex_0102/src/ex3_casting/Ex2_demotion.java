package ex3_casting;

public class Ex2_demotion {
	public static void main(String[] args) {
		
		// 2. ���� ĳ����
		// 	- ���� �ڷ����� ū �ڷ����� ���ԵǴ� �� (�ڵ�x)
		
		char c = 'C'; //2byte
		int n = c + 1; // 4byte ���θ��
		
		c = (char)n; // ����
		System.out.println(c); // D
		
		float ff = 5.5f;  //4.xxbyte
		n = 0; //4byte
		n = (int)ff; //���� (int)�� �־��־� ������ �ϰڴٴ°��� �˷��ش�.
		System.out.println(n); // �� : 5 / �������� �Ҽ����� ��� ��Ų��.
		
		
		
	}//main
}



























