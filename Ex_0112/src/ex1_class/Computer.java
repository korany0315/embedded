package ex1_class;

public class Computer {
	//Ŭ������ �������
	// 1)����(�Ӽ�,���)
	// 2) �޼���
	
	// 1) ����(�Ӽ�,���..)
	// ��ǻ�͸� ����� ���� ���� �۾�
	// Class(���赵)�� ���θ޼��� ������ ����
	
	private String brand = "apple";
	// ���� �ٲ� �� ���� ��������
	// private ���������ڷ� ���ǵ��ֱ� ������ Ÿ Ŭ�������� ���� �Ұ�
	// c3.brand = "samsung";(apple => samsung)���� �Ұ�
	public int ssd = 256;
	int ram = 16;
	float cpu = 2.4f;
	String color = "white";
	
	// 2) �޼���
	// ��ǻ���� ������ Ȯ���ϱ� ���� �޼��� (���)
	// �޼��� : �ݺ������� ���Ǵ� �ڵ带 ���̱� ���ؼ� ����� ����
	// �޼��� ���鶩 �Ұ�ȣ �ʼ�
	public void getInfo() {
		System.out.println("������ : " + brand);
		System.out.println("�뷮 : " + ssd);
		System.out.println("ram : " + ram);
		System.out.println("cpu : " + cpu);
		System.out.println("color : " + color);
		System.out.println("----------------------");
	}
	
	// �޼����� ����
	// ���� ������  ��ȯ��   �޼����  (�Ķ����,����,�Ű�����..)
	// public   void  getInfo()  { �޼��� ȣ��� ���� ���� } 
	
	// ���������� 
	// 1) public : ���� ������Ʈ ���� ��� ��ü�鿡�� ����� �㰡
	// 2) private : ���� Ŭ���������� ����� �㰡
	
	// 3) protected : ��� ������ ��ü�鿡�Ը� ����� �㰡
	// 4) default : ���� ��Ű�� ���� ��ü�鿡�� ����� �㰡
	//				(public)��� �ƹ��͵� �ȵ������� default!
	
	
	
}
