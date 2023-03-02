package ex2_exception;

public class Ex1_TryCatch {
	public static void main(String[] args) {
		//Try-Catch(����ó��) : ���α׷��� ������ ���� (����, ����..)�� �߻��ϸ�
		// �� �������� ���α׷��� ���������� ����ȴ�.
		// ���δ� ���� ������ ������ ���� ���ܰ� �߻��ص� �̸� �����ϰų� �����Ͽ�
		// ��� �ڵ带 �����ؾ��� ���� �ִ�.
		// ����ó�� ����� ���� ���α׷��� �� �������� ���Ḧ �ٿ�����
		
		int result = 0;
		
		// 1) ������ ������ 10/0
		try {
			
		result = 10/0;
		System.out.println("��������");
		
		//Exception�� ��� ������ �θ�Ŭ����!
		}catch( Exception e ) {
			// ���� try �������� ������ �߻��ϸ�
			// �ݵ�� catch������ �����Ѵ�!
			System.out.println("������ 0���� ���� �� �����ϴ�.");
		}
		
		System.out.println("��� : " + result);
		
		
		
		System.out.println("--2)----------------------------");
		// 2) ������ ���� �� 10/2
		try {
			// try �������� ������ �߻����� �ʾҴٸ�, catch������ 
			// ��ġ�� �ʰ� �״�� ����������.
			
		result = 10/2;
		System.out.println("��������");
		
		}catch( Exception e ) {
			// ���� try �������� ������ �߻��ϸ�
			// �ݵ�� catch������ �����Ѵ�!
			System.out.println("������ 0���� ���� �� �����ϴ�.");
		}
		
		System.out.println("��� : " + result);
		
		
		
		
		System.out.println("--3)----------------------------");
		
		// try-catch ���� ������ �����
		int []arr = new int[3];
		
		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
		// at ex2_exception.Ex1_TryCatch.main(Ex1_TryCatch.java:52)

		try {
	
		result = 10/0;
		arr[3] = 1;
		
		System.out.println("��������");
		
		// Exception�� �ڽ�Ŭ���� �� �ϳ� : ���ϴ� ������ ���� �ǵ�?
		}catch( ArrayIndexOutOfBoundsException e ) {
			// ���� try �������� ������ �߻��ϸ�
			// �ݵ�� catch������ �����Ѵ�!
			// e.printStackTrace();// ����߻��� ���� �̸�
			
			System.out.println("�迭�� �������� �ʴ�  index�� �����߽��ϴ�.");
			
		}catch(ArithmeticException e) {
			System.out.println("������ 0���� ���� �� �����ϴ�.");
		}finally{
			//try ���������� ���ܹ߻� ���ο� �������
			// ������ ����Ǵ� ����
			System.out.println("finally");
		}
		
		System.out.println("��� : " + result);
		
		
		
	}// main

}
