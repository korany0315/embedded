package ex4_interface;

public interface InterTest {

	//인터페이스
	// 서비스 요청에 따른 중개자 역할을 하는 클래스(메뉴판)
	
	// 인터페이스 내부에는 상수와 (상수 : 한번 정해진 값으로 프로그램 종료까지 변하지 않는 수)
	// final int NUM = 100;; (final을 통해 지정하며, 상수명은 모두 대문자로!!)
	final int VALUE = 100;
	// 추상메서드만 추가가 가능!
	abstract int getVALUE();
	
	
	
}
