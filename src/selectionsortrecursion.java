import java.util.Arrays;

public class selectionsortrecursion {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        selectionSortRow(arr, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    static void selectionSortCol(int[] arr, int start, int end, int max) {
        if (start > end) {
            swap(arr, max, end);
            return;
        }

        if (arr[start] >= arr[max]) max = start;
        selectionSortCol(arr, start + 1, end, max);
    }

    static void selectionSortRow(int[] arr, int length) {
        if (length == 0) return;

        selectionSortCol(arr, 0, length, length-1);
        selectionSortRow(arr, length - 1);
    }
}
