package ex8_work;

public class Ex1_work {
	public static void main(String[] args) {
		System.out.println("----1) ----------------------------");
		/*
		 1)
		   2중 for문을 사용하여 아래의 결과를 출력하세요
		   *
		   *  *
		   *  *  *
		   *  *  *  *
		   *  *  *  *  *
		 */
		 
		
		
		for(int i =0; i<5; i++) {
		
			for(int j = 0; j<=i; j++) {
				
				System.out.print("* ");
			}
			System.out.println("");
		}
		
		System.out.println(" ---------------------");
		
		//선생님 방법
		for (int i =1; i<=5; i++) {
			
			for(int j = 0; j<i; j++) {
				System.out.print("* ");
			}//inner
			
			System.out.println();
		}//outer
		
		
		
		
		
		System.out.println("----2) ----------------------------");
		/*
		 2)
		   2중 for문을 사용하여 아래의 결과를 출력하세요
		               *
		            *  *  *
		         *  *  *  *  *  
		      *  *  *  *  *  *  *
		   *  *  *  *  *  *  *  *  *
		 */
		
		
		
		for(int i =1; i <=5; i++) {
			
			for(int k =0; k< 5-i; k++ ) {
				System.out.print("  ");
			}
			
			for(int j = 0; j<(2*i-1); j++) {
				/*
				 *  i 1 j: (5-i) + (2*i-1) + (5-i)
				 *  i 2 j: 3 + 3 + 3
				 *  i 3 j: 2 + 5 + 2
				 *  i 4 j: 1 + 7 + 1
				 *  i 5 j: 0 + 9 + 0
				 */ 
				
				
				System.out.print("* ");
				
			}
			System.out.println();
		}
		System.out.println(" -------------------------");
		
		//선생님 방법
		for(int i = 0; i <5; i++) {
			
			for(int j = 0; j < 5 + i; j++ ) {
				if(i + j > 3) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				
			}//inner
			System.out.println();
		}//outer
		
		System.out.println(" -------------------------");
		
		for( int i = 3; i >=0; i--) {
			for(int j =0; j<5+i; j++) {
				if( i + j > 3) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}//outer
		
		
		
		
		
		
		
	}//main
}



























