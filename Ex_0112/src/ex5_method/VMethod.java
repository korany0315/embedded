package ex5_method;

public class VMethod {
	
	// (int ...n) <-- variable arguments
	// 타입만 일치한다면
	// 개수의 제한이 없는 파라미터 사용 가능
	public void v_test( int...n ) {
		
		//.length를 쓸수있다는건 배열로 자동으로 바꼈다는 의미
		//n = {1, 10, 3, 8};
		for(int i = 0; i<n.length; i++) {
			System.out.println(n[i]);
		}//for
	}

}
