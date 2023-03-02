package ex5_interface;

public interface AllMenu extends Menu1, Menu2, Menu3{
	// 인터페이스에서 인터페이스는 extends키워드를 통해서  '상속'이 가능하다 ㅎㅎ..
	// Menu1, Menu2, Menu3을 상속 받았다면 커리, 돈가츠, 김치나베 까지 AllMenu에서 사용할 수 있게 됨을 의미
	
	// 인터페이스들 끼리는 다중 상속이 가능하다! AllMenu가 의도적으로  Menu1, Menu2, Menu3를 상속ㅂ
	String toppingKaraage();

}
