class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int length = nums.length;
        int currentSum = 0;

        // Calculate the sum of the first k elements
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }

        double maxSum = currentSum;

        // Slide the window from the start of the array to the end
        for (int i = k; i < length; i++) {
            currentSum = currentSum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, currentSum);
        }

        // Return the maximum average
        return maxSum / k;
    }
}
