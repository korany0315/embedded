package ex3_window_listener;

import java.awt.Frame;

public class FrameMain {
	public static void main(String[] args) {
		
		Frame f = new Frame();
		
//		f.setSize(300, 300);
//		f.setLocation(400, 200);
//		���� ���� ǥ�� �ϰ������ Bounds
		f.setBounds(400, 200, 300, 300);
		
		//frame���� ���� ��ưŬ���� �����ϴ� �̺�Ʈ ������ ����
		f.addWindowListener( new MyListener() );
		
		f.setVisible(true);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main

}
