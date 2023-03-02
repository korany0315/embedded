package ex5_interface;

public class ExMain {
	public static void main(String[] args) {
		
		Kitchen cumaKit = new Kitchen();
		System.out.println("CUMA CURRY 's recipe book");
		System.out.println("-------------------------");
		
		System.out.println("커리 레시피 : " + cumaKit.curry());
		System.out.println("돈가츠 레시피 : " + cumaKit.porkCutlet());
		
		System.out.println("김치 나베 레시피 : " + cumaKit.kimchiNabe());
		
		System.out.println("새우 커리 레시피 : " + cumaKit.shrimpCurry());
		System.out.println("비프 커리 레시피 : " + cumaKit.beefCurry());
		System.out.println("포크 커리 레시피 : " + cumaKit.porkCurry());
		System.out.println("두부 야채 커리 레시피 : " + cumaKit.tofuCurry());
		
		//All
		System.out.println("가라아게 레시피 : " + cumaKit.toppingKaraage());
		
		
		
		
		
	}//main

}
