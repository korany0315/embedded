package ex2_map;

import java.util.HashMap;

public class Ex1_Map {
	public static void main(String[] args) {

		/*
		 * 	Map : Ű(key) �� ��(value)�� ��� �ϳ��� �����ͷ� �����Ѵ�.
		 * 	Ű ���� ���ؼ� ����� �ٷ� ã�� �˻��ϹǷ� ���� ���� �ӵ����� �߿��� ���ϴ� ���� ã�Ƴ��µ�
		 *	�ſ� �پ ������ �����Ѵ�.
		 */
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(3,15);  // �ٸ��÷��ǵ�� �ٸ��� add�޼��尡 �ƴ� put�޼��带 ���� ���� �Է��Ѵ�.
		map.put(6,21);
		map.put(2, 2);
		map.put(5,2); // value�� �ߺ��� �������� ����
		map.put(3, 18); // �ߺ��� key���� ������� �ʴ´�. 3=18�� �ٲ�� ���� 3=15�� �����ȴ�.
		
		System.out.println(map);
		
		System.out.println("-----------------------");
		
		
		// 15�� �ʿ��ϴٸ� 3�̶�� �̸��� ���谡 �ʿ��ϴ�
		int res = map.get(6);
		
		System.out.println("-----------------------");
		
		//map ��ü�� key�� �� 1�� ���ԵǾ� �ִٸ�  true
		if(map.containsKey(2)) {
			System.out.println(map.get(1));
		}
		
		//map ��ü�� value�� �� 18�� ���ԵǾ� �ִٸ�  true : value���� ���ؼ� key�� ���� �������°� �Ұ�!
		if( map.containsValue(18)){
			System.out.println("map�� ��򰡿� 18�� ����Ǿ��ִ�");
		}
		
		System.out.println("-----------------------");
		
		// Ű���� 2�� ������ ����
		map.remove(5);
		System.out.println(map); 
		
		// ���� ��絥���� ����
		map.clear();
		System.out.println(map.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}// main
}
