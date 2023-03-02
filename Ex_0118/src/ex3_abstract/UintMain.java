package ex3_abstract;

public class UintMain {
	public static void main(String[] args) {
		
		Terran t1 = new Terran("해병", 100, false);
		
		// 부모님이 강제로 물려주신 추상 메서드
		t1.decEnergy();
		t1.decEnergy();		
		System.out.println("t1 : " + t1.getEnergy());
		System.out.println("---------------------------");
		
		
		Protoss p1 = new Protoss("셔틀", 200, true);
		// 부모님이 강제로 물려주신 추상 메서드
		p1.decEnergy();
		
		System.out.println("p1 : " + p1.getEnergy());
		System.out.println("---------------------------");
		
		
		Zerg z1 = new Zerg("히드라", 150, false);
		// 부모님이 강제로 물려주신 추상 메서드
		z1.decEnergy();
		System.out.println("z1 : " + z1.getEnergy());
		
		
		
		
	}//main

}
