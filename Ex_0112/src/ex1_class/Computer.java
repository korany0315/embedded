package ex1_class;

public class Computer {
	//클래스의 구성요소
	// 1)변수(속성,멤버)
	// 2) 메서드
	
	// 1) 변수(속성,멤버..)
	// 컴퓨터를 만들기 위한 설계 작업
	// Class(설계도)엔 메인메서드 만들지 않음
	
	private String brand = "apple";
	// 절대 바뀔 수 없게 만들어야함
	// private 접근제한자로 정의돼있기 때문에 타 클래스에서 접근 불가
	// c3.brand = "samsung";(apple => samsung)접근 불가
	public int ssd = 256;
	int ram = 16;
	float cpu = 2.4f;
	String color = "white";
	
	// 2) 메서드
	// 컴퓨터의 성능을 확인하기 위한 메서드 (기능)
	// 메서드 : 반복적으로 사용되는 코드를 줄이기 위해서 만드는 영역
	// 메서드 만들땐 소괄호 필수
	public void getInfo() {
		System.out.println("제조사 : " + brand);
		System.out.println("용량 : " + ssd);
		System.out.println("ram : " + ram);
		System.out.println("cpu : " + cpu);
		System.out.println("color : " + color);
		System.out.println("----------------------");
	}
	
	// 메서드의 구성
	// 접근 제한자  반환형   메서드명  (파라미터,인자,매개변수..)
	// public   void  getInfo()  { 메서드 호출시 실행 영역 } 
	
	// 접근제한자 
	// 1) public : 같은 프로젝트 내의 모든 객체들에게 사용을 허가
	// 2) private : 현재 클래스에서만 사용을 허가
	
	// 3) protected : 상속 관계의 객체들에게만 사용을 허가
	// 4) default : 현재 패키지 내의 객체들에게 사용을 허가
	//				(public)대신 아무것도 안들어갔을떄가 default!
	
	
	
}
