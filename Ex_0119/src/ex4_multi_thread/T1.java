package ex4_multi_thread;

public class T1 extends Thread{

	@Override // �� �޼��� �ʼ� �������̵� �ϱ�
	public void run() {

		for(int i = 0; i<100; i++) {
//			Thread.sleep(500);// for�� �ѹ��� ���� ���� 5�� ����
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}//5�� ����
			System.out.print("1");
		}
		
	}
}
