package ex3_choice;

import java.awt.Choice;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;

public class Ex1_Choice {
	// static이 있어서 멤버변수로 만들어줘야함
	static String ss = "나는 A형";

	public static void main(String[] args) {

		Frame f = new Frame();
		f.setBounds(500, 300, 500, 250);
		f.setLayout(null);

		// 선택상자(Choice)객체 생성
		Choice bt = new Choice();
		bt.add("A");
		bt.add("B");
		bt.add("O");
		bt.add("AB");

		// choice객체의 높이값은 안에 있는 요소의 사이즈로 결정되므로
		// 0으로 두어도 무관하다
		bt.setBounds(10, 35, 100, 0);

		// 결과를 보여줄 label
		Label resultLabel = new Label(ss);
		Font font = new Font("", Font.BOLD, 30);
		resultLabel.setFont(font);

		resultLabel.setBounds(200, 100, 200, 50);

		// 혈액형을 선택하는 choice 객체에게 이벤트 감지자 추가
		bt.addItemListener(new ItemListener() {

			// ss를 위에서 선언하고 싶을때 static을 추가해줘야 함
			@Override
			public void itemStateChanged(ItemEvent e) {
				ss = bt.getSelectedItem(); // bt에서 getSelectedItem()선택된 아이템
				// 내가 선택한 항목을 label의 내용으로 갱신
				resultLabel.setText("나는" + ss + "형");

			}
		});

		// 컴포넌트를 프레임에 추가
		f.add(bt);
		f.add(resultLabel);

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
