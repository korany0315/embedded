package ex1_class;

public class ComMain {
	
	public static void main(String[] args) {
		
		Computer c1 = new Computer();
		c1.getInfo();
//     참조변수. 메서드명(); => 메서드 실행시키기		
		Computer c2 = new Computer();
		c2.getInfo();
		
		Computer c3 = new Computer();
		c3.ssd = 512;
//     참조변수.변수명

		
		// 바뀐 용량이 출력됨
		c3.getInfo();

		
		
		
		
	}//main
	
}



















