public class BinarySearch {

    public static int binarySearch(int[] array, int target){
        int start = 0;
        int end = array.length - 1;
        while (start<=end) {
            int mid = start + (end - start) / 2;
            if (target < array[mid]) end = mid - 1;
            else if (target > array[mid]) start = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static int ceiling(int[] array, int target){

        // if the target is the greatest number in the array
        if (target > arr[arr.length - 1]) {
          return -1;
        }
      
        int start = 0;
        int end = array.length - 1;
        while (start<=end) {
            int mid = start + (end - start) / 2;
            if (target < array[mid]) end = mid - 1;
            else if (target > array[mid]) start = mid + 1;
            else return mid;
        }
        return start;
    }

    public static int floor(int[] array, int target){

        // if the target is the smallest number in the array
        if (target < arr[0]) {
          return -1;
        }
      
        int start = 0;
        int end = array.length - 1;
        while (start<=end) {
            int mid = start + (end - start) / 2;
            if (target < array[mid]) end = mid - 1;
            else if (target > array[mid]) start = mid + 1;
            else return mid;
        }
        return end;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,8,9,10};
        System.out.println(binarySearch(array,7));
        System.out.println(ceiling(array,7));
        System.out.println(floor(array,7));
    }
}
