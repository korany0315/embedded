package ex2_inheritance;

public class ExtendsMain {
	public static void main(String[] args) {
		// ��� ���迡���� �ڽ� Ŭ������ �θ� ���� (�Ӽ�, �޼���)���� 
		// ������� ������ �� �� �ִ�.
		
		Child c1 = new Child();
		System.out.println(c1.money);
		// �θ� �ڽ� ������ Ŭ������� �ص� private���� ������ ������
		// �ڽ��� ������ ���� ���Ѵ�.
//		System.out.println(c1.str);
		System.out.println(c1.car);
		
		Parent p1 = new Parent();
//		��Ӱ����� �� ���� �θ� Ŭ������ �ڽ��� ������ �ִ� �Ӽ��� ������� ���Ѵ�.
//		p1.car
		
		
		
//		c1�� parentŬ������ ��������� ���ּҰ� ����.
		
		
		if( c1 instanceof Parent) {
			System.out.println("c1�� Parent�� �ν��Ͻ��� �����ϴ�.");
		}
		
		// � Ÿ������ ���� �����鵵 ��� ����� �� �ִ�.
		Object bb = p1;
		if( c1 instanceof Object) {
			System.out.println("c1�� Parent�� �ν��Ͻ��� �����ϴ�.");
		}
	}

}
