package ex1_first;

public class EX1_print {
    
	public static void main( String[] args ) {
		// �ּ� : ������ �� JVM�� ���� ���� ���ϴ� �޸�뵵�� �ؽ�Ʈ ����
		// main �޼��� : ������ �� ���� ���� ȣ��Ǵ� ����
		System.out.println( 100 ); // <-- �� ���� ������ �ݵ��  ;�� ������
		System.out.println(200);
		
		System.out.println( 500);
		
		// ������ �Է��ϰ��� �Ҷ��� "" �ȿ� ����ϰ��� �ϴ� �����͸� �־�����Ѵ�.
		System.out.println( "�ȳ��ϼ���");
		System.out.println(" ���� ����� �Դϴ�. ");
		
		// �����ڴ� �˾Ƽ� ���� �� ����� ������
		System.out.println(10 + 10);
		System.out.println(10 * 10);
		System.out.println(10/5);
		System.out.println("10/5 = " + (10/5));
		
		// ""�ȿ� �ִ°͵��� ������ ����(���ڿ�)�� �ν��Ѵ�
		// "" �ڿ� ������ �̾���̰������ +�� ����Ѵ�!
		System.out.println("10*10 =" + 100);
		System.out.println("10*10 = " + 10 * 10);
		// "" �ڿ� �ٴ� ��� +�� �̾���δٷ� �ν��Ѵ�
		System.out.println(" 5 + 1 = " + 5 + 1);
		System.out.println(" 5+2 = " + 5 + 2); //  5+2 = 52 �� ����
		
		// "" �ڿ� �ٴ� -�� �ν��� ���� ���ϹǷ� ���� ����ϰ� �ϱ����ؼ� ��ȣ�� ����Ѵ�
		System.out.println(" 5 - 1 = " + ( 5 - 1 ));
		System.out.println("-1+5 = " + ( -1 + 5));
		
		// "" ���� ���ϱ�� �׳� ���ϱ�� ���� ����Ѵ� : 2 1 + 1 = 11
		System.out.println(1 + 1 + " 1 + 1 = " + 1 + 1 );
		// "" �տ� ���ϱ⿩�� �������! : 1 1 + 1 = 11 
		System.out.println( 1 * 1 + " 1 + 1 = " + 1 + 1);
		
		System.out.println( 3 + 3 + " 5 + 5 = " + 7 + 8); // 6 5 + 5 = 78
		
		
	}
}
