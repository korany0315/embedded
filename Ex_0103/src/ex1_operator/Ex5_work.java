 package ex1_operator;

public class Ex5_work {
	public static void main(String[] args) {
		
		
		/*
		 ���) 
		 �Ϸ� ���귮 : 17
		�ð��� ��� : �Ϸ� �� ���귮  / 24 
		 
		 �������� �ִ�.
		 ��, ���, �������� Ű��� �ִµ�, �Ϸ� ���귮�� 
		 ���� 5, 7, 5�� �̴�.
		 
		 1) ���������� �Ϸ翡 ����Ǵ� ������ �Ѱ����� ���
		 2) �ѽð��� ��� ������ ����Ǵ��� ���
		 
		 ## ��, ������ ������ �Ϸ� ���귮�� ������ ������ intŸ������, 
		 	�ð��� ���� ���� ����� ������ floatŸ������ �����.
		 	
		## ���� ����� ������ �ڵ�����, �ּ� �ΰ� �̻��� �ڵ带 ����� �� ��.
		 */
		System.out.println("-----�ٽ� Ǯ��� -------------------");
		
		int pear1 = 5;
		int apple1 = 7;
		int orange1 = 5;
		
		
		int day1 = pear1 + apple1 + orange1 ;
		
		System.out.println(day1);
		
		float hour = 0;
		hour = day1 / 24f;
		System.out.println(hour );
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("----------------------------------");
		
		
		
		
		
		
		int p = 5;
		int a = 7;
		int o = 5;
		
		int sum = p + a + o ;
		
		System.out.println("sum : " + sum);
		
		float h = sum / 24f;
		System.out.println(h);
		
		
		System.out.println("--------------------------------");
		//������ ���
		
		
		int pear = 8;
		int apple = 7;
		int orange = 5;
		
		//�ߺ��Ǵ� �ڵ尡 �ݺ��Ǵ°��� ���� ����
		int total = pear + apple + orange ; 
		System.out.println("�Ϸ� ���귮 : " + total );
		
		// float avg = total / 24f;
		
		// total�� ���� 24�� �����̱� ������ �÷��� �޾Ƽ� 0.0���� �����Ŵ
		// ������ ������ �Ǽ� ������ ���� ����� �������� �� �� �Ѱ����� �Ǽ��� ������� �־�� �Ѵ�!
		
		float avg = (float)total / 24; // �÷����� ����ȯ ��Ű��
		System.out.println(avg); // �̷��� �ϸ� 0.0�̶�� ����!
		
		
		
		
		
	}//
}














