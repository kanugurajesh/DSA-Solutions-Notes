public class RotatedBinarySearch {

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(findPivot(arr)); // Test for finding the pivot
        System.out.println(search(arr, 0)); // Test for searching a target
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) end = mid - 1;
            else if (target > arr[mid]) start = mid + 1;
            else return mid;
        }
        return -1;
    }

    static int search(int[] nums, int target) {

        int pivot = findPivot(nums);

        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        if (nums[pivot] == target) return pivot;

        if (target >= nums[0]) return binarySearch(nums, target, 0, pivot - 1);

        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) return mid;
            if (mid > start && arr[mid] < arr[mid - 1]) return mid - 1;
            if (arr[mid] >= arr[start]) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }

    // finding pivot with duplicates

    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) return mid;
            if (mid > start && arr[mid] < arr[mid - 1]) return mid - 1;

            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // check if start is pivot
                if (arr[start] > arr[start + 1]) return start;
                start++;

                // check whether end is pivot
                if (arr[end] < arr[end - 1]) return end - 1;
            }

        }
        return -1;
    }

}
