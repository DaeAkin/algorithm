package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Problem1931 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 회의의 개수
		int N = Integer.parseInt(br.readLine());
		
		ArrayList<Conf> confList = new ArrayList<>();

		for(int i=0; i<N; i++) {
			String[] split = br.readLine().split(" ");
			int start = Integer.parseInt(split[0]);
			int end = Integer.parseInt(split[1]);
			confList.add(new Conf(start, end));	
		}
		//Conf 클래스의 Compareto 메소드에 의해 정렬이 시작됨.
		Collections.sort(confList);
		
		int result = 0;
		int PreEnd = 0;
		// 회의 계산
		for (Conf conf : confList) {
			// 마지막 회의 시간보다 해당 회의 시작시간이 크면
			if(PreEnd <= conf.getStart()) {
				result++;
				PreEnd = conf.getEnd();
			}
		}
		
		System.out.println(result);
			
	}
	static class Conf implements Comparable<Conf>{
		
		private int start;
		private int end;
		
		public Conf(int start, int end) {
			this.start = start;
			this.end = end;
		}
		
		public int getStart() {
			return start;
		}
		
		public int getEnd() {
			return end;
		}
		
		//음수 또는 0이면 객체의 자리가 그대로 유지되며, 양수인 경우에는 두 객체의 자리가 바뀐다
		@Override
		public int compareTo(Conf conf) {
			// TODO Auto-generated method stub
			if(this.end < conf.getEnd()) {
				return -1;
			} else if(this.end == conf.getEnd()) {
				if(this.start > conf.getStart()) {
					return 1;
				} else {
					return -1;
				}			
			} else {
				return 1;
			}
			
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "start : " + getStart() +"//" + "end : " + getEnd();
		}
		
	
		
		
	}

}
