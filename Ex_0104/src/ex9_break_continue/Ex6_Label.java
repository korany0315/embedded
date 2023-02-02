package ex9_break_continue;

public class Ex6_Label {
	public static void main(String[] args) {
		
		label : for( int i =1; i<=3; i++) {
			
			for( int j =1; j<=5; j++){
				
				if( j% 2 == 0) {
					continue label;
				}//if
				System.out.printf("%d ", j);
			}// inner
			System.out.println();
		}//outer
	}//main
}
