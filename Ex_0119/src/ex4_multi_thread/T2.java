package ex4_multi_thread;

public class T2 extends Thread{

	@Override
	public void run() {
		
		for(int i = 0; i<100; i++) {
//			Thread.sleep(500);//for�� �ѹ��� �������� 0.5�� ����
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}//for�� �ѹ��� �������� 0.5�� ����
			System.out.print("0");
		}
		
	}
	
}
