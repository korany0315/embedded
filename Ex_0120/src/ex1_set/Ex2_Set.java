package ex1_set;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

import javax.swing.event.TreeSelectionEvent;

public class Ex2_Set {
	
	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<Integer>(); 
		
		// 로또번호 중복안되게 만드는 쉬운 방법
		Random rnd = new Random();
		
		while(true) {
			
			int v = rnd.nextInt(45)+1;
			hs.add(v);
			
			if( hs.size() == 6 ) {
				break;
			}
			
		}//while
		
		System.out.println(hs);
		
		// 값의 중복을 허용하지 않으면서 
		// 오름차순 정렬기능을 가지고있다.
		TreeSet<Integer> ts = new TreeSet<Integer>();
		
		while( ts.size() !=6 ) {
			int n = rnd.nextInt(45)+1;
			ts.add(n);
		}
		System.out.println(ts);
		
		
		TreeSet<String> ts2 = new TreeSet<String>();
		ts2.add("민지");
		ts2.add("순명");
		ts2.add("미선");
		ts2.add("경완");
		ts2.add("양이");
		
		System.out.println(ts2);
		
		
		
		
		
		
		
		
	}//main
	

}
