package ex3_abstract;

// unit �θ� Ŭ������ ��ӹ��� �ڽ� Ŭ����
public class Protoss extends Unit{
	
	// �����佺 ������
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
