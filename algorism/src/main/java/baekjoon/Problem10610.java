package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.text.AbstractDocument.BranchElement;

public class Problem10610 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int strL = str.length();
	
		int numberCount[] = new int[10];
		
		int result = 0;
		
		for(int i=0; i<strL; i++) {
			
			int target = Integer.parseInt(str.substring(i, i+1));

			numberCount[target] += 1;
			
			result += target;
			
		}

		// String에 0이 없으면 30의 배수가 될 수 없음.
		// 각자리의 숫자의 합이 3의 배수가 아니라면 30의 배수가 될 수 없음.
		if(!str.contains("0") || result % 3 != 0) {
			System.out.println("-1");
		} else {
			StringBuilder sb = new StringBuilder();
			for(int i=9; i>=0; i--) {
				while(numberCount[i] >0) {
					sb.append(i);
					numberCount[i]--;
				}
			}
			System.out.println(sb.toString());
		}
		
		
		
		
	
		
	}
	

}
