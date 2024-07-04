public class smallestNumber {

    public static int nextGreatestNumber(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            if (target <= nums[mid]) end = mid - 1;
            else if (target > nums[mid]) start = mid + 1;
        }

        return start;
    }

    public static void main(String[] args) {
        int[] nums = {0, 4, 5};
        int target = 1;
        System.out.println(nextGreatestNumber(nums,target));
    }
}
