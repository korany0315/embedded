package ex1_overload;

public class Ex1_Overload {
	// �޼��� �����ε�
	
	// �����ε��� �޼����� '�ߺ�����'��� �ϸ� �ϳ��� Ŭ�������ο���
	// ���� �̸��� ���� �޼��尡 ������ ���� �Ǵ°��� ���Ѵ�.
	
	// �����ε��� ����
	
	//** �����ε带 ���� ��Ģ**
	//1) �޼��� ������ ������ �޶�� �Ѵ�.
	//2) ������ ������ ������, Ÿ���� �޶���Ѵ�
	//3) ������ ���� Ÿ���� ������, ���� ������ �޶���Ѵ�
	
	
	public void result() {
		System.out.println("���ڰ� ���� �޼���");
	}
	
	public void result(int n) { // 1)
		System.out.println("������ ���ڷ� �޴� �޼���");
	}
	
	public void result(char c) { // 2)
		System.out.println("���ڸ� ���ڷ� �޴� �޼���");	
	}
	
//	public void result(char ch ) { 
//		System.out.println(" ������ �̸��� ���Ƶ� ������ Ÿ���� ������ ����!");
//	}
	
	public void result(String s) { // 2)
		System.out.println("������ ���ڷ� �޴� �޼���");
	}
	
	public void result(String s, int n) {
		System.out.println("����, ���� ������ ���ڸ� �޴� �޼���");
	}
	
	public void result(int n, String s) { // 3)
		System.out.println("����, ���� ������ ���ڸ� �޴� �޼���");
	}
	
	
	
	
	
	
}
