package ex7_work;

public class Calculator {
	
	
	//��1 ��2�� ������ �޼���
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
				System.out.println("�߸��� ������ �Դϴ�.");	
			
		}
		return result;
		
		
	}

}
