package ex4_work;

import java.util.Random;

public class Updown {
	
	// Random rnd = new Random();
	// int random = rnd.nextInt()+1;
	private int random = new Random().nextInt(50)+1;
	private int count = 0;
	private boolean isEnd = false;
	
	//up,down ������ �Ǵ�
	public boolean checkResult(int n) {
		count++;
		
		if(n<random) {
			System.out.println("UP");
		}else if(n>random) {
			System.out.println("DOWN");
		}else {
			System.out.println(count + "ȸ ���� ����!");
			isEnd = true;
		}
		return isEnd;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	int count = 0;
//
//	public void up(int inputNum, int num) {
//
//		if (inputNum == num) {
//			count++;
//			System.out.println(count + "���� ����!");
//		}
//
//	}//up
//	
	
	
	
	
	
	
	

}
