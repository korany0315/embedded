package ex3_window_listener;

import java.awt.Frame;

public class FrameMain {
	public static void main(String[] args) {
		
		Frame f = new Frame();
		
//		f.setSize(300, 300);
//		f.setLocation(400, 200);
//		위를 같이 표현 하고싶을때 Bounds
		f.setBounds(400, 200, 300, 300);
		
		//frame에게 우상단 버튼클릭을 감지하는 이벤트 감지자 부착
		f.addWindowListener( new MyListener() );
		
		f.setVisible(true);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main

}
