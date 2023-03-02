package ex2_inheritance;

public class ExtendsMain {
	public static void main(String[] args) {
		// 상속 관계에서의 자식 클래스는 부모가 가진 (속성, 메서드)들을 
		// 마음대로 가져다 쓸 수 있다.
		
		Child c1 = new Child();
		System.out.println(c1.money);
		// 부모 자식 관계의 클래스라고 해도 private으로 지정된 변수를
		// 자식은 가져다 쓰지 못한다.
//		System.out.println(c1.str);
		System.out.println(c1.car);
		
		Parent p1 = new Parent();
//		상속관계라고 할 지라도 부모 클래스는 자식이 가지고 있는 속성을 사용하지 못한다.
//		p1.car
		
		
		
//		c1과 parent클래스는 출발지점의 집주소가 같다.
		
		
		if( c1 instanceof Parent) {
			System.out.println("c1은 Parent와 인스턴스가 같습니다.");
		}
		
		// 어떤 타입으로 들어온 변수들도 모두 담아줄 수 있다.
		Object bb = p1;
		if( c1 instanceof Object) {
			System.out.println("c1은 Parent와 인스턴스가 같습니다.");
		}
	}

}
