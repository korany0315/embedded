package ex3_abstract;

public class UintMain {
	public static void main(String[] args) {
		
		Terran t1 = new Terran("�غ�", 100, false);
		
		// �θ���� ������ �����ֽ� �߻� �޼���
		t1.decEnergy();
		t1.decEnergy();		
		System.out.println("t1 : " + t1.getEnergy());
		System.out.println("---------------------------");
		
		
		Protoss p1 = new Protoss("��Ʋ", 200, true);
		// �θ���� ������ �����ֽ� �߻� �޼���
		p1.decEnergy();
		
		System.out.println("p1 : " + p1.getEnergy());
		System.out.println("---------------------------");
		
		
		Zerg z1 = new Zerg("�����", 150, false);
		// �θ���� ������ �����ֽ� �߻� �޼���
		z1.decEnergy();
		System.out.println("z1 : " + z1.getEnergy());
		
		
		
		
	}//main

}
