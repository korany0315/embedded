package ex1_multi_array;

public class Ex2_multi_array {
	public static void main(String[] args) {

		// 2���� �迭�� ���� �� ����, �ʱ�ȭ�� �ѹ��� �ϱ�
		char[][] chArr = {  { 'J', 'A', 'V', 'A' } , 
							{ 'S', 'P', 'R', 'I', 'N', 'G' }  };
		
		//chArr�� ����  ��� ���� ���
		
		for(int i=0; i<chArr.length; i++) {
			for(int j=0; j<chArr[i].length; j++) {
				
				System.out.print(chArr[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		for(int i = 0; i<chArr.length; i++) {
			for(int j = 0; j<chArr[i].length; j++) {
				
				System.out.print(chArr[i][j] +" ");
			}//inner
			System.out.println();
		}//outer
		
		
	}//main
}















