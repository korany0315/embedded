package ex2_map;

import java.util.Collection;
import java.util.HashMap;

public class Ex2_Map {
	public static void main(String[] args) {
		
		HashMap<String, Character> map =  new HashMap<String, Character>();
		// 키값은 문자열, 키로 얻는 value값은 문자로!
		map.put("k1", '가');
		map.put("k2", 'a');
		map.put("k3", 'B');
		map.put("k4", (char)65 );
		
		System.out.println(map);
		
		//Map -> 배열
		Collection<Character> values = map.values();
		Character[] arr = values.toArray( new Character[0]);
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
		// map에서 B라는 값을 얻고싶다면..
		char res = map.get("k3");
		System.out.println("k2로 얻어온 값 : " + res);
		
		char cc = map.get();
		
	}//main

}
