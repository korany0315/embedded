package ex3_single_for;

public class Ex1_for {
	public static void main(String[] args) {
		
		
		/*
		 	반복문 : 특정 수행문을 여러번 반복할 수 있도록 해주는 제어문
		 	
		 	for( 초기식 ; 조건식; 증감식; ){
		 		조건식이 참인 경우 실행되는 영역
		 	}
		 	
		 */
		
		/*
	 	for문 안에서 만들어진 지역변수 i는 for문의 소속이므로
	 	for의 영역을 벗어나면 사용이 불가능
	 	
		 */
	
	
		
		for( int i = 0; i < 3; i++  ) {
			// 1. 딱 한번 초기화 식 수행
			// 2. 조건식으로 넘어가서 조건을 비교해서 참거짓을 판단
			// 3. 안으로 들어가서 실행함
			// 4. for문 안을 실행하면 증가시키러 올라감
			// 5. 조건식으로 돌아감 
			// 6. 조건식이 거짓이 나올 때 까지 반복 시킴
			System.out.println(i);
			
		}//for
		
		/*
		 	for문 밖에서 만들어진 전역 변수 n는 for에서도 쓸수 있고 메인에서도 쓸 수있음!
		 */
		
		int n =0;
		for(n=1; n<=3; n++ ) {
			System.out.println("n :" +n);
		}
		System.out.println(n);
		
		
		
		System.out.println("---------------------------");
		
		
		
		/*
		 	지역변수들끼리는 자기들끼리만 알기 때문에 똑같은 변수명을 사용해도 상관 없음!
		 */
		for(int i = 10; i>=1; i-- ) {
			System.out.println("i : " + i);
		}
		
		
		System.out.println("---------------------------");
		
		// 1에서 100까지 100회전을 하는 for문,
		// 3의 배수만 출력해보자
		
		for(int j = 1; j <= 100; j++ ) {
			if( j % 3 == 0) {
				System.out.println(j);
			}
		}
	
		System.out.println("---------------------------");
		
		for(int i = 3; i <=100; i+=3) {
			System.out.println(i); 
		}
		
		
		
		
	}//main

}







