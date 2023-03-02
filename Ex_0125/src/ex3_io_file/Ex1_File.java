package ex3_io_file;

import java.io.File;

public class Ex1_File {
	public static void main(String[] args) {

		// IO ( Input, Output)
		// IO는 입출력 스트림을 의미한다.
		// 스트림이란, 데이터를 입출력하기 위한 일종의 통로
		// 콘솔(c:, d:, 키보드...)에서 데이터를 가져옴
		// JVM의 데이터를 콘솔로 내보내는 등의 작업을 할 수 있도록 하는 클래스들
		// JVM에서 콘솔로 값을 내보내면 output, 콘솔로 값을 불러오면 input
		
		String path = "C:\\embedded_kmz\\test.txt";
		
		File fl = new File(path);
		
		// fl이 접근한 경로가 파일 형식일 경우 true
		// 디렉토리(폴더) 형식일 경우 false
		if(fl.isFile()) {
			System.out.println("용량 : " + fl.length() + "byte");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main
}
