package ex7_thread_work;

import java.util.Random;
import java.util.Scanner;

public class Work extends Thread{
	
	int su1, su2;
	int timer = 0;// �ð���� ����
	int playCount = 0; // ������ ���⶧���� ����
	boolean isCheck = true;
	final int FINISH = 3; //������ ����
	
	
	public void gameStart() {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		
		while(isCheck) {
		
			su1 = rnd.nextInt(100)+1;
			su2 = rnd.nextInt(100)+1;
			
			//���� ����
			System.out.printf("%d + %d = ", su1, su2 );
			int result = sc.nextInt();
			
			if(result == (su1 + su2)) {
				System.out.println("����");
				playCount++;
				
			}else {
				System.out.println("����...");
			}
			
			// ���� ���� ������ �Ǵ�
			if( playCount == FINISH ) {
				System.out.println("�������" + timer + "�� �ɸ�");
			}
			
			
		}//while
	}//gameStart
	
	@Override
	public void run() {

		while(true) {
			try {
				
			} catch (Exception e) {

			}
		}//while
		
	}//run
	
	
}
