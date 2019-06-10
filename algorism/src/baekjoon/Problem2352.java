package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2352 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		br.readLine();
		
		String[] str = br.readLine().split(" ");
		
		int[] num = new int[str.length];
		
		for(int i =0; i<str.length; i++) {
			num[i] = Integer.parseInt(str[i]);
		}
		System.out.println(lis(num));
		
	
		
	}
	
	public static int lis(int[] arr) {
		int d[] = new int[arr.length];
		d[0] = 1;
		for(int i=1; i<arr.length; i++) {
			int max = 0;
			for(int j=0; j<i; j++) {
				if(arr[j]<arr[i] && d[j] > max) {
					max = d[j];
				}
			}
			d[i] = max+1;
		}
		
		int max = d[0];
		for(int i=1; i<arr.length; i++) {
			if(d[i] >max) max = d[i];
		}
		return max;
		
	}

}
