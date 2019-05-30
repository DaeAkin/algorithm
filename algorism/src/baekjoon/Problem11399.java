package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem11399 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String N = br.readLine();
		String Pn = br.readLine();
		String Ps[] = Pn.split(" ");
		int P[] = new int[Integer.parseInt(N)];
		int result = 0;
		
		for(int i=0; i<Integer.parseInt(N); i++) {
			P[i] = Integer.parseInt(Ps[i]);
		}
		
		Arrays.sort(P);
		
		for(int i=0; i<Integer.parseInt(N); i++) {
			result += P[i] + factorial(i, P);
		}	
		System.out.println(result);
		
	}
	static int factorial(int target, int[] P) {
		int result = 0;
		for(int i=0; i<target; i++) {
			result += P[i];
		}
		return result;
	}
	


}
