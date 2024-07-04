public class RecursionSorted {

    static boolean sorted(int[] arr, int i, int length) {

        if (length < 0) return false;
        if (length == 0) return true;
        if (i == arr.length - 1) return true;

        return ( arr[i] < arr[i+1] ) && sorted(arr, i+1, length);

    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 2};
        System.out.println(sorted(arr, 0, arr.length));
    }
}
