package ex2_work;

import java.util.Scanner;

public class Ex1_work {
	public static void main(String[] args) {
		// Ű���忡�� �Է¹��� �� ��ŭ �Ǻ���ġ ���� ����ϱ�

		// �Է� : 9
		// 1 1 2 3 5 8 13 21 34
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ��� ");
		
		int num = sc.nextInt(); 
		
		int []arr = new int[num];
		
		
		for(int i =0; i<arr.length; i++) {
			
			if(i==0 || i==1) {
				arr[i] = 1;
			}else {
				arr[i] = arr[i-2]+arr[i-1];
				
			}
					
			System.out.print(arr[i]+ " ");
		}
		
		
		System.out.println("-----------------------------------");
		// Ű���忡�� �Է¹��� �� ��ŭ �Ǻ���ġ ���� ����ϱ�
		//������ ��
		
		int num1 = 1; 
		int num2 = 0;
		int num3 = 0;
		
		System.out.print("�Է�: ");
		int count = sc.nextInt();
		
		for(int i = 0; i<count; i++) {
			//swap �̿��ϱ� //�ٽ�!
			num2 = num3;
			num3 = num1;
			num1 = num2 + num3;
			System.out.printf("%d ", num3);
					
			
		}//
		
		
		
		
		
		
		
		
		
	}// main
}
