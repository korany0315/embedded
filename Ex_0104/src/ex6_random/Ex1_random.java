package ex6_random;

import java.util.Random;
// �ٸ� ��Ű������ ���� Ŭ������ ������ ����ʹٰ� ���(import)�� �޴� ���� 
// ctrl + shift + o : import ���ִ� ����Ű 

public class Ex1_random {
	public static void main(String[] args) {
		
		// ������ ������ִ� Ŭ����   Random
		Random rnd = new Random();
		
		// 1~3 ������ ����
		// rnd.nextInt( ������ ���� ) + ���� �� ;
		int num1 = rnd.nextInt(3) + 1;
		System.out.println(num1);
		
		// 2~5������ ����
		//  rnd.nextInt( �� �� - ���� �� + 1 ) + ���� �� ;
		// rnd.nextInt( 5-2+1 ) + 2 ;
		int num2 = rnd.nextInt(4) + 2;
	    System.out.println(num2);
	
	    int num5 = rnd.nextInt(5-2+1) +2;
	    
	    //12345 ~ 34567 ������ ����
	    int num3 = rnd.nextInt(34567 - 12345 + 1) + 12345;
	    System.out.println(num3);
	    
	  

	    // A ~ Z ������ ���ĺ��� �������� ��µǵ��� �ϼ���
	    // ���� : H
	   
	    int num4 = rnd.nextInt('Z' - 'A' + 1) + 'A';
	    System.out.println("���� : "+(char)num4);
	    
	    int num6 = rnd.nextInt('Z'-'A'+1)+'A';
	    System.out.println((char)num6);
	    
	    
	    
	    
	    
	  //
	    //2~5 ������ ��
	    
	   int num7 = rnd.nextInt(5-2+1)+2;
	    System.out.println(num7);
	    
	    
	    
	    
	    
	    
	    
		
	}//main
}
























