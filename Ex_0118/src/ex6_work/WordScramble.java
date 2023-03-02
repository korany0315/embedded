package ex6_work;

import java.util.Random;

public class WordScramble {
	// ���� �� ���� �ܾ ��ȯ�ϴ� Ŭ����
	String[] strArr = {"Apple", "View", "Blue", "Banana"};
	String shake = ""; // �ܾ ��� ������ ��ü
	
	// ������ ��ȯ�ϴ� �޼���
	public String getAnswer() {
		//Random rnd = new Random();
		// int idx = rnd.nextInt();
		
		// ������ �͸�Ŭ������ �����ߴ�.
		// rnd, sc ��� ���� ��ü�� �̸��� �������� �ʰ� new�� ���� 
		// �ٷ� ����ϰ� ����ѵ� , �� �ڸ����� �����ϴ� ���·� ����ϴ� �����
		// �͸�Ŭ������� �Ѵ�.
		int idx = new Random().nextInt( strArr.length );
		
		return strArr[idx];
	}
	
	
	// ������ ��� ������ ������ִ� �޼��� //�ٽ�
	public String getScrambleWord(String word) {
		// word : Blue
		
		// ������ ���ڴ����� ��� �����Ѵ�.
		int[]inArr = new int[word.length()];
		
		// ������� inArr�迭�� ��ġ�� �ʴ� ������ ä���ִ´�.(lotto�� ���)
		outer : for(int i = 0; i<inArr.length;) {
			
			inArr[i] = new Random().nextInt( inArr.length );
			
			//�ߺ�üũ
			for( int j = 0; j<i; j++ ) {
				if(inArr[i] == inArr[j]) {
					continue outer;
				}
			}//inner
			
			i++;
		}//outer
		
		for(int i = 0; i< inArr.length; i++) {
			
			// �ܾ� ����
			shake += word.charAt(inArr[i]);
			
		}
		
		return shake; // ���� ���ڿ��� ��ȯ
		
	}//getScrambleWord(String word)
	
	
	
}
