package ex9_break_continue;

public class Ex2_Break {
	public static void main(String[] args) {
		
		for(int i =0; i<3; i++) {
			
			switch (i) { 
			case 0:
				System.out.println("0�Դϴ�.");
				break; //switch�� ������ break�� �ݺ����� �ƴ�, switch���� Ż��
			
			case 1:
				System.out.println("1�Դϴ�.");
				break;
			}
			
		}//for
	}//main
}
