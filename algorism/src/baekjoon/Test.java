package baekjoon;

import datastructure.MyArrayList;

import java.util.LinkedList;

public class Test {
	
	public static void main(String[] args) {


		LinkedList<Integer> linkedList = new LinkedList<>();

		int n = 5;
		int[] lost ={2,4};
		int [] reserve = {1,3,5};

		for(int i=0; i<n; i++) {
			linkedList.add(1);
		}

		for(int i=0; i<lost.length; i++) {

			linkedList.set(lost[i]-1,0);
		}

		for(int i=0; i<lost.length; i++) {
			Integer integer = linkedList.get(i);

			if(integer == 0) {
				int target = i+1;

				for(int j=0; j<reserve.length; j++) {
					if(reserve[j] == target-1) {

					} else if(reserve[j] == target+1) {

					}
				}
			}
		}

		int result = 0;

		for(int i=0; i<lost.length; i++) {
			linkedList.get(i);

			if(i != 0) {
				result++;
			}
		}



		System.out.println(linkedList.toString());


//		String s = "try hello world";
//
//
//		StringBuilder sb = new StringBuilder();
//		char[] chars = s.toCharArray();
////		Character.toString(chars1[0]);
//
//		int cursor = 1;
//		for(int i=0; i<chars.length; i++) {
//
//			if(chars[i] == ' ') {
//				sb.append(chars[i]);
//				cursor = 1;
//				continue;
//			}
//			//홀수면 대문자
//			if(cursor % 2 != 0 ) {
//				sb.append(Character.toUpperCase(chars[i]));
//			} else  {
//				// 소문자
//				sb.append(Character.toLowerCase(chars[i]));
//			}
//
//			cursor++;
//		}
//
//		System.out.println(sb.toString());
	}

}
