package ex7_work;

public class Calculator {
	
	
	//수1 수2를 연산할 메서드
	public int getResult(int a, int b, String s ){
		int result=0;
		switch(s) {
		case "+":
			result = a+b;
			System.out.printf("%d %s %d = %d\n", a,s,b,result);
			break;
		case "-":
			result = a-b;
			System.out.printf("%d %s %d = %d\n", a,s,b,result);
			break;
		case "*":
			result = a*b;
			System.out.printf("%d %s %d = %d\n", a,s,b,result);
			break;
		case "/":
			result = a/b;
			System.out.printf("%d %s %d = %d\n", a,s,b,result);
			break;
			default:
				System.out.println("잘못된 연산자 입니다.");	
			
		}
		return result;
		
		
	}

}
