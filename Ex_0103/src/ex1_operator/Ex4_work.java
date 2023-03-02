package ex1_operator;

public class Ex4_work {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 12;
		
		int res = ++a >= b || 2 + 7 <= b && 13 - b >= 0 && (a += b) - (a % b) > 10 ? 1 : 0 ;
		//         11 > 12 || 9 <= 12 && 1 >=0 &&           (11+12) - (23%12) > 10 
		// 	  		f 	   ||	t     &&    t  &&           중요!! 진행되면서 값이 바뀔 수 있음! t
		//  값 : t => 1
		
		System.out.println("res : " + res);
		
		
		
	}//main

}




















