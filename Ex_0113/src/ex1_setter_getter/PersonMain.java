package ex1_setter_getter;

public class PersonMain {
	public static void main(String[] args) {
		
		
		
		// 친구들이 각각의 객체가 되야함
		Person p1 = new Person();
		p1.setName("홍길동");
		p1.setPhone("010-1111-2222");
		p1.setAge(30);

		String name = p1.getName();
		System.out.println(name);//getName호출
		
		System.out.println(p1.getPhone());
		System.out.println(p1.getAge());
		
	
		

	}//main

}
