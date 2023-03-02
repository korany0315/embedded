package ex3_abstract;

public class Terran  extends Unit{

	// Terran 생성자
	public Terran( String name, int energy, boolean fly ) {
		
		super.name = name;
		super.energy = energy;
		super.fly = fly;

	}

	// 싫어도 부모클래스에서 만들어놓았던 추상메서드를 강제 오버라이딩 받아야함
	@Override
	public void decEnergy() {
		energy -= 3;
		
	}
	
}
