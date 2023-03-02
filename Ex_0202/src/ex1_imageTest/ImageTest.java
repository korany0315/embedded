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

		// �̹��� �غ�
		ImageIcon img1 = new ImageIcon("nyang.jpg");
		ImageIcon img2 = new ImageIcon("nyang2.jpg");
		ImageIcon btnImg = new ImageIcon("heart2.png");

		// ImageIcon�� �߰��� �� �ִ� ��ü�� JLabel, JButton ���̴�
		JLabel jl = new JLabel(img1);
		jl.setBounds(0, 0, 500, 500);
		
		// ��ư ����
		JButton btn = new JButton();
		btn.setIcon(btnImg);
		btn.setBounds(250, 100, 50, 50);
		
		//��ư Ŭ�� ����
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jl.setIcon(img2);
			}
		});
		
		//f�� �̹����� ���� jLabel�� �߰�
		f.add(btn);
		f.add(jl);

		// X��ư Ŭ�� ������ ���� adapterŬ����
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(java.awt.event.WindowEvent e) {

				System.exit(0); // �����ִ� ��� �������� ����
			};

		});

		f.setVisible(true);

	}// main

}
