package ex1_list;

import java.util.ArrayList;

public class Ex2_ArrayList {
	public static void main(String[] args) {
		
		ArrayList<String> sList = new ArrayList<>();
		sList.add("���");
		sList.add("����");
		sList.add("Ȳ��");
		sList.add("�浿");
		sList.add("����");
		
		System.out.println(sList);
		
		//[����, ����, ���, ����, ����]�� �ٲٱ�
		sList.add(0, "����");
		sList.add(0, "����");
		sList.set(3, "����");
		sList.set(4, "����");
		sList.remove(5);
		sList.remove(5);
		System.out.println(sList);
	
		
		
		
		
		
		
		
		
		
		
		
		
	}//main
}
