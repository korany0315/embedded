 package ex1_operator;

public class Ex5_work {
	public static void main(String[] args) {
		
		
		/*
		 결과) 
		 하루 생산량 : 17
		시간당 평균 : 하루 총 생산량  / 24 
		 
		 과수원이 있다.
		 배, 사과, 오렌지를 키우고 있는데, 하루 생산량은 
		 각각 5, 7, 5개 이다.
		 
		 1) 과수원에서 하루에 생산되는 과일의 총갯수를 출력
		 2) 한시간에 몇개의 과일이 생산되는지 출력
		 
		 ## 단, 과일의 갯수와 하루 생산량을 저장할 변수는 int타입으로, 
		 	시간당 샌산 수를 출력할 변수는 float타입으로 만들것.
		 	
		## 같은 결과가 나오는 코드지만, 최소 두개 이상의 코드를 만들어 볼 것.
		 */
		System.out.println("-----다시 풀어보기 -------------------");
		
		int pear1 = 5;
		int apple1 = 7;
		int orange1 = 5;
		
		
		int day1 = pear1 + apple1 + orange1 ;
		
		System.out.println(day1);
		
		float hour = 0;
		hour = day1 / 24f;
		System.out.println(hour );
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("----------------------------------");
		
		
		
		
		
		
		int p = 5;
		int a = 7;
		int o = 5;
		
		int sum = p + a + o ;
		
		System.out.println("sum : " + sum);
		
		float h = sum / 24f;
		System.out.println(h);
		
		
		System.out.println("--------------------------------");
		//선생님 방식
		
		
		int pear = 8;
		int apple = 7;
		int orange = 5;
		
		//중복되는 코드가 반복되는것은 좋지 않음
		int total = pear + apple + orange ; 
		System.out.println("하루 생산량 : " + total );
		
		// float avg = total / 24f;
		
		// total도 정수 24도 정수이기 때문에 플롯이 받아서 0.0으로 변경시킴
		// 연산을 했을때 실수 형태의 값을 제대로 받으려면 둘 중 한가지는 실수로 만들어져 있어야 한다!
		
		float avg = (float)total / 24; // 플롯으로 형변환 시키기
		System.out.println(avg); // 이렇게 하면 0.0이라고 나옴!
		
		
		
		
		
	}//
}














