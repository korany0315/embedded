package ex2_map;

import java.util.HashMap;

public class Ex1_Map {
	public static void main(String[] args) {

		/*
		 * 	Map : 키(key) 와 값(value)을 묶어서 하나의 데이터로 저장한다.
		 * 	키 값을 통해서 밸류를 바로 찾아 검색하므로 많은 양으 ㅣ데이터 중에서 원하는 값을 찾아내는데
		 *	매우 뛰어난 성능을 발휘한다.
		 */
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(3,15);  // 다른컬랙션들과 다르게 add메서드가 아닌 put메서드를 통해 값을 입력한다.
		map.put(6,21);
		map.put(2, 2);
		map.put(5,2); // value값 중복을 제거하지 않음
		map.put(3, 18); // 중복된 key값을 허용하지 않는다. 3=18로 바뀌고 위의 3=15는 삭제된다.
		
		System.out.println(map);
		
		System.out.println("-----------------------");
		
		
		// 15가 필요하다면 3이라는 이름의 열쇠가 필요하다
		int res = map.get(6);
		
		System.out.println("-----------------------");
		
		//map 객체의 key값 중 1이 포함되어 있다면  true
		if(map.containsKey(2)) {
			System.out.println(map.get(1));
		}
		
		//map 객체의 value값 중 18이 포함되어 있다면  true : value값을 통해서 key의 값을 가져오는건 불가!
		if( map.containsValue(18)){
			System.out.println("map의 어딘가에 18이 저장되어있다");
		}
		
		System.out.println("-----------------------");
		
		// 키값이 2인 공간을 삭제
		map.remove(5);
		System.out.println(map); 
		
		// 맵의 모든데이터 삭제
		map.clear();
		System.out.println(map.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}// main
}
