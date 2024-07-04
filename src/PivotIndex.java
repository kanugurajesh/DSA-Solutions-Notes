public class PivotIndex {
    public static int[] prefixSum(int[] nums, int length) {

        int[] prefix = new int[length];
        prefix[0] = nums[0];

        for(int i=1;i<length;i++) {
            prefix[i] = nums[i] + prefix[i-1];
        }

        return prefix;
    }

    public static int pivotIndex(int[] nums) {

        int length = nums.length;
        int[] prefix = prefixSum(nums,length);
        if((prefix[length-1] - prefix[0]) == 0) return 0;

        for (int i=1;i<length;i++) {
            if (prefix[i-1] == (prefix[length-1] - prefix[i])) return i;
        }
        return -1;
    }

    public static void display(int[] nums, int length) {
        for (int i=0;i<length;i++) {
            System.out.println(nums[i]);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int length = nums.length;
        int[] prefix = prefixSum(nums, length);
        display(prefix, length);
        System.out.println(pivotIndex(nums));
    }

}

