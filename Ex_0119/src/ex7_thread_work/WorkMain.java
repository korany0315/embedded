package ex7_thread_work;

public class WorkMain {
	public static void main(String[] args) {
		
		/*
		  1~100사이의 난수 두개를 더하는 문제를 출제
		  키보드에서 답을 입력하여 다섯문제가 정답 처리될때까지 코드가 반복
		  최종적으로 다섯문제를 모두 맞히는데 몇 초가 걸렸는지 화면에 출력하여 코드를 종료
		  
		 스레드 슬릿을  활용하여 1초씩 계산하기
		  
		  ---------------------------
		 20 + 15 = 35
		 정답!
		 100 + 66 = 11
		 오답~
		 61 + 51 = 112
		 정답!
		 ...
		 53 + 28 = 81
		 정답!
		 5문제를 처리하는데 24초가 걸렸습니다. 
		   
		 */
		
		//Work 메서드 호출
		Work work = new Work();
		work.start(); //run() - 타이머를 동작시킨다.
		
		work.gameStart(); // 메서드
		
		
		
		
		
		
		
		
	}// main

}
