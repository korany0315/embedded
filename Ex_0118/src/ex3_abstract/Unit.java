package ex3_abstract;

// �θ� Ŭ������ �߻� Ŭ������ ���� �Ǿ��־�� ��
abstract public class Unit {

	String name;
	int energy;
	boolean fly;
	
	public int getEnergy() {
		return energy;
	}
	
	// �߻� �޼��� ���� : �θ� ���� �� ���� ���� ����
	abstract public void decEnergy();
	
	
}
