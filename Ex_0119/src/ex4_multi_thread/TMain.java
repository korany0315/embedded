package ex4_multi_thread;

public class TMain {
	public static void main(String[] args) {
		
		T1 t1 = new T1();
		T2 t2 = new T2();
		
		t1.start(); //1�� ����ϴ� run()�޼��带 ���������� ����
		t2.start(); //0�� ����ϴ� run()�޼��带 ���������� ����
		
//		Thread.sleep(500); //0.5�ʰ� ���
//		������ �����ϱ�
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} //0.5�ʰ� ���
		
		System.out.println("main������ ��");
		
		
		
		
		
		
		
		
		
	}//main

}
