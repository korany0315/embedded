package ex1_imageTest;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class ImageTest {
	public static void main(String[] args) {

		Frame f = new Frame();
		f.setBounds(500, 200, 500, 500);
		f.setLayout(null);

		// 이미지 준비
		ImageIcon img1 = new ImageIcon("nyang.jpg");
		ImageIcon img2 = new ImageIcon("nyang2.jpg");
		ImageIcon btnImg = new ImageIcon("heart2.png");

		// ImageIcon을 추가할 수 있는 객체는 JLabel, JButton 뿐이다
		JLabel jl = new JLabel(img1);
		jl.setBounds(0, 0, 500, 500);
		
		// 버튼 생성
		JButton btn = new JButton();
		btn.setIcon(btnImg);
		btn.setBounds(250, 100, 50, 50);
		
		//버튼 클릭 감지
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jl.setIcon(img2);
			}
		});
		
		//f에 이미지를 가진 jLabel을 추가
		f.add(btn);
		f.add(jl);

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
