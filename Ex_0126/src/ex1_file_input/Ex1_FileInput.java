package ex1_file_input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import util.MyPath;

public class Ex1_FileInput {
	public static void main(String[] args) {

		
	String path = MyPath.PATH + "/test.txt";//c:\embedded_kmz
	
	File f = new File(path);
	
	//���� ��λ� ������ ���ٸ�..!
	if(f.exists()) {
		
		// ���� Ŭ������ ����� InputStream�� ����
		try {
			FileInputStream fis = new FileInputStream(f);
			
			int code = -1;
			
			//fis�� 1byte������ ���� �����´�
			//fis��Ʈ���� ���̻� �о�� ������ ���ٸ� -1�� ��ȯ�Ѵ�.
			//byte������ �����͸� �дٰ� EOF(End of File)�� �����ٴ°��� �ǹ��Ѵ�.
			while((code = fis.read()) != -1 ) {
				
				System.out.print( (char)code );
				
			}//while
			
			// **�߿�**
			//����� �Ϸ�� ��Ʈ���� �ݵ�� �ݾ�����Ѵ�!!
			fis.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	}//main
}
