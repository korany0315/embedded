package ex6_random;

import java.util.Random;
// 다른 패키지에서 만든 클래스를 가져다 쓰고싶다고 허락(import)을 받는 개념 
// ctrl + shift + o : import 해주는 단축키 

public class Ex1_random {
	public static void main(String[] args) {
		
		// 난수를 만들어주는 클래스   Random
		Random rnd = new Random();
		
		// 1~3 사이의 난수
		// rnd.nextInt( 난수의 범위 ) + 시작 수 ;
		int num1 = rnd.nextInt(3) + 1;
		System.out.println(num1);
		
		// 2~5사이의 난수
		//  rnd.nextInt( 끝 수 - 시작 수 + 1 ) + 시작 수 ;
		// rnd.nextInt( 5-2+1 ) + 2 ;
		int num2 = rnd.nextInt(4) + 2;
	    System.out.println(num2);
	
	    int num5 = rnd.nextInt(5-2+1) +2;
	    
	    //12345 ~ 34567 사이의 난수
	    int num3 = rnd.nextInt(34567 - 12345 + 1) + 12345;
	    System.out.println(num3);
	    
	  

	    // A ~ Z 사이의 알파벳이 랜덤으로 출력되도록 하세요
	    // 문자 : H
	   
	    int num4 = rnd.nextInt('Z' - 'A' + 1) + 'A';
	    System.out.println("문자 : "+(char)num4);
	    
	    int num6 = rnd.nextInt('Z'-'A'+1)+'A';
	    System.out.println((char)num6);
	    
	    
	    
	    
	    
	  //
	    //2~5 까지의 수
	    
	   int num7 = rnd.nextInt(5-2+1)+2;
	    System.out.println(num7);
	    
	    
	    
	    
	    
	    
	    
		
	}//main
}
























