package ex4_multi_thread;

public class TMain {
	public static void main(String[] args) {
		
		T1 t1 = new T1();
		T2 t2 = new T2();
		
		t1.start(); //1을 출력하는 run()메서드를 독립적으로 실행
		t2.start(); //0을 출력하는 run()메서드를 독립적으로 실행
		
//		Thread.sleep(500); //0.5초간 대기
//		강제로 쉬게하기
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} //0.5초간 대기
		
		System.out.println("main스레드 끝");
		
		
		
		
		
		
		
		
		
	}//main

}
