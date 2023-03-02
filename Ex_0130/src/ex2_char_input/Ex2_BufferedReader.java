package ex2_char_input;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ex2_BufferedReader {
	public static void main(String[] args) {
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			
			fr = new FileReader("C:\\embedded_kmz\\test.txt");
			br = new BufferedReader(fr);
			
			String msg = "";
			
			while( (msg = br.readLine()) != null ) {
				System.out.println(msg);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				
				//char����� ��Ʈ�� ���� 
				// ������ �������� �ݾ��ִ� ���� ����
				br.close();
				fr.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		
		
		
		
		
		
	}//main

}
