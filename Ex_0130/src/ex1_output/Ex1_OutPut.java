package ex1_output;

import java.io.PrintStream;

public class Ex1_OutPut {
	public static void main(String[] args) {

		//System.out;�� ���� �ܼ�â�� �����͸� ����ϴ� ����
		PrintStream ps = System.out;
		ps.write('A');
		
		byte[] b_write = {'B','C','D'};
		
		try {
			ps.write(b_write);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		ps.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main
}
