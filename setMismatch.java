class Solution {
    public int[] findErrorNums(int[] nums) {

        int length = nums.length;
        int[] newNums = new int[length];
        int[] two = {-1, -1};

        for(int i=0;i<length;i++) {
            newNums[nums[i]-1]++;
        }

        for(int i=0;i<length;i++) {
            if (newNums[i] > 1) two[0] = i+1;
            else if (newNums[i] == 0) two[1] = i+1;
        }

        return two;

    }
}
