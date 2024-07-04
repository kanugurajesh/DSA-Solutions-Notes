import java.util.List;
import java.util.ArrayList;

public class RecursionSorted {

    static boolean sorted(int[] arr, int i, int length) {
        if (length < 0) return false;
        if (length == 0) return true;
        if (i == arr.length - 1) return true;
        return ( arr[i] < arr[i+1] ) && sorted(arr, i+1, length);
    }

    static int search(int[] arr, int target, int s, int e) {

        if (s > e) return -1;
        int m = s + (e - s)/2;
        if (arr[m] == target) return m;

        if (arr[s] <= arr[m]) {
            if (target >= arr[s] && target <= arr[m]) return search(arr, target, s, m-1);
            else return search(arr, target, m+1, e);
        }

        if (target >= arr[m] && target <= arr[e]) return search(arr, target, m+1, e);

        return search(arr, target, s, m-1);
    }

    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) return list;
        if (arr[index] == target) list.add(index);
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }

    static int findIndex (int[] arr, int target, int index) {
        if (index == arr.length) return -1;
        if (arr[index] == target) return index;
        else return findIndex(arr, target, index+1);
    }

    static List<Integer> findAllIndex(int[] arr, int target, List<Integer> indexes, int index) {
        if (index == arr.length) return indexes;
        if (arr[index] == target) indexes.add(index);
        return findAllIndex(arr, target, indexes, index+1);

    }

    static int lastIndex(int[] arr, int target, int index) {
        if (index == -1) return -1;
        if (arr[index] == target) return index;
        else return lastIndex(arr, target, index-1);
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        System.out.println(search(arr,2, 0, arr.length));
    }

}
