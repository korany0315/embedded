package ex3_override;

public class AnimalMain {
	public static void main(String[] args) {
		
		Bear bear = new Bear();
		System.out.println("�� : " + bear.getEye());
		System.out.println("�ٸ� : "+ bear.getLeg());
		System.out.println("Ư¡ : " + bear.wood);
		
		System.out.println("-----------------------");
		
		Lion lion = new Lion();
		System.out.println("�� : " + lion.getEye());
		System.out.println("�ٸ� : "+ lion.getLeg());
		System.out.println("Ư¡ : " + lion.hair);
		
		System.out.println("-----------------------");
		
		Elephant elephant = new Elephant();
		System.out.println("�� : "+ elephant.getEye());
		System.out.println("�ٸ� : "+ elephant.getLeg());
		System.out.println("Ư¡ : "+ elephant.nose);
		
		System.out.println("-----------------------");
		
		Snake snake = new Snake();
		System.out.println("�� : " + snake.getEye());
		
		// Snake class
//		System.out.println("�ٸ� : " + snake.snakeLeg());
		
//		�ٸ� Ŭ�������� ���������� ���Ǵ� �޼ҵ带 ����ϵ�
//		 ���븸 �ٲٴ� �� = �������̵�
		System.out.println("�ٸ� : " + snake.getLeg());
		System.out.println("Ư¡ : "+ snake.sensor);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main

}
