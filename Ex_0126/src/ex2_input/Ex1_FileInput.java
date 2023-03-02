package ex2_input;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class Ex1_FileInput {
	public static void main(String[] args) {

		/*
		 * 	...Stream : 1byte기반의 스트림
		 *  ...Reader, ...Writer : char기반의 스트림 2byte
		 * 	
		 */
		
		FileInputStream fis = null;
		Scanner sc = new Scanner(System.in);
		
		byte[] keyboard = new byte[100];
		
		//키보드 값을 입력받아서 keyboard배열에 저장
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
