package ex8_work;

	import java.util.Random;

	public class Graph_work {

		public static void main(String[] args) {

			// 0 ~ 9 ������ ������ 100�� ���� ����

			// 12847830584375394875309485304857....
			// 0�� ���� : ###### 6
			// 1�� ���� : ######### 9
			// ...
			// 9�� ���� : #### 4

			// ������ ����°� ����
			// �׷����� ����°� Ŭ����

			
			// �⺻ ���� �ȿ��� Ŭ���� ���� Ǯ��
			
			// ���� ����
			Random ran = new Random();
			
			// 0 ~ 9 ������ ������ 100�� �����
			for (int i = 0; i < 100; i++) {

				int iValue = ran.nextInt(10); // 0 <= iValue < 10

				System.out.print(iValue);
			
			// iValue�������� ������ ���� ����� �迭�� �����
				
				
			// ������ ���� �迭�� �����	
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

			}	// �׷��� �����
				
}
