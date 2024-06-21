class Solution {
    
    public int binarySearch(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if ((end - start) == 1) {
                if (nums[start] > nums[end]) return start;
                return end;
            }
            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) return mid;
            else if (nums[mid] < nums[mid-1]) end = mid - 1;
            else start = mid + 1;
        }
        return -1;
    }

    // Optimal solution

    public int optimalSearch(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start)/2;
            if (arr[mid] > arr[mid + 1]) end = mid;
            else start = mid + 1;
        }
        // you return start or end because at the end both of them are same
        return start;
    }

    public int peakIndexInMountainArray(int[] arr) {
        return binarySearch(arr);
    }
}
