import java.util.*;

class Solution {

    static List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> numbers = new ArrayList<>();
        int length = nums.length;

        cyclicsort(nums, length);

        for(int i=1;i<length;i++) {
                if (i != nums[i]) {
                    if (length == 2) numbers.add(2);
                };
        }

        return numbers;

    }

    static void cyclicsort(int[] nums, int length) {
        int i = 0;
        while (i < length) {
            int correct = nums[i];
            if (nums[i] < length && nums[i] != nums[correct]) swap(nums, i, correct);
            else i++;
        }

    }

    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


    public static void main(String[] args) {
//        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        int[] arr = {1, 1};
        System.out.println(findDisappearedNumbers(arr));
    }

}