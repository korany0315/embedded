package ex1_scanner;

import java.util.Scanner;

public class Ex2_work {
	public static void main(String[] args) {
		
		// Ű���忡�� n1�� n2������ ���� �������� �Է¹޽��ϴ�.
		// n1���� n2������ ���� ����ϼ���.
		// ū���� �����޾Ƶ� �������� ���� �޾Ƶ� ����� ���ƾ� �Ѵ�.
		
		// ��1 : 2
		// ��2 : 5
		// ��� : 2 + 3 + 4 + 5 = 15
		
		// ��1 : 5
		// ��2 : 1
		// ��� : 15
		Scanner sc = new Scanner(System.in);
		
			System.out.print("��1 : ");
			int n1 = sc.nextInt();
			System.out.print("��2 : ");
			int n2 = sc.nextInt();
			
			int result = 0;
			
			// ���������� �� ��ȯ��
			// swap
			if(n1 > n2) { //n1 5  n2 1
				int n3 = n1;  //n3�� ���θ���� 
				n1 = n2;  //n1 = 1
				n2 = n3;  // n2 = 5
				
			}
			
			for(int i = n1; i<=n2; i++) {  // i = 1 2 3
				result += i;   			// result = 0+1 +2 + 3
			
				
			}
			
			System.out.print("��� : " + result);
			
			
			
			
			
			
			
//			if(n1<n2) {
//				
//				
//			}else if(n1>n2) {
//				
//			}else {
//				System.out.println("��� : " + n1);
//			}
//			
//			
			
			
//			for (n1= 0; n1>=0; n1++) {
//				
//				if(n1<n2) {
//					int sum=0;
//					sum += n1;
//					
//					System.out.println(sum);
//					
//				}
//		
//		}
//		
		
		
		
		
		
		
		
		
		
	}//main
}
