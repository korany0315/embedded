package ex3_override;

public class AnimalMain {
	public static void main(String[] args) {
		
		Bear bear = new Bear();
		System.out.println("눈 : " + bear.getEye());
		System.out.println("다리 : "+ bear.getLeg());
		System.out.println("특징 : " + bear.wood);
		
		System.out.println("-----------------------");
		
		Lion lion = new Lion();
		System.out.println("눈 : " + lion.getEye());
		System.out.println("다리 : "+ lion.getLeg());
		System.out.println("특징 : " + lion.hair);
		
		System.out.println("-----------------------");
		
		Elephant elephant = new Elephant();
		System.out.println("눈 : "+ elephant.getEye());
		System.out.println("다리 : "+ elephant.getLeg());
		System.out.println("특징 : "+ elephant.nose);
		
		System.out.println("-----------------------");
		
		Snake snake = new Snake();
		System.out.println("눈 : " + snake.getEye());
		
		// Snake class
//		System.out.println("다리 : " + snake.snakeLeg());
		
//		다른 클래스들이 공통적으로 사용되는 메소드를 사용하되
//		 내용만 바꾸는 것 = 오버라이드
		System.out.println("다리 : " + snake.getLeg());
		System.out.println("특징 : "+ snake.sensor);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main

}
