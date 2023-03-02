package ex2_button;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;

public class Ex2_CheckBox {
	public static void main(String[] args) {

		Frame f = new Frame("����");
		f.setBounds(500, 200, 800, 250);
		f.setLayout(null);

		// ��Ʈ�� ���õ� Ŭ����
		Font font = new Font("�ü�ü", Font.ITALIC, 30);

		// ������ �ؽ�Ʈ�� �����ֱ� ���� Ŭ����
		Label qusetion1 = new Label("1. ����� ��̴� �����Դϱ�?");
		qusetion1.setFont(font);
		qusetion1.setBounds(10, 30, 410, 50);
		qusetion1.setBackground(Color.pink);

		// üũ�ڽ��� ������ �����ϴ� ������
		ItemListener check_click = new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				String str = e.getItem().toString();
				// System.out.println(str);

				String res = "";

				switch (str) {
				case "��ȭ":
					res = e.getStateChange() == 1 ? "��ȭ ����" : "��ȭ ���� ����";
					break;

				case "����":
					res = e.getStateChange() == 1 ? "���� ����" : "���� ���� ����";
					break;
				}// switch

				System.out.println(res);

			}
		};

		// üũ�ڽ� ����
		Checkbox movie = new Checkbox("��ȭ");
		movie.setBounds(10, 80, 100, 50);
		Checkbox book = new Checkbox("����");
		book.setBounds(120, 80, 100, 50);
		Checkbox sports = new Checkbox("�");
		sports.setBounds(230, 80, 100, 50);

		// üũ�ڽ��鿡�� �̺�Ʈ ������ ���
		movie.addItemListener(check_click);
		book.addItemListener(check_click);
		sports.addItemListener(check_click);

		// ������ ���� label����
		Label question2 = new Label("2. ����� ������ �����Դϱ�?");
		question2.setFont(font);
		question2.setBounds(10, 140, 410, 50);
		question2.setBackground(Color.GRAY);
		
		//������ư�� �̺�Ʈ ������
		ItemListener radio_click = new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				String str = e.getItem().toString();
				System.out.println(str);
				
				
			}
		};
		
		//���߼����� �Ұ����� RadioButton�� ����
		CheckboxGroup group = new CheckboxGroup();
		
		Checkbox male = new Checkbox("����",group, false);
		male.setBounds(10, 200, 100, 50);
		
		Checkbox female = new Checkbox("����",group, false);
		female.setBounds(120, 200, 100, 50);
		
		//������ư�� �̺�Ʈ ������ ���
		female.addItemListener(radio_click);
		male.addItemListener(radio_click);
		
		// ���� ������Ʈ���� f�� �߰�
		f.add(qusetion1);
		f.add(movie);
		f.add(book);
		f.add(sports);
		f.add(question2);
		f.add(male);
		f.add(female);
		

		// X��ư Ŭ�� ������ ���� adapterŬ����
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
