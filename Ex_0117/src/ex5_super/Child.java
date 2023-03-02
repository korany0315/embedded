package ex5_super;

public class Child extends Parent {

	
	
	public Child() {
		
		// 부모클래스의 생성자가 호출되는 코드가 숨어있음
		// super : 부모 클래스
		// super() : 부모클래스의 생성자 호출 코드
		// 자식코드의 최상단에 위치한다.
		super(); //부모의 생성자
		super.name = "홍길동";// 부모클래스의 변수로 접근하는 방법
		
		System.out.println("Child의 생성자 " + name);
	}
	
	@Override
	public void getMsg() {
		// Parent의 getMsg()메서드를 가져다 쓰시오
		// super.getMsg();
		System.out.println("자식 클래스의 메서드");
	}

}
