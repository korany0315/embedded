package ex3_single_for;

public class Ex_m_work2 {
	public static void main(String[] args) {
		/*
		 * ������ 0�� �ʰ� 90�� �̸��� ����, 90���� ����, 
		 * 90�� �ʰ� 180�� �̸��� �а� 180���� ������ �з��մϴ�. 
		 * �� angle�� �Ű������� �־��� �� ������ �� 1, ������ �� 2, 
		 * �а��� �� 3, ���� �� 4�� return�ϵ��� solution �Լ��� �ϼ����ּ���.
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
		 * ���� n�� �־��� ��, n������ ¦���� ��� ���� ���� return �ϵ��� solution 
		 * �Լ��� �ۼ����ּ���.
		 * ���ѻ���
			0 < n �� 1000
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


