import java.util.Arrays;

public class bubbleSortRecursion {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        bubbleSortR(arr, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    static void bubbleRow(int[] arr, int start, int end) {
        if (start == end) return;
        if (arr[start] > arr[start+1]) swap(arr, start, start+1);
        bubbleRow(arr, start+1, end);
    }

    static void bubbleSortR(int[] arr, int length) {
        if (length == 0) return;
        bubbleRow(arr, 0, length);
        bubbleSortR(arr, length-1);
    }

}
