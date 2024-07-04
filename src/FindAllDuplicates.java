import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicates {

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        missingNumberInArray(nums);
    }

    public static void missingNumberInArray(int[] arr) {

        cyclicSort(arr, arr.length);
        List<Integer> data = new ArrayList<>();

        for(int i=0;i< arr.length;i++) {
            if (i+1 != arr[i]) data.add(arr[i]);
        }

        System.out.println(data);

    }

    public static void cyclicSort(int[] arr, int length) {
        int i = 0;
        while (i < length) {
            int correct = arr[i] - 1;
            if (arr[i] < arr.length && arr[i] != correct) {
                swap(arr, i, correct);
            } else i++;
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
