package ex3_abstract;

public class Terran  extends Unit{

	// Terran ������
	public Terran( String name, int energy, boolean fly ) {
		
		super.name = name;
		super.energy = energy;
		super.fly = fly;

	}

	// �Ⱦ �θ�Ŭ�������� �������Ҵ� �߻�޼��带 ���� �������̵� �޾ƾ���
	@Override
	public void decEnergy() {
		energy -= 3;
		
	}
	
}
