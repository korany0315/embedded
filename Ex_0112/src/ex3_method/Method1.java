package ex3_method;

public class Method1 {

	// �޼����� ���� �� ����

	// void�� ������� ���ư�
	public void test1() {
		System.out.println("�ȳ��ϼ���");

	}

	public int test2(int n) {
		// ��ȯ���� void�� �ƴѰ��, �������� �ݵ��
		// return���� ���ԵǾ��־����!!
		n += 100;
		System.out.println("n: " + n);

		// ���ϰ��� �ݵ�� ��ȯ�� Ÿ�԰� ����� ��!
		// ���� ���������� ����!
		return n;
		// ������ �� �Ѱ��� ���� ���ִ�.
		// System.out.println(); ���� ���� �ۼ� �Ұ�
	}
	
	public String test3( String s , int n) {
		String str = "����" + s + "�̰�" +n  + "���Դϴ�.";
		return str;
	}
	
	
}
