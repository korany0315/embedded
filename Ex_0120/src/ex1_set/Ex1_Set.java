package ex1_set;

import java.util.HashSet;

public class Ex1_Set {
	public static void main(String[] args) {
		
		/*
		 	�ڹ��� collection
		 	�ټ��� �����͸� ���� ȿ�������� ó���� �� �ִ� ǥ��ȭ�� ����� �����ϴ� Ŭ������ ����
		 	
		 	collection Ŭ������ ����
		 		1) List<> (ArrayList)
		 		2) Set<> ( HashSet, TreeSet)
		 		3) Map<> (HashMap)
		 */
		
		// Set : Ư�� �ڵ忡�� �ߺ��� ���� ����� �־�� �ȵ� �� ���
		HashSet<Integer> set1 = new HashSet<Integer>(); // HashSet�̶�� �ڽİ�ü ����
		set1.add(20);
		set1.add(30);
		set1.add(10);
		set1.add(100);
		set1.add(30); // 30�� �̹� add�� ���̱� ������ ����  add���� �ʴ´�
		
		// Set�� �迭�� ���� index�� �����ϴ°��� �Ұ�
		// ��� for���� ��� set�� �������ִ� ��� ������ ��°�� ����ϴ°��� ����
		System.out.println("set1 : "+set1);
		
		System.out.println("set1.size() : " + set1.size()); //size() = length()
		
		/*
		 *  set �� index������ ������ �Ұ��� �ϱ� ������
		 *  0,1,2���� index�� �����ϰ�ʹٸ� �迭�� ������ ��
		 *  ����� �迭�� ���ؼ� index�� ����
		 */
		
		// set -> �迭�� �ٲٱ�
		Integer[]arr = set1.toArray( new Integer[0]) ;
		
		System.out.println("arr.length : " + arr.length);
		System.out.println("arr[1] : " + arr[1]);
		
		set1.clear(); //set�� ���� ��� �޸𸮸� ����
		System.out.println("set1.clear �� ���� set1 : " + set1);
		
		
		
		
		
		
		
		
	}//main

}
