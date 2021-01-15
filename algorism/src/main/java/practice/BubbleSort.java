package practice;

import java.util.Arrays;

public class BubbleSort {

    private static int[] sort(int[] intArray) {

        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray.length - 1; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    int temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                }
            }
        }
        return intArray;
    }

     public static void main(String[] args) {
          int[] array = new int[]{64,12,6,32,102,1,2};

          BubbleSort.sort(array);

         for (int j : array) {
             System.out.println(j);
         }
      }
}
