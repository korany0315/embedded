package ex2_class_array;

public class PersonMain {
	public static void main(String[] args) {
		
		String[] sArr = new String[3];
		sArr[0] = "aaa";
		sArr[1] = "bbb";
		sArr[2] = "ccc";
		System.out.println(sArr[0]);
		
		// String Ŭ������ ������ ��� Ŭ�������� 
		// �迭ȭ ó�� �Ǿ����� �� �ε������� �޸� �Ҵ��� �������!
		
//		�߿�!!
		// �޸� �Ҵ��� �ƴ� ������ ������
		Person[] person = new Person[3]; 
		
		//for�����ε�  ����� ��ü���� ����!
		for(int i=0; i<person.length; i++) {
			person[i] = new Person();
		}
		
		// ��� �渶�� �޸� �Ҵ��� ���� �� �ֵ��� ����� ��ü���� �ʿ�!
//		person[0] = new Person(); 
//		person[1] = new Person(); 
//		person[2] = new Person(); 
		
		//Ŭ������ �迭�� ��������� ���� : �������� Ÿ���� ���ÿ� ���� �� �� �ִ�! 
		
		person[0].setName("�踻��"); //String
		person[0].setAge(20); //int ������ �迭�ȿ� ���� ����!
		
		person[1].setName("�ڼҶ�");
		person[1].setAge(30);
		
		person[2].setName("�����");
		person[2].setAge(40);
		
		// �踻�� / 20
		// �ڼҶ� / 30
		// ����� / 40
		// ����ϱ� 
		for(int i = 0; i<person.length; i++) {
			System.out.println(
					person[i].getName() + " / " + person[i].getAge());
		}
		
		
		
		
	}//main

}





















