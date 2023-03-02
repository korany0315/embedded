package ex4_multi_for;

public class Ex1_multi_for {
	public static void main(String[] args) {
		
		/*
		 	다중 for 문 : for문 안에 for문이 추가되어 있는 경우
		 	1 2 3
		 	1 2 3
			
		 */
//		aa
		for(int i = 1; i <= 3; i++ ) {  // 행(y축)이 몇줄이 될 지 결정하는 for문
			
				
			for(int j = 1; j <= 5; j++ ) { // 열(x축)이 몇칸이 될 지 결정하는 for문
			
				System.out.print(j + " "); 
				// 줄바꿈 없이 한줄에 결과값을 나열하고싶을 땐 ln을 없앤다.
				
			}//inner
			
			System.out.println();
			//enter의 기능
			
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



























