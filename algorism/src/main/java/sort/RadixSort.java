package sort;

public class RadixSort {

    public RadixSort(int[] arr) {
        int[] temp = new int[arr.length];
        sort(arr,temp,max(arr));
    }

    private void sort(int[] arr, int[] temp,int j) {
        int a = 1;
        for(int i = 0; i<j; a *=10,i++) {
            temp[arr[i]%10]++;
        }
    }

    private int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i])
                max = arr[i];
        }
        return max;
    }

    public static void main(String[] args) {

    }
}
