package ex2_abstract;

// 부모 클래스
abstract public class AbsEx {
	// 추상클래스 : 추상메스드를 한개 이상 가지고있는 클래스
	// 추상 클래스는 abstract  키워드를 통해 추상클래스임을 명시해줘야한다.

	int value = 100;
	int num = 20;
	
	// 보통의 메서드 {몸체}가 존재
	public int getNume() {
		return num;
	}
	
	// 추상메서드는 몸체{body} 가 없다.
	// abstract 키워드를 통해서 추상 메서드임을 명시해줘야한다.
	// 아직 미완성임을 알려주는 키워드가 abstract
	// 몸체가 없기 때문에 '미완성의 개념' 이라고 한다.
	// 미완성된 메서드를 자식 클래스가 물려받아서 완성시키는 것이 조건이 된다.
	abstract public void setValue(int n);



















}
