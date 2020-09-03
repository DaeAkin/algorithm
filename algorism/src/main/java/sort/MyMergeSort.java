package sort;

import static org.hamcrest.CoreMatchers.instanceOf;

import org.junit.Test;

public class MyMergeSort {
	
	public static void MergeSort(int[] arr) {
		// 새로운 배열방을 원래배열만큼 생성.
		int[] tmp = new int[arr.length];
		System.out.println("--- init MergeSort() ---");
		MergeSort(0,arr.length-1,tmp,arr);
	}
	
	public static void MergeSort(int start,int end,int[] tmp,int[] arr) {
		//0~반 반~끝 자르고 이어붙이기.
		System.out.println(" --- MergeSort() ---");
		System.out.println("start : " + start + " // end : " + end);
		if(start<end) {
		int mid = (start+end) / 2;
			
			MergeSort(start, mid, tmp, arr);
			MergeSort(mid+1, end, tmp, arr);
			Merge(start,mid, end, tmp, arr);
			
		
		}
	}
	
	// 합치기
	public static void Merge(int start,int mid,int end,int[] tmp,int[] arr) {
		System.out.println(" --- Merge() ---");
		int cnt=1;
		
		cnt++;
		
		for(int i= start; i<=end; i++) {
			tmp[i] = arr[i];
//			System.out.println("arr["+i+"] :" + arr[i]);
		}
		int part1 = start;
		int part2 = mid+1;
		int index = start;
		
		while(part1 <= mid && part2 <=end) {
			if(tmp[part1] <= tmp[part2]) {
//				System.out.println(tmp[part1]);
				arr[index] = tmp[part1];
				part1++;
			} else {
				arr[index] = tmp[part2];
				part2++;
			}
			
			
			index++;
		}
		 for(int i=index; i<=mid-part1; i++) {
			 	System.out.println("여기 테스트?");
			 arr[index+i] = tmp[part1+1];
		 }
	}
	
	private static void printArr(int[] arr) {
		for (int i : arr) {
			System.out.print(i +",");
		}
		System.out.println();
	}

public static class MyMergeSortTest {
	
	@Test
	public void MergeSortTest() {
		int[] arr = {8,7, 6,5,4,3,2,1};
		
		printArr(arr);
		MergeSort(arr);
		printArr(arr);
	}
	
}



}




