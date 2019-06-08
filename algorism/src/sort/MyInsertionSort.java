package sort;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

// 삽입 정렬
public class MyInsertionSort {
	
	public static void InsertionSort(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			int target = arr[i];
			int j = i-1;
			while(j>=0 && target<arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1]= target; 
				
		}
	}
	
	
	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	
	public static class MyInsertSortTest {
		
		@Test
		public void InsertSort() {
			int[] arr = {6,1,2,4,3,5};
			MyInsertionSort.printArr(arr);
			MyInsertionSort.InsertionSort(arr);;
			System.out.println();
			MyInsertionSort.printArr(arr);
			int[] resultarr = {1,2,3,4,5,6};
			
			assertThat(arr,is(resultarr));
		}
	}
	
	

}
