package ex5_interface;

public class ExMain {
	public static void main(String[] args) {
		
		Kitchen cumaKit = new Kitchen();
		System.out.println("CUMA CURRY 's recipe book");
		System.out.println("-------------------------");
		
		System.out.println("Ŀ�� ������ : " + cumaKit.curry());
		System.out.println("������ ������ : " + cumaKit.porkCutlet());
		
		System.out.println("��ġ ���� ������ : " + cumaKit.kimchiNabe());
		
		System.out.println("���� Ŀ�� ������ : " + cumaKit.shrimpCurry());
		System.out.println("���� Ŀ�� ������ : " + cumaKit.beefCurry());
		System.out.println("��ũ Ŀ�� ������ : " + cumaKit.porkCurry());
		System.out.println("�κ� ��ä Ŀ�� ������ : " + cumaKit.tofuCurry());
		
		//All
		System.out.println("����ư� ������ : " + cumaKit.toppingKaraage());
		
		
		
		
		
	}//main

}
