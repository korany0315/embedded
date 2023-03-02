package ex1_setter_getter;

public class Person {
	// 중요!!!
	// setter & getter : private으로 만들어진 속성들에 접근할 수 있도록  하기위한 개념
	
	// private을 선언하여 선언해준 클래스를 
	private String brand = "Samsung";
	private String name;
	private String phone;
	private int age;
	
	// 세터를 통해서라도 값이 바뀌면 안된다면 getter만 만들어서 사용하기
	public String getBrand() {
		return brand;
	}

	// 각각 가져오기 : set누르고 ctrl + space : set으로만들 수 있는 메서드 자동완성 기능 제공

	// 선택해서 가져오기 : 마우스오른쪽 > source > Generate getters and setter


	
	// 나이를 돌려주는 getter 생성
	public int getAge() {
		return age;
	}
	
	
	// 나이를 세팅하는 메서드 생성
	public void setAge(int age) {	// 파라미터에서 넘어온 age
		this.age = age;  //this : 현재 클래스 자신
		
	}
	
	
	// 번호를 돌려주는 getter 생성
	public String getPhone() {
		return phone;
	}
	
	// 번호를 세팅하는 메서드 생성
	public void setPhone( String phone ) {
		this.phone = phone;
	}
	
	
	//이름을 돌려주는 getter 생성
	public String getName() {
		return name; // 리턴값을 겟 네임이 호출된 곳으로 돌려줌
	}
	
	// 이름을 세팅하는 메서드 생성
	public void setName( String name ) { //홍길동 들어옴 
		this.name = name; // name변수에 홍길동 대입
	}

}
