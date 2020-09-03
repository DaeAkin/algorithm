package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1120 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		String str1 = str.split(" ")[0];
		String str2 = str.split(" ")[1];
	
		int max_same = 0;
		for(int i=0; i<str2.length()-str1.length()+1; i++){
		   String temp_B = str2.substring(i, i+str1.length());
		   int same = 0;
		   for(int j=0; j<temp_B.length(); j++){
		       if(str1.charAt(j) == temp_B.charAt(j))
		           ++same;
		  }
		   if(same > max_same)
		       max_same = same;
		}
		System.out.println(str1.length() - max_same);
		
		
		
	}

}
