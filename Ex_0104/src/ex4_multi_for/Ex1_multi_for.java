package ex4_multi_for;

public class Ex1_multi_for {
	public static void main(String[] args) {
		
		/*
		 	���� for �� : for�� �ȿ� for���� �߰��Ǿ� �ִ� ���
		 	1 2 3
		 	1 2 3
			
		 */
//		aa
		for(int i = 1; i <= 3; i++ ) {  // ��(y��)�� ������ �� �� �����ϴ� for��
			
				
			for(int j = 1; j <= 5; j++ ) { // ��(x��)�� ��ĭ�� �� �� �����ϴ� for��
			
				System.out.print(j + " "); 
				// �ٹٲ� ���� ���ٿ� ������� �����ϰ���� �� ln�� ���ش�.
				
			}//inner
			
			System.out.println();
			//enter�� ���
			
		}//outer
		
		System.out.println();
		System.out.println();
		
		
		for( int m = 1; m <= 3; m++ ) {
			for(int z = 1; z <= 5; z++ ) {
				System.out.print(z + " ");
			}
			System.out.println();
		}
		
		
		System.out.println("----------a-------------");
		
		//1 2 3
		//4 5 6 
		//7 8 9
		
		int num = 0;
		
		for( int i = 1; i <=3; i++) {
			
			
			for( int j = 1; j <= 3; j++) {
				
				num++;
				
				System.out.print( num + " ");
				
			}//inner
			
			System.out.println();
		}//outer
		
		
		System.out.println("---------b--------------");
		
		//1 1 1 
		//2 2 2
		//3 3 3
		
		int num2 = 0;
		
		for( int i = 1; i <=3; i++) {
			
			num2++;
			
			for( int j = 1; j <= 3; j++) {
				
				
				System.out.print( num2 + " ");
				
			}//inner
			
			System.out.println();
		}//outer
		
		
		System.out.println("----------c-------------");
		/*
		 	A B C 
			D E F 
			G H I 
		 */
		
		char ch = 'A';
		
		for( int i = 1; i <= 3; i++) {
			for(int j =1; j <= 3; j++) {
				
				System.out.print(ch++ + " ");
			}
			System.out.println();
		}
		
		
		
	

		
		
		
		
	}//main
}



























