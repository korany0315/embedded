package ex1_string;

public class Ex2_String_Method {
	public static void main(String[] args) {
		
		// StringŬ���� �޼���(���)��
		// �޼���� � �۾��� �����ϱ� ���� ��ɹ��� ����
		// �ݺ������� ���Ǵ� �ڵ带 ���̱� ���� ���� ����
		
		String name = "Hong Gil Dong";
		int len = name.length();
		System.out.println("������ ����: " + len);
		// length :�����ϰ� 1���� ��!
		
		int index = name.indexOf('o');
		System.out.println("�� ù��° o�� ��ġ : " +index);
		// ���ڴ� 0���� ��
		
		index = name.lastIndexOf('o');
		System.out.println("�� �ڿ� �ִ� o�� ��ġ : "+ index);
		
		char c = name.charAt(5);
		//charAt(int index) : ( )�ȿ� �����͸� �� ������ ���� 
							// ���� Ÿ���� ���� �־�� �� 
		System.out.println("������ ���� :" + c);
		
		String s1 = name.substring(5);
		System.out.println("5�� ������ ��� ���ڸ� �߶󳻽ÿ� : " + s1);
		
		s1 = name.substring(5, 10);
		System.out.println("5 ~ 9������ ������ �߶󳻽ÿ� : " + s1);
		
		name = "Hong. Gil. Dong";
		s1 = name.replace('.', '/');
		System.out.println(".�� /�� ġȯ : " + s1);
		
		s1 = name.replace("on", "il");
		System.out.println("on�� il�� ġȯ : " + s1);
		
		// ���������� �̸� �ٲٱ�
		name = name.replace("on", "il");
		System.out.println("on�� il�� ġȯ : " + name);
		
		name = name.replaceAll("il", "on");
		System.out.println("il�� on�� ġȯ : " + name);
		
		name = "Kim. Lee. Park.";
		String name2 = "Kim. Lee. Park.";
		
		// replace�� all���� �� ��ȣ
		// replace :Kim/ Lee/ Park/
		name = name.replace('.', '/');
		System.out.println("replace :" + name);
		
		// �ڹ��� ���Խ� : .�� ������ All ġȯ ó�� �ϸ� ���� ��� ���ڵ��� �� �������� �ν���
		// replaceAll :///////////////
		name2 = name2.replaceAll(".", "/");
		System.out.println("replaceAll :" + name2);
		
		// �ǹ� ���� ���� ���� ex)ȸ������
		String id = " hi hello ";
		id = id.trim();
		System.out.println("trim ��� �� �� ���� : " + id.length());
		

		
		// .equalsIgnoreCase : ��ҹ��ڿ� ������� �ܾ ���ٸ� ��ġ��Ŵ
		// java�� �������� ��ҹ��ڸ� �����ؼ� �ٸ� ������ �ν���
		String answer = "Apple";
		
		if(answer.equalsIgnoreCase("apple")) {
			System.out.println("apple ���� ����");
		}
		
		
		// �߿�!!
		// StringŬ������ �޼���� �ƴ����� ������ ���� ����ϰ� �� �޼���
		// ���������� ���ڿ�(String)�� ��¥ ���ڷ� ������ִ� �޼���!
		String num = "True";
//		int a = 10;
		float c1 = 0; boolean b = false;
		int a = Integer.parseInt(num); //Integer : Ŭ����
		c1 = Float.parseFloat(num);
		
			
		System.out.println( b );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//m
}
