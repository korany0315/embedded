package ex2_string;

import java.util.Scanner;

public class Ex4_work {
	public static void main(String[] args) {

		String[][] actor = { { "[song]", "기생충", "괴물", "관상" }, 
							{ "[lee]", "백두산", "내부자들", "광해" },
							{ "[ryu]", "올빼미", "럭키", "타짜" } };

		// 검색할 배우 : song
		// [song]
		// 박쥐
		// 괴물
		// 관상
		// ------------- 검색이 올바르게 된 경우

		// 검색할 배우 : park
		// 해당 배우가 없습니다.
		// ------------- 검색결과가 없는 경우
		
		System.out.println("--내 풀이 ----------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 배우 : ");
		String answer = sc.next();
		int count = 0;
		for(int i=0; i<actor.length; i++) {
			
			if(actor[i][0].equals("["+answer+"]")) {
				for(int j = 0; j<actor[i].length; j++) {
					System.out.println(actor[i][j]);
				}
				
			}else {
				count++;
				if(count == actor.length) {
					System.out.println("해당배우가 없습니다.");
				}
			}
		}
		
		
		
//		System.out.println("----선생님 풀이---------------------");

//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("검색할 배우 : ");
//		
//		
//		String name = sc.next();
//		
//		int count = 0;
//		
//		// 메서드에선 반드시 () 필요
//		// 아래 경우는 배열에서의 일반적 변수이기 때문에 () 필요 없음
//		for(int i = 0; i<actor.length; i++) {
//			if( actor[i][0].equalsIgnoreCase("[" +name+ "]") ) {
//				
//				//찾은 배우의 열 모두 출력하기
//				for(int j = 0; j<actor[i].length; j++) {
//					
//					System.out.println(actor[i][j]);
//				}//inner
//				
//				
//			}else { //중요!
//				count++; //몇명을 조회했는지 알아보기 위해
//				
//				if(count == actor.length) {  // 세명을 다 조회하고 else에 들어왔을땐 배우없음
//					System.out.println("해당배우의 이력이 등록되어 있지 않습니다.");
//				}
//				
//			}
//		}//outer


	}// main
}
