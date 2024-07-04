// 1283. Find the Smallest Divisor Given a Threshold

// Brute force approach

class Solution {
    public int smallestDivisor(int[] nums,int threshold) {
        int count = 1;
        while(true) {
            int sum = 0;
            for(int num: nums) {
                sum += Math.ceil((double) num / (double) count)
            }
            if(sum == threshold) {
                return count;
            }
            count++;
        }
        return count;
    }
}

// Optimal approach
class Solution {

    // function to find the largest element in an array
    public int largest(int[] nums) {
        int elem = nums[0];
        for(int num : nums) {
            if(num > elem) {
                elem = num;
            }
        }
        return elem;
    }

    // function to find the sum of ceil values of the elements till n
    public int sumIndex(int[] nums,int n) {
        int sum = 0;
        for(int num : nums) {
            sum += (int) Math.ceil((double)num/(double)n);
        }
        return sum;
    }

    public int smallestDivisor(int[] nums, int threshold) {

        int minimum = 1;
        int maximum = largest(nums);

        while(minimum <= maximum) {

            int mid = ( minimum + maximum )/2;

            if(sumIndex(nums,mid) <= threshold) {
                maximum = mid - 1;
            } else {
                minimum = mid + 1;
            }
        }

        return minimum;
    }
}
