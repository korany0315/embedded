package ex5_method;

public class VMethod {
	
	// (int ...n) <-- variable arguments
	// Ÿ�Ը� ��ġ�Ѵٸ�
	// ������ ������ ���� �Ķ���� ��� ����
	public void v_test( int...n ) {
		
		//.length�� �����ִٴ°� �迭�� �ڵ����� �ٲ��ٴ� �ǹ�
		//n = {1, 10, 3, 8};
		for(int i = 0; i<n.length; i++) {
			System.out.println(n[i]);
		}//for
	}

}
