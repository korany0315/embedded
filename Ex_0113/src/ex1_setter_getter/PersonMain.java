package ex1_setter_getter;

public class PersonMain {
	public static void main(String[] args) {
		
		
		
		// ģ������ ������ ��ü�� �Ǿ���
		Person p1 = new Person();
		p1.setName("ȫ�浿");
		p1.setPhone("010-1111-2222");
		p1.setAge(30);

		String name = p1.getName();
		System.out.println(name);//getNameȣ��
		
		System.out.println(p1.getPhone());
		System.out.println(p1.getAge());
		
	
		

	}//main

}
