package ex1_list;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex3_ArrayList {
	public static void main(String[] args) {
		
		//추가 : abc
		// [abc]
		// 추가 : aabb
		// [abc, aabb];
		// 추가 : abc
		// 중복된 아이디
		// [abc, aabb]
		// 추가 : exit
		// 종료

		ArrayList<String> list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		outer : while (true) {
			
			System.out.println("추가 : ");
			String id = sc.next();
			
//			// 아이디 중복체크
//			for(int i=0; i<list.size(); i++) {
//				if(id.equalsIgnoreCase(list.get(i))) {
//					
//					System.out.println("중복된 아이디");
//					// 중복된 아이디라면 list.add까지 접근하지 못하도록 한다.
//					continue outer;
//				}
//			}
			
			// 아이디 중복체크2
			if(list.contains(id)) {  //list.contains(id) == true
				System.out.println("중복된 아이디");
				continue outer;
			}
			
			
			
			if( id.equalsIgnoreCase("exit") ) {
				System.out.println("종료");
				break;
			}
			

			
			list.add(id);
			
			System.out.println(list);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main

}
