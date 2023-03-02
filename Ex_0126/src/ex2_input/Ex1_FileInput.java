package ex2_input;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class Ex1_FileInput {
	public static void main(String[] args) {

		/*
		 * 	...Stream : 1byte����� ��Ʈ��
		 *  ...Reader, ...Writer : char����� ��Ʈ�� 2byte
		 * 	
		 */
		
		FileInputStream fis = null;
		Scanner sc = new Scanner(System.in);
		
		byte[] keyboard = new byte[100];
		
		//Ű���� ���� �Է¹޾Ƽ� keyboard�迭�� ����
		try {
			System.in.read(keyboard);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		String str = new String(keyboard);
		
		System.out.println(str.trim());
		
		sc.close();
		
		
		
	}//main
}
