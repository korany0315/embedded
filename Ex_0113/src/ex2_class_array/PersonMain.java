package ex2_class_array;

public class PersonMain {
	public static void main(String[] args) {
		
		String[] sArr = new String[3];
		sArr[0] = "aaa";
		sArr[1] = "bbb";
		sArr[2] = "ccc";
		System.out.println(sArr[0]);
		
		// String 클래스를 제외한 모든 클래스들은 
		// 배열화 처리 되었을때 각 인덱스마다 메모리 할당을 해줘야함!
		
//		중요!!
		// 메모리 할당이 아님 공간만 생성함
		Person[] person = new Person[3]; 
		
		//for문으로도  명시적 객체생성 가능!
		for(int i=0; i<person.length; i++) {
			person[i] = new Person();
		}
		
		// 모든 방마다 메모리 할당을 받을 수 있도록 명시적 객체생성 필요!
//		person[0] = new Person(); 
//		person[1] = new Person(); 
//		person[2] = new Person(); 
		
		//클래스로 배열을 만들었을때 장점 : 여러가지 타입을 동시에 저장 할 수 있다! 
		
		person[0].setName("김말똥"); //String
		person[0].setAge(20); //int 를같은 배열안에 저장 가능!
		
		person[1].setName("박소똥");
		person[1].setAge(30);
		
		person[2].setName("김쥐똥");
		person[2].setAge(40);
		
		// 김말똥 / 20
		// 박소똥 / 30
		// 김쥐똥 / 40
		// 출력하기 
		for(int i = 0; i<person.length; i++) {
			System.out.println(
					person[i].getName() + " / " + person[i].getAge());
		}
		
		
		
		
	}//main

}





















