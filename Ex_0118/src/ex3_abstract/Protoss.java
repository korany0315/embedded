package ex3_abstract;

// unit 부모 클래스를 상속받은 자식 클래스
public class Protoss extends Unit{
	
	// 프로토스 생성자
	public Protoss(String name, int energy, boolean fly) {
		super.name = name;
		super.energy = energy;
		super.fly = fly;
	}

	@Override
	public void decEnergy() {
		energy --;
		
	}
	
}
