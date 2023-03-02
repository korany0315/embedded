package ex3_abstract;

public class Zerg extends Unit{

	// 저그 생성자
	public Zerg( String name, int energy, boolean fly) {
		super.name = name;
		super.energy = energy;
		super.fly = fly;
	}
	
	@Override
	public void decEnergy() {
		energy -=10;
		
	}

}
