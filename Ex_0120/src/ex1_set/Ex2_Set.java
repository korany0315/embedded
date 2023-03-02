package ex1_set;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

import javax.swing.event.TreeSelectionEvent;

public class Ex2_Set {
	
	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<Integer>(); 
		
		// �ζǹ�ȣ �ߺ��ȵǰ� ����� ���� ���
		Random rnd = new Random();
		
		while(true) {
			
			int v = rnd.nextInt(45)+1;
			hs.add(v);
			
			if( hs.size() == 6 ) {
				break;
			}
			
		}//while
		
		System.out.println(hs);
		
		// ���� �ߺ��� ������� �����鼭 
		// �������� ���ı���� �������ִ�.
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		while( ts.size() !=6 ) {
			int n = rnd.nextInt(45)+1;
			ts.add(n);
		}
		System.out.println(ts);
		
		
		TreeSet<String> ts2 = new TreeSet<String>();
		ts2.add("����");
		ts2.add("����");
		ts2.add("�̼�");
		ts2.add("���");
		ts2.add("����");
		
		System.out.println(ts2);
		
		
		
		
		
		
		
		
	}//main
	

}
