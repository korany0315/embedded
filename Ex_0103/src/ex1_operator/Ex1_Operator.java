package ex1_operator;

public class Ex1_Operator {
	public static void main(String[] args) {
		
		/*
		 ������(Operator)
		 1. �ְ� ������ : . , ()
		 **2. ���� ������ : ++ , --
		 3. ��� ������ : + , - , * , / ,%
		 4. ����Ʈ ������ : >> , <<
		 5. �� ������ : > , < , >= , <= , == , !=
		 6. ��Ʈ ������ : & , | , ^
		 **7. �� ������ : && , || , !
		 8. ����(����) ������ : ? , :
		 **9. ���� ������ : = , *=, /= , %=, += , -=
		 */
		
		System.out.println("----------------------");
		System.out.println("1. ��� ������");
		 // 1. ��� ������
  		 // ��Ģ����� ������ �����ڸ� ������ �ִ�.
		int n1 = 20;
		int n2 = 7;
		int n3 = n1 - n2;
		System.out.println("n3 : " + n3);
		
		n3 = n1 / n2; // �� 2
		System.out.println("/ : " + n3);
		
		n3 = n1 % n2; // ������ 6
		System.out.println("% : " + n3);
		
		
		
		System.out.println("----------------------");
		System.out.println("2. ���� ������");
		// 2. ���� ������
		// Ư�� ���� ������ �����Ͽ� ����ų�� ����ϴ� ������
		int i1 = 10;
		int i2 = 3;
		i1 += i2; // i1 = i1 + i2;
		System.out.println("+= : " + i1);
		
		i1 -= 1; // i1 = i1 - 1;
		System.out.println("-= : " + i1);
		
		i1 %= 5; // i1 = i1 % 5; // 12/5�� ������ 
		System.out.println("%= : " + i1);
		
		i1 *= 6; // i1 = i1 * 6 // 2*6
		System.out.println("*= : " + i1);
		
	
		
	}//main
}


















