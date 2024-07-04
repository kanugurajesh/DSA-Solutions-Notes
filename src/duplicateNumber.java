import java.util.Arrays;

public class duplicateNumber {

    public static void main(String[] args) {
//        int[] nums = {1, 3, 4, 2, 2};
        int[] nums = {3, 1, 3, 4, 2};
        int[] data = findDuplicate(nums);
        for(int i=0;i<nums.length;i++) {
            if (data[i] > 1) {
                System.out.println(i+1);
            };
        }
    }

    static int[] findDuplicate(int[] nums) {

        int length = nums.length;
        int[] data = new int[length];

        for (int i=0;i<length;i++) {
            data[nums[i]-1]++;
        }

        return data;
    }

}
