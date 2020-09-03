package baekjoon;

import java.util.Scanner;

public class Problem10871 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] num1 = scanner.nextLine().split(" ");
		String[] num2 = scanner.nextLine().split(" ");
		
		
		
		
		for(int i=0; i<num2.length; i++) {
			
			if(Integer.parseInt(num2[i])<Integer.parseInt(num1[1])) {
				
				System.out.print(Integer.parseInt(num2[i]) +" ");
			}
		}
		
	}
}
