package ex7_work;

public class Calculator_tea {

	public void getResult( String operator, int...n) {

		String result = "";
		
		switch( operator ) { // + - * /
		case "+":
			// result = n[0] + "+" + n[1] + " = " +(n[0]+n[1]);
			
			// String.format
			result = String.format("%d + %d = %d", n[0], n[1], n[0], n[1]);
			break;
			
		case "-":
			result = String.format("%d - %d = %d", n[0], n[1], n[0], n[1]);
			break;
		
		case "*":
			result = String.format("%d * %d = %d", n[0], n[1], n[0], n[1]);
			break;
			
		case "/":
			result = String.format("%d / %d = %d", n[0], n[1], n[0], n[1]);
			break;
			
		}//switch
		
		System.out.println(result);
	}
}
