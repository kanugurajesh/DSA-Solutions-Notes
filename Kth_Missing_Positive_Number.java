/*
Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
Return the kth positive integer that is missing from this array.

Example 1:

Input: arr = [2,3,4,7,11], k = 5
Output: 9
Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.
*/

// BRUTE FORCE APPROACH

class Solution {
    public int findKthPositive(int[] arr, int k) {
        int length = arr.length;
        for(int i=0;i<length;i++) {
            if(arr[i] <= k) {
                k++;
            }else{
                break;
            }
        }
        return k;
    }
}
