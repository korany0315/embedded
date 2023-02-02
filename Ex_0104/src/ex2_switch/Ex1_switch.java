package ex2_switch;

public class Ex1_switch {
	public static void main(String[] args) {
		
		// switch -case 문 : 비교값과 조건값을 통해 결과를 처리하는 제어문
		
		// 트루나 펄스값은 판단 할 수 없음 
		// 범위를 비교할 수도 없음 (예.성적 판단 불가)
		// 다이렉트로 결과를 찾아내기때문에 연산속도가 아주 빠름
	
		/*
		 
		 switch( 비교값 ){
		 case 조건값 : 
		 		비교값과 조건값이 일치하는 경우 실행되는 영역
		 	break;
		 }
		 
		 */
		
		
		int  n = 2;
		
		switch( n ) { // 비교값
		case 1: // 조건값의 타입은 비교값과 반드시 일치해야한다!!
			System.out.println("1. 게임시작");
			break;
		//case 1 : // case에 같은 조건값이 들어가면 오류남!
		//	break;
		case 2:
			System.out.println("2. 게임소개");
			break; // 조건에 맞는 값을 만났을때 브레이크에 걸려 스위치문을 완전히 빠져나가게 된다.
		case 3:
			System.out.println("3. 옵션");
			break;
		
		default:
			// 비교값과 조건값이 모두 일치 하지 않을 경우
			// 반드시 실행되는 영역
			// else if 문에서의 else 같은 개념!
			System.out.println("1,2,3 중에서만 입력하세요");
		}//switch
		
		
		
		
		
		
	}//
}
