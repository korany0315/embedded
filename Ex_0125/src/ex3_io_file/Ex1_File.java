package ex3_io_file;

import java.io.File;

public class Ex1_File {
	public static void main(String[] args) {

		// IO ( Input, Output)
		// IO�� ����� ��Ʈ���� �ǹ��Ѵ�.
		// ��Ʈ���̶�, �����͸� ������ϱ� ���� ������ ���
		// �ܼ�(c:, d:, Ű����...)���� �����͸� ������
		// JVM�� �����͸� �ַܼ� �������� ���� �۾��� �� �� �ֵ��� �ϴ� Ŭ������
		// JVM���� �ַܼ� ���� �������� output, �ַܼ� ���� �ҷ����� input
		
		String path = "C:\\embedded_kmz\\test.txt";
		
		File fl = new File(path);
		
		// fl�� ������ ��ΰ� ���� ������ ��� true
		// ���丮(����) ������ ��� false
		if(fl.isFile()) {
			System.out.println("�뷮 : " + fl.length() + "byte");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main
}
