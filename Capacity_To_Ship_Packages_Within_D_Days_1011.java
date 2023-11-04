/* A conveyor belt has packages that must be shipped from one port to another within days days.
The ith package on the conveyor belt has a weight of weights[i]. Each day, we load the ship with packages on the conveyor belt (in the order given by weights). We may not load more weight than the maximum weight capacity of the ship.
Return the least weight capacity of the ship that will result in all the packages on the conveyor belt being shipped within days days.

Example 1:

Input: weights = [1,2,3,4,5,6,7,8,9,10], days = 5
Output: 15
Explanation: A ship capacity of 15 is the minimum to ship all the packages in 5 days like this:
1st day: 1, 2, 3, 4, 5
2nd day: 6, 7
3rd day: 8
4th day: 9
5th day: 10

Note that the cargo must be shipped in the order given, so using a ship of capacity 14 and splitting the packages into parts like (2, 3, 4, 5), (1, 6, 7), (8), (9), (10) is not allowed.
*/

# Brute Force Approach

class Solution {

    // finding the number of days a ship will take to transport with limit cap
    public int findDays(int[] weights, int cap, int length) {
        int days = 1;
        int load = 0;
        for(int i=0;i<length;i++) {
            if(load + weights[i] > cap) {
                days = days + 1;
                load = weights[i];
            } else {
                load += weights[i];
            }
        }
        return days;
    }

    // finding the minimum capacity and maximum capacity
    public int[] findMax(int[] nums, int length) {
        int sum = nums[0];
        int elem0 = nums[0];
        for (int i = 1; i < length; i++) {
            if (nums[i] > elem0) {
                elem0 = nums[i];
            }
            sum += nums[i];
        }

        // Create an array and populate it with 'sum' and 'elem0'
        int[] result = new int[] {elem0, sum };
        return result;
    }


    public int shipWithinDays(int[] weights, int days) {
        int length = weights.length;
        int[] data = findMax(weights,length);
        int low = data[0];
        int high = data[1];
        
        // looping through an array to find the least day
        for(int i=low;i<=high;i++) {
            if(findDays(weights,i,length)<=days) {
                return i;
            }
        }
        
        return 1;
    }
}

# Optimal Approach

