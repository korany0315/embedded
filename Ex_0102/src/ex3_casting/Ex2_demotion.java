package ex3_casting;

public class Ex2_demotion {
	public static void main(String[] args) {
		
		// 2. 디모션 캐스팅
		// 	- 작은 자료형에 큰 자료형이 대입되는 것 (자동x)
		
		char c = 'C'; //2byte
		int n = c + 1; // 4byte 프로모션
		
		c = (char)n; // 디모션
		System.out.println(c); // D
		
		float ff = 5.5f;  //4.xxbyte
		n = 0; //4byte
		n = (int)ff; //디모션 (int)를 넣어주어 디모션을 하겠다는것을 알려준다.
		System.out.println(n); // 값 : 5 / 데이터의 소숫점을 상실 시킨다.
		
		
		
	}//main
}



























