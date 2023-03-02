package ex6_work;

import java.util.Scanner;

public class WordGameMain {
	public static void main(String[] args) {
		
		// 문제
		
		// strArr에 담긴 문장 하나를 골라서
		// 랜덤으로 재정렬한다.
		// 재정렬된 문장을 문제로 출제하고
		// 원래의 단어를 맞히는 코드를 작성

		// 문제 : AAJV
		// 정답 : JAAV
		// JAAV 오답...
		// 정답 : java
		// JAVA 정답!
		///

		Scanner sc = new Scanner(System.in);
		WordScramble ws = new WordScramble();
		String answer = ws.getAnswer(); // 정답

		// ws에서 가져온 정답을 섞어준다
		String question = ws.getScrambleWord(answer);

		System.out.println("문제 : " + question);

		while (true) {

			System.out.println("정답? : ");
			String str = sc.next();

			// 사용자가 입력받은 문자열이 str과 정답인 answer를 비교한다
			if (str.equalsIgnoreCase(answer)) {
				System.out.println(answer + "정답!");
				break;
			} else {
				System.out.println(str + "오답..");
			}

		}

	}// main

}
