package ex8_work;

	import java.util.Random;

	public class Graph_work {

		public static void main(String[] args) {

			// 0 ~ 9 사이의 난수를 100개 만들어서 저장

			// 12847830584375394875309485304857....
			// 0의 개수 : ###### 6
			// 1의 개수 : ######### 9
			// ...
			// 9의 개수 : #### 4

			// 난수를 만드는건 메인
			// 그래프를 만드는건 클래스

			
			// 기본 메인 안에서 클래스 없이 풀이
			
			// 난수 생성
			Random ran = new Random();
			
			// 0 ~ 9 사이의 난수를 100개 만들기
			for (int i = 0; i < 100; i++) {

				int iValue = ran.nextInt(10); // 0 <= iValue < 10

				System.out.print(iValue);
			
			// iValue난수에서 각각의 수가 몇개인지 배열로 만들기
				
				
			// 난수를 통해 배열을 만들기	
				int [][] graph = new int[10][]; 
				int count = 0;
				for(int k = 0; k<graph.length; k++) {
					
					for(int j = 0; j<graph[k].length; j++) {
						if(iValue == count) {
							System.out.print("#");
						}
						count++;
						
						System.out.println(graph[i][j]);
					}//inner
					System.out.println();
				}//outer

			}	// 그래프 만들기
				
}
