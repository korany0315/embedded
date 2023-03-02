package ex6_work;

import java.util.Scanner;

public class WordGameMain {
	public static void main(String[] args) {
		
		// ����
		
		// strArr�� ��� ���� �ϳ��� ���
		// �������� �������Ѵ�.
		// �����ĵ� ������ ������ �����ϰ�
		// ������ �ܾ ������ �ڵ带 �ۼ�

		// ���� : AAJV
		// ���� : JAAV
		// JAAV ����...
		// ���� : java
		// JAVA ����!
		///

		Scanner sc = new Scanner(System.in);
		WordScramble ws = new WordScramble();
		String answer = ws.getAnswer(); // ����

		// ws���� ������ ������ �����ش�
		String question = ws.getScrambleWord(answer);

		System.out.println("���� : " + question);

		while (true) {

			System.out.println("����? : ");
			String str = sc.next();

			// ����ڰ� �Է¹��� ���ڿ��� str�� ������ answer�� ���Ѵ�
			if (str.equalsIgnoreCase(answer)) {
				System.out.println(answer + "����!");
				break;
			} else {
				System.out.println(str + "����..");
			}

		}

	}// main

}
