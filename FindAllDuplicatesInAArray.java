class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> data = new ArrayList<>();
        int length = nums.length;
        int[] numbers = new int[length];

        for(int i=0;i<length;i++) {
            numbers[nums[i]-1]++;
        }

        for(int i=0;i<length;i++) {
            if (numbers[i] > 1) {
                data.add(i+1);
            }
        }

        return data;

    }
}
