package ex1_if;

public class Ex2_if_else {
	public static void main(String[] args) {
		
		// if-else ��
		
		// 2�� �����϶� �����ϰ� ����!
		
		// if(���ǽ�){
		// ���ǽ��� ���� �� ����Ǵ� ����
		// }else{
		//  ���ǽ��� �����϶� ����Ǵ� ����
		// }
		
		int n = 49;
		String str = "";
		
		if( n++ >= 50) {
			str = "n�� 50 �̻��� ��";
		}else {
			str = "n�� 50 �̸��� ��";
		}
		System.out.println(str);
		
		System.out.println("--------------------------------------");
		
		char ch = '��';
		
		if(ch == '��') {
			str = "����� ���� �Դϴ�.";
		}else {
			str = " ����� ���� �Դϴ�.";
		}
		System.out.println(str);
		
		
	
		String str2 = ch =='��' ? "�����Դϴ�." : " ���� �Դϴ�." ; 
		System.out.println("����� �ٷ� " + str2);
		
		
		
		System.out.println("--------------------------------------");
		
		//�ٷ� ���� �ڵ带 ���� �����ڷ� �����ϼ���
		
		char m = '��';
		
		String res = m == '��'? "�����Դϴ�" : "�����Դϴ�";
		
		System.out.println("������ ���� " +res);
		
		
		
	}//
	
}































