package ex5_interface;

// 인터페이스 구현
// imlements구현은 상속과 다르게 단일상속이 아닌 다중 구현이 가능하다.(부모가 여러명이 가능한것)
public class Kitchen implements AllMenu{
//public class Kitchen implements Menu1, Menu2, Menu3 {

	//Menu1
	@Override
	public String curry() {
		return "마법의 비법 기절 커리 소스 + 밥";
	}

	@Override
	public String porkCutlet() {
		return "축산사랑의 신선한 돼지고기 + 양배추  + 밥";
	}
	
	//Menu2
	@Override
	public String kimchiNabe() {
		return "김치 + 바삭바삭 돈가츠 + 밥";
	}

	//Menu3
	@Override
	public String shrimpCurry() {
		return "오동통 새우 튀김 + 커리 소스 + 밥";
	}

	@Override
	public String beefCurry() {
		// TODO Auto-generated method stub
		return "정석적인 소고기 + 커리 소스 + 밥";
	}

	@Override
	public String porkCurry() {
		return "맛있는 돼지 고기 + 커리 소스 + 밥";
	}

	@Override
	public String tofuCurry() {
		return "두부 + 야채 + 커리 소스 + 밥";
	}

	@Override
	public String toppingKaraage() {
		return "전설의 가라아게가 탄생할 닭고기 + 튀김가루 + 기름";
	}

}
