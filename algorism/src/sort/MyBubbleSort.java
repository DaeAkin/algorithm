package sort;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class MyBubbleSort {
	
	public static void BubbleSort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length -1 -i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	
	
	public static class MyBubbleSortTest {
		
		@Test
		public void BubbleSortTest() {
			int[] arr = {6,1,2,4,3,5};
			MyBubbleSort.printArr(arr);
			MyBubbleSort.BubbleSort(arr);
			System.out.println();
			MyBubbleSort.printArr(arr);
			int[] resultarr = {1,2,3,4,5,6};
			
			assertThat(arr,is(resultarr));
		}
	}
}
