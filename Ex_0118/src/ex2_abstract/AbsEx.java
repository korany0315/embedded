package ex2_abstract;

// �θ� Ŭ����
abstract public class AbsEx {
	// �߻�Ŭ���� : �߻�޽��带 �Ѱ� �̻� �������ִ� Ŭ����
	// �߻� Ŭ������ abstract  Ű���带 ���� �߻�Ŭ�������� ���������Ѵ�.

	int value = 100;
	int num = 20;
	
	// ������ �޼��� {��ü}�� ����
	public int getNume() {
		return num;
	}
	
	// �߻�޼���� ��ü{body} �� ����.
	// abstract Ű���带 ���ؼ� �߻� �޼������� ���������Ѵ�.
	// ���� �̿ϼ����� �˷��ִ� Ű���尡 abstract
	// ��ü�� ���� ������ '�̿ϼ��� ����' �̶�� �Ѵ�.
	// �̿ϼ��� �޼��带 �ڽ� Ŭ������ �����޾Ƽ� �ϼ���Ű�� ���� ������ �ȴ�.
	abstract public void setValue(int n);



















}
