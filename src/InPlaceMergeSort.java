import java.util.Arrays;

public class InPlaceMergeSort {

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            // Recursively sort the first and second halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            mergeInPlace(arr, left, mid, right);
        }
    }

    static void mergeInPlace(int[] arr, int left, int mid, int right) {
        int start = left;
        int midStart = mid + 1;

        // While there are elements in the left and right runs
        while (start <= mid && midStart <= right) {
            if (arr[start] <= arr[midStart]) {
                start++;
            } else {
                int value = arr[midStart];
                int index = midStart;

                // Shift all the elements between start and midStart right by one
                while (index != start) {
                    arr[index] = arr[index - 1];
                    index--;
                }
                arr[start] = value;

                // Update pointers
                start++;
                mid++;
                midStart++;
            }
        }
    }
}
