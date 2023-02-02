package ex1_setter_getter;

public class Person {
	// �߿�!!!
	// setter & getter : private���� ������� �Ӽ��鿡 ������ �� �ֵ���  �ϱ����� ����
	
	// private�� �����Ͽ� �������� Ŭ������ 
	private String brand = "Samsung";
	private String name;
	private String phone;
	private int age;
	
	// ���͸� ���ؼ��� ���� �ٲ�� �ȵȴٸ� getter�� ���� ����ϱ�
	public String getBrand() {
		return brand;
	}

	// ���� �������� : set������ ctrl + space : set���θ��� �� �ִ� �޼��� �ڵ��ϼ� ��� ����

	// �����ؼ� �������� : ���콺������ > source > Generate getters and setter


	
	// ���̸� �����ִ� getter ����
	public int getAge() {
		return age;
	}
	
	
	// ���̸� �����ϴ� �޼��� ����
	public void setAge(int age) {	// �Ķ���Ϳ��� �Ѿ�� age
		this.age = age;  //this : ���� Ŭ���� �ڽ�
		
	}
	
	
	// ��ȣ�� �����ִ� getter ����
	public String getPhone() {
		return phone;
	}
	
	// ��ȣ�� �����ϴ� �޼��� ����
	public void setPhone( String phone ) {
		this.phone = phone;
	}
	
	
	//�̸��� �����ִ� getter ����
	public String getName() {
		return name; // ���ϰ��� �� ������ ȣ��� ������ ������
	}
	
	// �̸��� �����ϴ� �޼��� ����
	public void setName( String name ) { //ȫ�浿 ���� 
		this.name = name; // name������ ȫ�浿 ����
	}

}
