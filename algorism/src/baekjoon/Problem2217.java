package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Problem2217 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		List<Integer> kList = new ArrayList<>();
		
		for(int i=0; i<N; i++) {
			kList.add(Integer.parseInt(br.readLine())); 
		}
		
		// 내림차순으로 정렬.
		Collections.sort(kList, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		});
		

		List<Integer> resultList = new ArrayList<>();
		// 내림차순으로 정렬해서 제일 작은 요소 * 해당 요소까지의 index를 곱하면 된다.
		for(int i=1; i<N+1; i++) {
			 resultList.add(kList.get(i-1) * i);
		}
		
		Collections.sort(resultList, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		});
		
	
		
		System.out.println(resultList.get(0));
		
	}
	

}
