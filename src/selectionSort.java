//import java.util.Arrays;
//
//public class selectionSort {
//
//    public static void main(String[] args) {
//        int[] arr = {121, 134, 34};
//        selectionSort(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//
//    static void selectionSort(int[] arr) {
//        int length = arr.length;
//        for(int i=0;i<length;i++) {
//            int maxElem = arr[i];
//            for(int j=i;j<length-i;j++) {
//                if (arr[j] > maxElem) maxElem = arr[j];
//            }
//            int temp = arr[length-i-1];
//            arr[length-i-1] = maxElem;
//            arr[i] = temp;
//        }
//    }
//}

import java.util.Arrays;

public class selectionSort {

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            // Find the index of the minimum element in the unsorted part
            int minIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
