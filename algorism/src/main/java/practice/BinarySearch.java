package practice;

import java.util.Arrays;

public class BinarySearch {

    //1 ,6 , 128 ,531 ,692
    public boolean binarySearch(int[] intArray,int target) {
        Arrays.sort(intArray);

        return search(intArray,target);

    }

    private boolean search(int[] intArray,int target) {
        int mid = intArray.length / 2;

        //탈출 조건
        if(intArray[mid] == target)
            return true;

        if(intArray.length == 1) {
            return false;
        }

        int[] newArray;
        if(intArray[mid] > target) {
            newArray = Arrays.copyOfRange(intArray, 0, mid);
        } else {
            newArray = Arrays.copyOfRange(intArray, mid + 1, intArray.length);
        }
        return search(newArray,target);
    }
}
