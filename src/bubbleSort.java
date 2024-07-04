import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {7, 6, 5, 4, 3};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            boolean swapped = false; // Reset swapped to false at the beginning of each pass
            for (int j = 1; j < length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // If no swaps were made, the array is sorted
        }
    }
}
