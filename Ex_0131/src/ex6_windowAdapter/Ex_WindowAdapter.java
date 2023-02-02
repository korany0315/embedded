package ex6_windowAdapter;

import java.awt.Frame;
import java.awt.event.WindowAdapter;

public class Ex_WindowAdapter {
	public static void main(String[] args) {

		Frame f = new Frame();
		f.setBounds(500, 300, 200, 300);

		// X��ư Ŭ�� ������ ���� adapterŬ����
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(java.awt.event.WindowEvent e) {

				System.exit(0); // �����ִ� ��� �������� ����
			};

		});

		f.setVisible(true);

///////
//		�ι�° ������ �����
		Frame f2 = new Frame("�ι�°");
		f2.setBounds(300, 300, 500, 200);

		// X��ư Ŭ�� ������ ���� adapterŬ����
		f2.addWindowListener(new WindowAdapter() {

			@Override // �������� �������̵� ��Ա�
			public void windowClosing(java.awt.event.WindowEvent e) {
				f2.dispose();// f2��ü�� ����
				// System.exit(0); // �����ִ� ��� �������� ����
			};

		});

		f2.setVisible(true);

	}// main

}
