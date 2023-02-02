package ex1_button;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

public class Ex1_ButtonTest {
	public static void main(String[] args) {

		Frame f = new Frame("버튼 테스트");
		f.setBounds(500, 400, 400, 400);
//					x좌표  y좌표   너비	높이

		// Frame 클래스는 추가된 컴포넌트를 화면에 가득 채우려고 하는 속성을 가지고있다.
		f.setLayout(null); // 속성값을 null : 자동배치를 끔

		// ok버튼 생성
		Button btnOk = new Button("확인");

		// 자동배치가 꺼져있는 Frame에 들어가게 될 자식 컴포넌트들은
		// 반드시 위치와 크기값이 설정되어 있어야한다.
		btnOk.setBounds(70, 90, 100, 50);

		//close버튼 생성
		Button btnClose = new Button("닫기");
		btnClose.setBounds(230, 90, 100, 50);

		// 만들어 둔 버튼들에 대해서 이벤트 감지자 추가
		btnOk.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ok버튼 클릭 완료");

			}
		});

		// btnClose도 만들기
		btnClose.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose(); // 프레임 종료
				System.out.println("프레임 종료");

			}
		});

		// 생성된 버튼 f에 추가
		f.add(btnOk);
		f.add(btnClose); // 실행하면 프레임은 겹쳐서 자식들을 add시켜서 새로추가된 close만 보인다

		// 종료 // X버튼 클릭 감지를 위한 adapter클래스
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(java.awt.event.WindowEvent e) {

				System.exit(0); // 열려있는 모든 프레임을 종료
			};

		});

		f.setVisible(true);

	}

	private static void addWindowListener(WindowAdapter windowAdapter) {
		// TODO Auto-generated method stub

	}// main

}
