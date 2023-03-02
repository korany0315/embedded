package work;

import java.util.ArrayList;
import java.util.Scanner;

public class WordGameMain {
	public static void main(String[] args) {

		ArrayList<String> arr = new ArrayList<String>();
		String[] data = { "apple", "banana", "grape", "orange" };

		WordGame wg = new WordGame(arr, data);
		wg.start();// ������ ����

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println(arr);
			System.out.println(">>");
			String in = sc.next();

			if (arr.contains(in)) {
				arr.remove(in); // �ܾ����
			}

			// ���� ���� ����
			if (arr.size() == 0) {
				System.out.println("Ŭ����");
				wg.setPlaying(false);// ������ ����
				break;
			}

		}

	}// main
}
