package ex4_memo_app;

import java.awt.Button;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.io.BufferedWriter;
import java.io.FileWriter;

import javax.activation.FileDataSource;
import javax.swing.JOptionPane;

public class Memo {
	public static void main(String[] args) {

		Frame frame = new Frame("�޸���");
		frame.setBounds(500, 200, 250, 400);
		frame.setLayout(null); // �ڵ���ġ ����
		frame.setBackground(Color.pink);

		Font font = new Font("", Font.PLAIN, 20);

		// ��ܿ� �ڸ����� ������Ʈ��------------------------------
		TextField tf = new TextField();
		tf.setBounds(10, 35, 180, 20);

		Button btn = new Button("ok");
		btn.setBounds(195, 35, 45, 20);
		btn.setEnabled(false); //ok��ư�� ��Ȱ��ȭ ���·� ����
		// --------------------------------------------------

		// �߾ӿ� �ڸ����� ������Ʈ��-------------------------------
		TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setBounds(10, 60, 230, 280);
		ta.setFont(font);
		ta.setEditable(false); // ta�� ���������� ���� �Է��ϴ°��� ����
		
		//ta.setText("��");
		//ta.getText(); --> ta�� �����ִ� ������ �����´�
		// --------------------------------------------------

		// �ϴܿ� �ڸ����� ������Ʈ��-------------------------------
		Button btnSave = new Button("����");
		btnSave.setBounds(10, 353, 110, 30);

		Button btnClose = new Button("�ݱ�");
		btnClose.setBounds(130, 353, 110, 30);

		// �ݱ� ��ư�� �������� �����ϴ� ������ ���
		btnClose.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();

			}
		});

		// --------------------------------------------------
		
		// TextField(tf)�� ���� �ִ� ��쿡�� ok��ư�� Ȱ��ȭ
		tf.addTextListener(new TextListener() {
			
			@Override
			public void textValueChanged(TextEvent e) {
				
				if( tf.getText().trim().length() == 0 ) {
					btn.setEnabled(false);//��ư ��Ȱ��ȭ
				}else {
					btn.setEnabled(true);//��ư Ȱ��ȭ
				}
				
			}
		});
		
		//ok��ư Ŭ�� �� tf�� ������ ta�� �߰��� ������
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.append(tf.getText() + "\n");
				
				//tf�� ����ش�.
				tf.setText("");
				
				//Ŀ���� �ٽ� ���� �ø���
				tf.requestFocus();
				
			}
		});

		//���Ͱ����� tf�� ���� ta�� �߰�
		tf.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
				//���Ͱ��� ���� �Ǿ��ٸ� 
				if(e.getKeyChar() == KeyEvent.VK_ENTER) {
	
					ta.append(tf.getText() + "\n");
					
					//tf�� ����ش�.
					tf.setText("");
					
					//Ŀ���� �ٽ� ���� �ø���
					tf.requestFocus();
					
				}
			}
			
		});
		
		//���� ��ư Ŭ���� �̺�Ʈ ������
		btnSave.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String message = ta.getText();

				FileWriter fw = null;
				BufferedWriter bw = null;
				
				try {
					
					//FileDialog : �˾� �˸�â
					FileDialog fd = new FileDialog(frame, "����", FileDialog.SAVE); //frame�� �θ�â�� �Ǵ� ��
					fd.setVisible(true);//�˾�â Ȱ��ȭ
					
					//					C:\embedded_kmz \ memo.txt
					System.out.println(fd.getDirectory()+fd.getFile());
					String path = fd.getDirectory()+fd.getFile();
					
					fw = new FileWriter(path);
					bw = new BufferedWriter(fw);
					
					bw.write(message);//���ϻ���
					
					bw.flush();
					
					if(fd.getFile() != null) {
						JOptionPane.showMessageDialog(frame, "���� �Ϸ�!"); //JOptionPane  �˾�
					}
					
					System.out.println(fd.getFile() );
					
				} catch (Exception e2) {

				}finally {
					try {
						bw.close();
						fw.close();
					} catch (Exception e3) {
						// TODO: handle exception
					}
				}
				
			}
		});
		
		// frame�� ������Ʈ�� �߰�
		frame.add(tf);
		frame.add(btn);
		frame.add(ta);
		frame.add(btnSave);
		frame.add(btnClose);
		// X��ư Ŭ�� ������ ���� adapterŬ����
		frame.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(java.awt.event.WindowEvent e) {

				System.exit(0); // �����ִ� ��� �������� ����
			};

		});

		frame.setResizable(false);// false : ������� �������� ũ������ �ȵǵ��� ����
		frame.setVisible(true);

	}// main

}
