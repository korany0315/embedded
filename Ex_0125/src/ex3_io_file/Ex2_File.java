package ex3_io_file;

import java.io.File;

public class Ex2_File {
	public static void main(String[] args) {
		
		String path = "C:/embedded_kmz";
		
		File fl = new File(path);
		
		// fl�� ������ path��ΰ� ������ ��� true
		if(fl.isDirectory()) { // !fl.isFile()
			System.out.println("---���� Ŭ������ ������ ������ϵ�---");
		
			// f�� ������ ������ ���� ������� �̸��� ��Ƶδ� �޼���
			String[] str = fl.list();
			
			for( int i = 0; i < str.length; i++ ) {
				
				System.out.println(str[i]);
				
			}// for
		}
		
		
		
		
	}//main

}
