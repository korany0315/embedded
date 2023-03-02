package ex1_button;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;

public class Ex1_ButtonTest {
	public static void main(String[] args) {

		Frame f = new Frame("��ư �׽�Ʈ");
		f.setBounds(500, 400, 400, 400);
//					x��ǥ  y��ǥ   �ʺ�	����

		// Frame Ŭ������ �߰��� ������Ʈ�� ȭ�鿡 ���� ä����� �ϴ� �Ӽ��� �������ִ�.
		f.setLayout(null); // �Ӽ����� null : �ڵ���ġ�� ��

		// ok��ư ����
		Button btnOk = new Button("Ȯ��");

		// �ڵ���ġ�� �����ִ� Frame�� ���� �� �ڽ� ������Ʈ����
		// �ݵ�� ��ġ�� ũ�Ⱚ�� �����Ǿ� �־���Ѵ�.
		btnOk.setBounds(70, 90, 100, 50);

		//close��ư ����
		Button btnClose = new Button("�ݱ�");
		btnClose.setBounds(230, 90, 100, 50);

		// ����� �� ��ư�鿡 ���ؼ� �̺�Ʈ ������ �߰�
		btnOk.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ok��ư Ŭ�� �Ϸ�");

			}
		});

		// btnClose�� �����
		btnClose.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose(); // ������ ����
				System.out.println("������ ����");

			}
		});

		// ������ ��ư f�� �߰�
		f.add(btnOk);
		f.add(btnClose); // �����ϸ� �������� ���ļ� �ڽĵ��� add���Ѽ� �����߰��� close�� ���δ�

		// ���� // X��ư Ŭ�� ������ ���� adapterŬ����
		f.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(java.awt.event.WindowEvent e) {

				System.exit(0); // �����ִ� ��� �������� ����
			};

		});

		f.setVisible(true);

	}

	private static void addWindowListener(WindowAdapter windowAdapter) {
		// TODO Auto-generated method stub

	}// main

}
