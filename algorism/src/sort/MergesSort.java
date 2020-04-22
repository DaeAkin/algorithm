package sort;

public class MergesSort {

    public MergesSort(int[] arr) {
        int[] temp = new int[arr.length];
    }

    private static void MergeSort(int start, int[] temp, int end, int[] arr) {

        if (start < end) {
            int mid = (start + end) / 2;
            MergeSort(start, temp, mid, arr);
            MergeSort(mid + 1, temp, end, arr);
            Merge(start, temp, end, mid, arr);
        }
    }

    private static void Merge(int start, int[] temp, int end, int mid, int[] arr) {
        for(int i = start; i<=end; i++) {
            temp[i] = arr[i];
        }


    }

}
