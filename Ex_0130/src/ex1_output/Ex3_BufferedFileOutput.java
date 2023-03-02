package ex1_output;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Ex3_BufferedFileOutput {
	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			
			fos = new FileOutputStream("C:\\embedded_kmz\\bos의 예제.txt");
			bos = new BufferedOutputStream(fos);

			String str = "buffered스트림의 예제";
			bos.write(str.getBytes());
			
			//flush : 내용을 물리적으로 기록하기 위한 메서드
			// 순서를 지켜서 닫지 않아도 오류가 나지 않지만 만든 순서의 역순으로 닫아주는것이 가장 좋음
			bos.flush();
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			
			try {
				
				//Output스트림 역시
				//만든 순서의 역순으로 닫아줘야 함
				bos.close();
				fos.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
		
		
		
		
		
		
	}//main

}
