package ex5_thread;

public class T1 extends Thread{
	
	private int n;

	public void setN(int n) {
		this.n = n;
	}
		
	@Override
	public void run() {
		// main ���� ���� ���� �������� 1�ʿ� 1�� ���ҽ�Ű�� ���
		
		try {
			
			for(int i = n; i>=0; i--) {
				System.out.println(i);
				Thread.sleep(1000);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		} 
		
		
		
		
	}//run
}
