package ex4_interface;

public class InterMain {
	public static void main(String[] args) {

//		�߻�� ���������� �ϼ��� �� �� �޼��尡 ���ԵǾ������Ƿ�
//	 	�������� �޸� �Ҵ��� �Ұ�
//		InterTest it = new  InterTest() {

		// �׷��Ƿ� �������̽��� ������ �ڽ� Ŭ������
		// ������ �� �θ��� �������̽��� �Բ� �޸𸮸� ���Ҵ�޴´�
		InterChild ic = new InterChild();
		System.out.println( ic.getVALUE());
		
		
		
	}//main
}
