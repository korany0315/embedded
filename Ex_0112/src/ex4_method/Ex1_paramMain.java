package ex4_method;

public class Ex1_paramMain {
	public static void main(String[] args) {
		
		Ex1_param e1 = new Ex1_param();
		
		String str = "안녕";
		
		String str2 = e1.test1(str);
				
		System.out.println("main : " + str);
		System.out.println("main : " + str2);// String의 불변의 특징때문에 결과가 안녕이 나옴
		
		
		int[] arr = {1,2,3}; //배열은 스트링과 달리 주소를 넘긴다(복사본 배열을 넘기지 않고)
		
		e1.test2(arr);
		
		for( int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		
		
		
		
		
	}//main
}
