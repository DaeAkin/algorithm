package baekjoon;

import java.util.Scanner;

public class Problem10809 {

	
	public static void main(String[] args) {
		// a = 97 , z = 122

		Scanner s = new Scanner(System.in);
		
		String input = s.nextLine();

		char[] inputChar = input.toCharArray();
		
		int cursor = 0;
		
		Integer[] resultInteger = new Integer[26];
				
		for (char c : inputChar) {
			//a,b,c.....z까지 검사
			for(int i = 97; i<=122; i++) {
				if(i == (int)c) {
					// 같은 알파벳 유효성 검사.
					if(resultInteger[i-97] == null) {
					 resultInteger[i-97] = cursor;
					 cursor++;
					break;
					} else {
						cursor++;
					}
					
				}
				
			}
			
		}
		
		for (Integer i : resultInteger) {
			// 없는 알파벳이면 null임 출력때 -1 처
			if(i == null) {
				i = -1;
			}
			System.out.print(i +" ");
		}
		

	}
	
	
}
