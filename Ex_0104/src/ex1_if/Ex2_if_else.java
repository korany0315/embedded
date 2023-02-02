package ex1_if;

public class Ex2_if_else {
	public static void main(String[] args) {
		
		// if-else 문
		
		// 2지 선다일때 유용하게 쓰임!
		
		// if(조건식){
		// 조건식이 참일 때 실행되는 영역
		// }else{
		//  조건식이 거짓일때 실행되는 영역
		// }
		
		int n = 49;
		String str = "";
		
		if( n++ >= 50) {
			str = "n은 50 이상의 수";
		}else {
			str = "n은 50 미만의 수";
		}
		System.out.println(str);
		
		System.out.println("--------------------------------------");
		
		char ch = '남';
		
		if(ch == '여') {
			str = "당신은 여자 입니다.";
		}else {
			str = " 당신은 남자 입니다.";
		}
		System.out.println(str);
		
		
	
		String str2 = ch =='남' ? "남자입니다." : " 여자 입니다." ; 
		System.out.println("당신은 바로 " + str2);
		
		
		
		System.out.println("--------------------------------------");
		
		//바로 위의 코드를 삼항 연산자로 수정하세요
		
		char m = '남';
		
		String res = m == '여'? "여자입니다" : "남자입니다";
		
		System.out.println("퀴즈의 답은 " +res);
		
		
		
	}//
	
}































