package ex5_interface;

// �������̽� ����
// imlements������ ��Ӱ� �ٸ��� ���ϻ���� �ƴ� ���� ������ �����ϴ�.(�θ� �������� �����Ѱ�)
public class Kitchen implements AllMenu{
//public class Kitchen implements Menu1, Menu2, Menu3 {

	//Menu1
	@Override
	public String curry() {
		return "������ ��� ���� Ŀ�� �ҽ� + ��";
	}

	@Override
	public String porkCutlet() {
		return "������� �ż��� ������� + �����  + ��";
	}
	
	//Menu2
	@Override
	public String kimchiNabe() {
		return "��ġ + �ٻ�ٻ� ������ + ��";
	}

	//Menu3
	@Override
	public String shrimpCurry() {
		return "������ ���� Ƣ�� + Ŀ�� �ҽ� + ��";
	}

	@Override
	public String beefCurry() {
		// TODO Auto-generated method stub
		return "�������� �Ұ�� + Ŀ�� �ҽ� + ��";
	}

	@Override
	public String porkCurry() {
		return "���ִ� ���� ��� + Ŀ�� �ҽ� + ��";
	}

	@Override
	public String tofuCurry() {
		return "�κ� + ��ä + Ŀ�� �ҽ� + ��";
	}

	@Override
	public String toppingKaraage() {
		return "������ ����ư԰� ź���� �߰�� + Ƣ�谡�� + �⸧";
	}

}
