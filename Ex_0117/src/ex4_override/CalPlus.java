package ex4_override;

// 자식 클래스
public class CalPlus extends Calculator {
	
	@Override
	public int getResult(int n1, int n2) {
		// 내용만 변경할 수 있고 껍데기는 변경 불가함
		return n1 + n2;
		
	}
	
	
	
	
	
	
	
	
	
	
}
