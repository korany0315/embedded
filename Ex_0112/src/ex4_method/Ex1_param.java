package ex4_method;

public class Ex1_param {
	
	public String test1( String s ) { // main에서 안녕넘어옴 s=안녕
		s += "반갑습니다"; // s = 안녕+반갑습니다
		System.out.println("param : " + s);
		return s;//param : 안녕반갑습니다
	}
	
	public void test2( int[] a ) { // 넘겨받은 데이터가 주소가 같기 때문에 원본을 수정함
		
		a [0]= 4;
		a [1]= 5;
		a [2]= 6;

		for( int i = 0; i<a.length; i++) {
			System.out.println( a[i] );
		}
		
		System.out.println("-----------------");
	}
	
}
