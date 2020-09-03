package baekjoon;

import java.util.Scanner;

public class Problem1924 {
	
	//1, 3, 5, 7, 8, 10, 12월은 31일까지
	//, 4, 6, 9, 11월은 30일까지, 2월은 28일까지 있다.
	public static void main(String[] args) {
		String[] Days = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		Scanner s = new Scanner(System.in);
		
		String[] input = s.nextLine().split(" ");
		
		int mon = Integer.parseInt(input[0]);
		int day = Integer.parseInt(input[1]);
		int result = 0;
		
		for(int i=1; i<=mon; i++) {
			// 만약 1월 25일이면 25만 계산 .
			if(mon == i) {
				result += day;
				break;
			}
			if(String.valueOf(i).matches("1|3|5|7|8|10|12")) {
				result += 31;
			} else if(String.valueOf(i).matches("4|6|9|11")) {
				result += 30;
			} else {
				result += 28;
			}
		}
		
		
		System.out.println(Days[(result%Days.length)]);
		
		
	}
}
