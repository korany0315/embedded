package ex3_abstract;

// 부모 클래스도 추상 클래스로 지정 되어있어야 함
abstract public class Unit {

	String name;
	int energy;
	boolean fly;
	
	public int getEnergy() {
		return energy;
	}
	
	// 추상 메서드 만듬 : 부모가 직접 쓸 일은 절대 없음
	abstract public void decEnergy();
	
	
}
