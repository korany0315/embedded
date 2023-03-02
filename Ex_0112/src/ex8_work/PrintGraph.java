package ex8_work;

public class PrintGraph {

	public void print(int[]arr) {
		
		for( int i = 0; i<arr.length; i++) {
			System.out.print(i + "의 개수 : ");
			
			//가로줄로 그래프를 그림
			//arr[i] 배열의 해당방의 값이 #의 길이가 됨
			for(int j = 0; j<arr[i]; j++) {
				System.out.print("#");
			}//inner
			
			// 끝에 숫자출력
			System.out.println(" " + arr[i]);
			
		}//outer
		
	}
	
}
