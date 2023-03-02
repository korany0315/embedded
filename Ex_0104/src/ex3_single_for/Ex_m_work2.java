package ex3_single_for;

public class Ex_m_work2 {
	public static void main(String[] args) {
		/*
		 * 각에서 0도 초과 90도 미만은 예각, 90도는 직각, 
		 * 90도 초과 180도 미만은 둔각 180도는 평각으로 분류합니다. 
		 * 각 angle이 매개변수로 주어질 때 예각일 때 1, 직각일 때 2, 
		 * 둔각일 때 3, 평각일 때 4를 return하도록 solution 함수를 완성해주세요.
		 */
		int angle = 180;
		int result;
		
		if(0<angle && angle<90) {
			result = 1;
			System.out.println(angle + " " + result);
		}else if(angle == 90) {
			result = 2;
			System.out.println(angle + " " + result);
		}else if(90<angle && angle<180) {
			result = 3;
			System.out.println(angle + " " + result);
		}else if(angle == 180) {
			result = 4;
			System.out.println(angle + " " + result);
		}
			
		/*
		 * 정수 n이 주어질 때, n이하의 짝수를 모두 더한 값을 return 하도록 solution 
		 * 함수를 작성해주세요.
		 * 제한사항
			0 < n ≤ 1000
		 */
		
		int n = 6;
		
		int sum = 0;
		int sum1 = 0;
		for(int i =1; i<=n; i++)
			if(i%2==0) {
				sum += i;
			}else {
				sum1 += i;
			}
		System.out.println(sum);
		System.out.println(sum1);
		}
		
		
		
		
		
		
		
	}//


