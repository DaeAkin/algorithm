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
		
		boolean isThereZero = false;
		ArrayList<Integer> N = new ArrayList<>();
		
		
		for(int i=0; i<str.length(); i++) {
			N.add(Integer.parseInt(str.split("")[i]));
		}
		int result = 0;
		
		for (Integer integer : N) {
			if(integer == 0)
				isThereZero = true;
			result += integer;
		}
		Collections.sort(N , new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
			
		});
		
		if(!isThereZero || result % 3 != 0) {
			System.out.println("-1");
		} else {
			StringBuilder sb = new StringBuilder();
			for (Integer integer : N) {
				sb.append(integer);
			}
			System.out.println(sb.toString());
		}
		
		
		
		
	
		
	}
	

}
