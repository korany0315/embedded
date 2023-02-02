package ex2_inheritance;

public class Parent {
	
	// protected : 자식클래스만 가져다 쓸 수 있도록 허용하는 접근 제한자
	protected int money = 2000000000;
	
	// 부모 자식 관계의 클래스라고 해도 private으로 지정된 변수를
	// 자식은 가져다 쓰지 못한다.
	private String str = "신촌";

}
