package ex2_button;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

public class Ex1_Button {
	public static void main(String[] args) {

		Frame f = new Frame();
		f.setBounds(500, 300, 1000, 500);
		f.setLayout(null); // 자동배치 끄기

		Button btn1 = new Button("버튼1");

		btn1.setBounds(190, 170, 200, 100);

		Button btn2 = new Button("버튼2");
		btn2.setBounds(400, 170, 200, 100);

		Button btn3 = new Button("버튼3");
		btn3.setBounds(610, 170, 200, 100);

		// 버튼들에게 추가할 감지자 생성
		ActionListener click = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String str = e.getActionCommand();

				int n = e.getID();
				System.out.println(n);

				switch (str) {
				case "버튼1":
					System.out.println("1번 버튼을 클릭했어요");
					break;
				case "버튼2":
					System.out.println("안녕하세요");
					break;
				case "버튼3":
					System.out.println("반갑습니다.");
					break;
				}
				// switch
			}
		};

		// 버튼 세개가 하나의 감지자를 통시에 참조
		btn1.addActionListener(click);
		btn2.addActionListener(click);
		btn3.addActionListener(click);

		f.add(btn1);
		f.add(btn2);
		f.add(btn3);

		// X버튼 클릭 감지를 위한 adapter클래스
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(java.awt.event.WindowEvent e) {

				System.exit(0); // 열려있는 모든 프레임을 종료
			};

		});

		f.setVisible(true);

	}// main

}
