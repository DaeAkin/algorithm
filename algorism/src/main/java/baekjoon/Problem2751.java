package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Problem2751 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 몇줄 선택
		int row = Integer.parseInt(br.readLine());

		// 배열 선언 
		int[] data = new int[row];
		
		// 입력 받는 for 문
		for (int i = 0; i < row; i++) {
			data[i] = Integer.parseInt(br.readLine());
		}
	
		// 오름차순 Comparator 객체 샐성
		Ascending as = new Ascending();
		// primitive type을 wrapper 클래스로 변경해주는 작업
		List<Integer> datas = Arrays.stream(data).boxed().collect(Collectors.toList());
		// 정렬 
		Collections.sort(datas, as);
	
		//출력하기
		for(int i=0; i< row; i++) {
			System.out.println(datas.get(i));
		}
	
	}

}

class Ascending implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}
}

