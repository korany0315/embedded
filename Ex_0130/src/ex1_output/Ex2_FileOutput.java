package ex1_output;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex2_FileOutput {
	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		String path = "C:/embedded_kmz/fileOutput����.txt";
		
		File f = new File(path);
		
		try {
			
			fos = new FileOutputStream(f,true);
			String msg = "new������ �Է���";
			String msg2 = "\n�ݰ�����";
			
			// msg.getBytes() : StringŸ���� ������ byte[]�� �������ִ� �޼���
			fos.write(msg.getBytes());
			fos.write(msg2.getBytes());
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
	}//main

}
