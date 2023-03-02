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
		f.setLayout(null); // �ڵ���ġ ����

		Button btn1 = new Button("��ư1");

		btn1.setBounds(190, 170, 200, 100);

		Button btn2 = new Button("��ư2");
		btn2.setBounds(400, 170, 200, 100);

		Button btn3 = new Button("��ư3");
		btn3.setBounds(610, 170, 200, 100);

		// ��ư�鿡�� �߰��� ������ ����
		ActionListener click = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String str = e.getActionCommand();

				int n = e.getID();
				System.out.println(n);

				switch (str) {
				case "��ư1":
					System.out.println("1�� ��ư�� Ŭ���߾��");
					break;
				case "��ư2":
					System.out.println("�ȳ��ϼ���");
					break;
				case "��ư3":
					System.out.println("�ݰ����ϴ�.");
					break;
				}
				// switch
			}
		};

		// ��ư ������ �ϳ��� �����ڸ� ��ÿ� ����
		btn1.addActionListener(click);
		btn2.addActionListener(click);
		btn3.addActionListener(click);

		f.add(btn1);
		f.add(btn2);
		f.add(btn3);

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
