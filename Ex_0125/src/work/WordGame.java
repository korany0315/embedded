package work;

import java.util.ArrayList;
import java.util.Random;

public class WordGame extends Thread {

	private ArrayList<String> arr;
	private String[] data;
	
	//������ ������ ����
	private boolean playing = true;
	
	// ������
	public WordGame(ArrayList<String> arr, String[] data) {
		this.arr = arr;
		this.data = data;
	}
	
	public void setPlaying(boolean playing) {
		this.playing = playing;
	}
	
	
	@Override
	public void run() {
		//3�ʰ������� arr�� �ܾ� �߰�
		while(playing) {
			
			int rnd = new Random().nextInt( data.length );
			
			arr.add(data[rnd]);
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}//while
		
	}

}
