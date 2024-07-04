import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void cyclicsort(int[] arr) {
        int length = arr.length;
        for(int i=0;i<length;i++) {
            while (i != arr[i]-1) {
                swap(arr, arr[i] - 1, i);
            }
        }
    }

}
