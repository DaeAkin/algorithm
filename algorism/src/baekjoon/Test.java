package baekjoon;

import datastructure.MyArrayList;

public class Test {
	
	public static void main(String[] args) {
		MyArrayList<Integer> list = new MyArrayList<>();
		
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
	
		
		list.remove(3);
		
		System.out.println("1의 위치는? :" +list.indexOf(1));
		
		list.set(0, 10);
		
		System.out.println(list.toString());
		
	}
}
