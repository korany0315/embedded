package ex2_list;

import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {

		// �̸� : aaa
		// ���� : 20
		// aaa / 20
		// ------------------
		// �̸� : bbb
		// ���� : 30
		// aaa / 20
		// bbb / 30
		// -----------------
		// �̸� : aaa
		// �̸��� �ߺ��˴ϴ�.
		// ----------------
		// �̸� : ...
		

		Scanner sc = new Scanner(System.in);

		ArrayList<User> list = new ArrayList<>();

		
		outer : while(true) {
			
			User u = new User(); // �ٽ� // ��Ʈ�ʱ� �׸� ���� 

			System.out.print("�̸� : ");
			String name = sc.next();
			
			// �̸� �ߺ�üũ
			for(int i = 0; i<list.size(); i++) {
				if(list.get(i).getName().equals(name)) {
					System.out.println("�̸� �ߺ�");

					System.out.println("----------------------");
					
					continue outer;
				}
			}//for
			
			System.out.print("���� : ");
			int age = sc.nextInt();
			
			u.setName(name);
			u.setAge(age);
			
			list.add(u);
			
			// ��� ���
			for(int i = 0; i<list.size(); i++) {
				System.out.printf
				("%s / %d\n", list.get(i).getName(), list.get(i).getAge()); //���� �߿�
			}
			
			System.out.println("----------------------");
			
			
			

		}//while
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}// main
}
