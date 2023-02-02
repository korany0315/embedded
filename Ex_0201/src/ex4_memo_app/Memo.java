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

		Frame frame = new Frame("메모장");
		frame.setBounds(500, 200, 250, 400);
		frame.setLayout(null); // 자동배치 끄기
		frame.setBackground(Color.pink);

		Font font = new Font("", Font.PLAIN, 20);

		// 상단에 자리잡을 컴포넌트들------------------------------
		TextField tf = new TextField();
		tf.setBounds(10, 35, 180, 20);

		Button btn = new Button("ok");
		btn.setBounds(195, 35, 45, 20);
		btn.setEnabled(false); //ok버튼을 비활성화 상태로 시작
		// --------------------------------------------------

		// 중앙에 자리잡을 컴포넌트들-------------------------------
		TextArea ta = new TextArea("", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY);
		ta.setBounds(10, 60, 230, 280);
		ta.setFont(font);
		ta.setEditable(false); // ta에 직접적으로 값을 입력하는것을 방지
		
		//ta.setText("값");
		//ta.getText(); --> ta에 쓰여있는 내용을 가져온다
		// --------------------------------------------------

		// 하단에 자리잡을 컴포넌트들-------------------------------
		Button btnSave = new Button("저장");
		btnSave.setBounds(10, 353, 110, 30);

		Button btnClose = new Button("닫기");
		btnClose.setBounds(130, 353, 110, 30);

		// 닫기 버튼에 프레임을 종료하는 감지자 등록
		btnClose.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();

			}
		});

		// --------------------------------------------------
		
		// TextField(tf)에 값이 있는 경우에만 ok버튼을 활성화
		tf.addTextListener(new TextListener() {
			
			@Override
			public void textValueChanged(TextEvent e) {
				
				if( tf.getText().trim().length() == 0 ) {
					btn.setEnabled(false);//버튼 비활성화
				}else {
					btn.setEnabled(true);//버튼 활성화
				}
				
			}
		});
		
		//ok버튼 클릭 시 tf의 내용을 ta에 추가할 감지자
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ta.append(tf.getText() + "\n");
				
				//tf를 비워준다.
				tf.setText("");
				
				//커서를 다시 위로 올리기
				tf.requestFocus();
				
			}
		});

		//엔터값으로 tf의 값을 ta에 추가
		tf.addKeyListener(new KeyAdapter() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
				//엔터값이 감지 되었다면 
				if(e.getKeyChar() == KeyEvent.VK_ENTER) {
	
					ta.append(tf.getText() + "\n");
					
					//tf를 비워준다.
					tf.setText("");
					
					//커서를 다시 위로 올리기
					tf.requestFocus();
					
				}
			}
			
		});
		
		//저장 버튼 클릭시 이벤트 감지자
		btnSave.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String message = ta.getText();

				FileWriter fw = null;
				BufferedWriter bw = null;
				
				try {
					
					//FileDialog : 팝업 알림창
					FileDialog fd = new FileDialog(frame, "저장", FileDialog.SAVE); //frame이 부모창이 되는 것
					fd.setVisible(true);//팝업창 활성화
					
					//					C:\embedded_kmz \ memo.txt
					System.out.println(fd.getDirectory()+fd.getFile());
					String path = fd.getDirectory()+fd.getFile();
					
					fw = new FileWriter(path);
					bw = new BufferedWriter(fw);
					
					bw.write(message);//파일생성
					
					bw.flush();
					
					if(fd.getFile() != null) {
						JOptionPane.showMessageDialog(frame, "저장 완료!"); //JOptionPane  팝업
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
		
		// frame에 컴포넌트들 추가
		frame.add(tf);
		frame.add(btn);
		frame.add(ta);
		frame.add(btnSave);
		frame.add(btnClose);
		// X버튼 클릭 감지를 위한 adapter클래스
		frame.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(java.awt.event.WindowEvent e) {

				System.exit(0); // 열려있는 모든 프레임을 종료
			};

		});

		frame.setResizable(false);// false : 만들어진 프레임의 크기조정 안되도록 막음
		frame.setVisible(true);

	}// main

}
