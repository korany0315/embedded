package ex3_method;

public class metMain {
	public static void main(String[] args) {
		
		Method1 m1 = new Method1();
		m1.test1();
		
		int su = 100;
		su = m1.test2(su); // ���� �ѱ涩 �Ķ���� 
					// �޼���� ȣ���� �ϸ� ���������̱⶧���� ���� ���ƿ����� ���Ŀ� �Ҹ��
		System.out.println("su : " + su);
		
		
		String res = m1.test3("nyang", 9);
		System.out.println(res);
		
		res = m1.test3("woo", 27);
		System.out.println(res);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main
}
