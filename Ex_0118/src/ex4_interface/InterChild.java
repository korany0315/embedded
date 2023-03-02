package ex4_interface;

public class InterChild implements InterTest {

	
//	인터페이스는  implements키워드를 통해서 '구현'한다 라고 표현 (상속과 개념은 같음)
//	클래스에 extends 로 쓰지 않고 implements 라고 써야함!
//	public class InterChild extends InterTest {
	
	@Override
	public int getVALUE() {
		// 상수는 값을 변경할 수 없다.
		// VALUE = 3;
		return VALUE;
	}
	

}
