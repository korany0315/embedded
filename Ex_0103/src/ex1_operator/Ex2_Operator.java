package ex1_operator;

public class Ex2_Operator {
	
	public static void main(String[] args) {
		
		System.out.println("----------------------");
		System.out.println("3. �񱳿�����");
		// 3. �񱳿�����
		// ���� ���ؼ� ���� ������ �Ǵ��ϴ� ������
		int n1 = 10;
		int n2 = 20;
		boolean res = n1 < n2;
		System.out.println("n1 < n2 : " + res); // true
		
		res = n1 >= n2;
		System.out.println("n1 >= n2 : " + res); // false
		
		res = n1 == n2; // double equal
		System.out.println("n1 == n2 : " + res); // false
		
		res = n1 != n2; // not equal 
		System.out.println("n1 != n2 : " + res); // true
		
		
		
		
		System.out.println("----------------------");
		System.out.println("4. ��������"); // �߿�!!
		// 4. �� ������
		// �񱳿����ڸ� ���� ������ �ΰ� �̻� �ʿ��� �� ���
		int age = 30;
		int limit = 35;
		//and(&&)������ : ���� ������ �����̸� ���� ������ �������� �ʴ´�. 
		// (���ϱ� ó�� �����ϱ�  )
		// t && t = t ( 1 * 1 = 1 )
		// t && f = f ( 1 * 0 = 0 )
		// f && t = f 
		// f && f = f 
	    res = (limit - age) < 5 && age > 30;
		System.out.println("&& and ���� : " + res);
		System.out.println(age); // 30 // ���� �����̸� �ڴ� Ȯ������ �ʾƼ� ���ϱ⸦ ���� �ʾ���
		
		int i1 = 10;
		int i2 = 20;
		// or(||) ������ : ���� ������ ���̸� ���� ������ �������� �ʴ´�.
		// ( ���ϱ� ó�� �����ϱ�)
		// t || t = t ( 1 + 1 = 2 )
		// f || t = t 
		// t || f = t 
		// f || f = f ( 0 + 0 = 0 )
		res = (i1 += 10) > 20 || i2 - 10 == 11;
		System.out.println("|| or ���� : " + res);
		
		
		// not ������
		System.out.println("!������ : " + res);
		System.out.println("!������ : " + !res);
		System.out.println(res); // ���� �����̾��� !�� �ٿ������� �ӽ������� �ݴ�� �ϴ°��̶� (���������� ����)
		
		
		
		
	}//main
}




















