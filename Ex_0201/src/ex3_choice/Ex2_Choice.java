package ex3_choice;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.event.WindowAdapter;

public class Ex2_Choice {
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setBounds(500, 200, 300, 200);
		f.setLayout(null);
		
		Choice day = new Choice();
		day.add("월");
		day.add("화");
		day.add("수");
		day.add("목");
		day.add("금");
		day.add("토");
		day.add("일");
		
		day.setBounds(10, 40, 100, 0);
		
		//day에 감지자 추가
		day.addItemListener(new Ex2_ChoiceListener());
		
		f.add(day);
		
		
		// X버튼 클릭 감지를 위한 adapter클래스
				f.addWindowListener(new WindowAdapter() {

					@Override
					public void windowClosing(java.awt.event.WindowEvent e) {

						System.exit(0); // 열려있는 모든 프레임을 종료
					};

				});

		
		
		f.setVisible(true);
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main

}













