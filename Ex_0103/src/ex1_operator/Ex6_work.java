package ex1_operator;
import java.util.Scanner;

public class Ex6_work {
	public static void main(String[] args) {
		/* �������� ȣ���� 4 ���� 5 ġŸ 6
		      �����̸� ������ ȣ���� 3���� ���ڴ� 1���� ġŸ�� 2���� �̴�.
		
		1. �����̸� ������ �ʰ� �����ִ� �������� ���� ���
		2. �����̸� ������ �������� ���� ���
		3. �����ִ� ������ 2������ �̻��̸� ���� ����, �ƴϸ� ��� ���
		
		*/
		Scanner s = new Scanner(System.in);
		System.out.println("ȣ���� ���� �Է��Ͻÿ� = ");
		int t = s.nextInt();
		System.out.println("���� ���� �Է��Ͻÿ� = ");
		int l =s.nextInt();
		System.out.println("ġŸ ���� �Է��Ͻÿ� = ");
		int c =s.nextInt();
	
		
		int sum = t + l + c ;
		
		int go_out_t = 4;
		int go_out_l = 5;
		int go_out_c = 5;
		int go_out_sum = go_out_t+go_out_l+go_out_c; 
		int inzoo = sum - go_out_sum;
		
		System.out.println("1. �����̸� ������ �ʰ� �����ִ� �������� �� : " + inzoo + "���� ");
		System.out.println("2. �����̸� ������ �������� �� : " + go_out_sum + "����");
		
		String res = inzoo >= 2 ? "���󿵾�" : "���" ;
		System.out.println("3. "+ res);
		
		
		System.out.println("���� ���� �԰�������� �Է��Ͻÿ�. = ");
		String food = s.next();
		System.out.println("���� ���� �԰������. = " + food);

		
	}
}
