package ex7_work;

public class Vending_Const {

	private Can_Const[] can = new Can_Const[5]; //�ٽ�!! Ŭ�������ο��� Ŭ���� ����
	private int money;
	
	// ���Ǳ⿡ �����������(�ʱ�ȭ)�ϴ� �޼���
	public void canInit() {

		can[0] = new Can_Const("fanta", 1000);
		can[1] = new Can_Const("latte", 1100);
		can[2] = new Can_Const("orange", 1200);
		can[3] = new Can_Const("coke", 1300);
		can[4] = new Can_Const("banana", 1400);
		
//		can[0].setCanName("fanta");
//		can[0].setPrice(1000);
//		
//		can[1].setCanName("latte");
//		can[1].setPrice(1100);
//		
//		can[2].setCanName("orange");
//		can[2].setPrice(1200);
//		
//		can[3].setCanName("coke");
//		can[3].setPrice(1300);
//		
//		can[4].setCanName("banana");
//		can[4].setPrice(1400);
//		
		
	}//canInit
	
	
	// ����ڰ� �Է��� ������ �ݾ� �ȿ��� ���� �� �ִ� ���Ḹ ���
	public void showCans(int money) {
		this.money = money;
		
		for( int i = 0; i<can.length; i++) {
			
			if(can[i].getPrice() <= money ) {
				System.out.printf("%s - %d��\n", 
						can[i].getCanName(), can[i].getPrice());
			}
		}//for
		
		
		
	}//showCans()

	//����ڰ� ������ ���Ḧ �����ϰ� �ܾ��� ��ȯ
	public int outCan(String name) {
		
		for(int i=0; i<can.length; i++) {
			if ( can[i].getCanName().equalsIgnoreCase(name)) {
				System.out.printf("%s��(��) ������\n", name);
				System.out.printf("  �ܾ� : %d��\n", money - can[i].getPrice());
			}
		}//for
		
		return money;
	}
	
	
	
	
	
}
