package ex2_char_input;

import java.io.FileReader;

public class Ex1_FileReader {
	public static void main(String[] args) {

		FileReader fr = null;
//		System.out.println((char)50504   );
		
		try {
			
			fr = new FileReader("C:\\embedded_kmz\\test.txt");
			
			int code = -1;
			
			while((code = fr.read()) != -1) {
				
				//fr�� �⺻������ 2byte������ �ѱ۵��� �����ڵ� ���·� �о���°��� �����ϹǷ� 
				// byte[]���� ���� �ʿ䰡 ����!!
				System.out.println(code + " ");
			}
				
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				fr.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}//main
}
