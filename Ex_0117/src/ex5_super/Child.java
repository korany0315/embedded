package ex5_super;

public class Child extends Parent {

	
	
	public Child() {
		
		// �θ�Ŭ������ �����ڰ� ȣ��Ǵ� �ڵ尡 ��������
		// super : �θ� Ŭ����
		// super() : �θ�Ŭ������ ������ ȣ�� �ڵ�
		// �ڽ��ڵ��� �ֻ�ܿ� ��ġ�Ѵ�.
		super(); //�θ��� ������
		super.name = "ȫ�浿";// �θ�Ŭ������ ������ �����ϴ� ���
		
		System.out.println("Child�� ������ " + name);
	}
	
	@Override
	public void getMsg() {
		// Parent�� getMsg()�޼��带 ������ ���ÿ�
		// super.getMsg();
		System.out.println("�ڽ� Ŭ������ �޼���");
	}

}
