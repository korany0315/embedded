package ex8_work;

public class Ex2_work {
	public static void main(String[] args) {
		
		System.out.println("----1) ----------------------------");
		/*
		 1)
		   2중 for문을 사용하여 아래의 결과를 출력하세요
		   
		   1 2 3 4 5 6 7 8 9 10  
 	   	   2 3 4 5 6 7 8 9 10 1  
		   3 4 5 6 7 8 9 10 1 2
		   4 5 6 7 8 9 10 1 2 3
		   5 6 7 8 9 10 1 2 3 4
		   6 7 8 9 10 1 2 3 4 5
		   7 8 9 10 1 2 3 4 5 6
		   8 9 10 1 2 3 4 5 6 7 
		   9 10 1 2 3 4 5 6 7 8
		   10 1 2 3 4 5 6 7 8 9
		 */
		/*
		 
		 
		 
		 
		 
		 */
			
		
		for(int i=1; i<=10; i++) {
			
			for(int j=0; j<10; j++) {
				
				int k =j+i;
				if(k<=10) {
					System.out.print( k + " ");	
				}else{
					System.out.print( (k-10) + " ");
				}
				
				//int num = i+j;
				// if(num>10){
				//	num -=10;
				// }
//				System.out.printf("%d ", num);
		
			
			}//inner
	
			System.out.println();
		}//outer
		
		System.out.println("------------------------------------");
		
		// 선생님 방법
		
		for(int i = 1; i<=10; i++) {
			for(int j =0; j<10; j++) {
				int num = i + j;
				
				if( num > 10) {
					num  -= 10;
				}
				System.out.print(num + " ");
			}
			System.out.println();
		}
		
		System.out.println("----2) ----------------------------");
		
		// 1 부터 n 까지의 총 합을 출력하세요
		// 결과 : 15
		
		int n = 5;
		int sum =0;
		for( int i = 1; i<=n; i++) {
			
			sum += i;	//sum = sum + i
			
		}
		
			System.out.printf("1 부터 %d 까지의 총 합 : %d", n, sum);
		
		
		
	}//
}










