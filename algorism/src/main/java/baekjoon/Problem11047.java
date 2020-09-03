package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Problem11047 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strs = br.readLine();
		
		String N = strs.split(" ")[0];
		int K = Integer.parseInt(strs.split(" ")[1]);
		
		int value[] = new int[Integer.parseInt(N)];
		
		List<Integer> reValue = new ArrayList<>();
		

		for(int i=0; i<value.length; i++) {
			value[i] = Integer.parseInt(br.readLine());
		}
		
		
		
		// 해당값 보다 큰 배열들이 있으면 날려버리고.
		for(int i=0; i<value.length; i++) {
			if( K >= value[i])
				reValue.add(value[i]);
		}
		
		// 내림차순 정렬
		reValue.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
			
		});
		
		for (Integer integer : reValue) {
			System.out.println(integer);
		}

		// K을 value[] 값들 중에 큰 값부터 나눠서 최대 몫을 구하고, 나머지를 반환 받는다.
		int result= 0;
		for (Integer values : reValue) {
			if(K == 0) break;
			result += cal(values, K);
//			System.out.println("Result : " + result);
			K -= cal(values, K) * values;
//			System.out.println("K :" + K);
			
		}
		
		System.out.println(result);
		
		
		
	}
	
	static int cal(int value,int K) {
//		System.out.println("cal 의 K :" + K);
//		System.out.println("cal 의 value : " + value);
		return K/value ;
	}
}
