package practice;

public class MergeSort {

    public void sort(int[] array) {
        int[] newArray = new int[array.length];
        mergeSort(array,0, array.length-1,newArray);
    }

    // 10,15,2,3,50
    private void mergeSort(int[] array, int start, int end,int[] newArray) {


        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(array, start, mid,newArray);
            mergeSort(array, mid + 1, end,newArray);
            merge(array,start,mid,end,newArray);
        }
    }

    private void merge(int[] array, int start, int mid, int end, int[] newArray) {


        for(int i = start; i<=end; i++) {
            newArray[i] = array[i];
        }
        int part1 = start;
        int part2 = mid + 1;
        int index = start;
        while(part1 <= mid && part2 <= end) {
            if (newArray[part1] < newArray[part2]) {
                array[index] = newArray[part1];
                part1++;
            } else {
                array[index] = newArray[part2];
                part2++;
            }
            index++;
        }

        for(int i=0; i<=mid-part1; i++) {
            array[index + i] = newArray[part1 + 1];
        }

    }

    private static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i +",");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int[] arr = {1,6,4,3,2,8};

        printArr(arr);
        mergeSort.sort(arr);
        printArr(arr);
    }
}
