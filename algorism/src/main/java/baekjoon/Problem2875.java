package baekjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Problem2875 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");
		//여학생
		int N = Integer.parseInt(str[0]);
		//남학생
		int M = Integer.parseInt(str[1]);
		// 인턴쉽 참가 학생 수
		int K = Integer.parseInt(str[2]);
		// 여학생 팀
		int NTeam = 0;
		//남학생 팀 
		int MTeam = 0;
		// 8 5 3 : 3팀 
		//8 5 1 : 4팀
		//18 4 1 : 4팀
		//18 3 5 : 3팀
		int[] result = new int[3];
		
		
		// 여학생에서만 인턴쉽 인원 빼기
		NTeam = (N-K) / 2;
		MTeam = M;
		result[0] = NTeam >= MTeam ? MTeam : NTeam;

		// 남학생에서만 인턴쉽 인원 빼기
		NTeam = (N) / 2;
		MTeam = M-K;
		
		result[1] = NTeam >= MTeam ? MTeam : NTeam;
		
		int aa = 0;
		// 둘다 인턴쉽 인원 빼기
		for(int i=0; i<=K; i++) {
			NTeam = (N-i)/ 2;
			MTeam = (M-K+i);
			
			int temp = NTeam >= MTeam ? MTeam : NTeam;
		
			aa = aa >= temp ? aa : temp;
			result[2] = aa;
		}
		
		
		Arrays.sort(result);
		
		System.out.println(result[2]);

		
	}
	


}
