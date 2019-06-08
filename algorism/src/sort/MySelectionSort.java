package sort;

import static org.hamcrest.CoreMatchers.instanceOf;

import org.junit.Test;

public class MySelectionSort {
	
	public static void SelectionSort(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			
			int min = 0;
			int least = 0;
			for(int j=i; j<arr.length; j++) {
				// 최소 값 탐색
				min = arr[i];
				if(min> arr[j]) {
					min = arr[j];
					least = j;
				}
				
				if(min != arr[i]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
			
		}
	}
	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	
	@Test
	public void SelectionSortTest() {
		int[] arr = {6,1,2,4,3,5};
		printArr(arr);
		SelectionSort(arr);
		System.out.println();
		printArr(arr);
	}

}
