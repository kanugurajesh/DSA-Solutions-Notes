/*
You are given two positive integers n and k. A factor of an integer n is defined as an integer i where n % i == 0.
Consider a list of all factors of n sorted in ascending order, return the kth factor in this list or return -1 if n has less than k factors.

Example 1:
Input: n = 12, k = 3
Output: 3
Explanation: Factors list is [1, 2, 3, 4, 6, 12], the 3rd factor is 3.
Example 2:

Input: n = 7, k = 2
Output: 7
Explanation: Factors list is [1, 7], the 2nd factor is 7.
*/

class Solution {
    public int kthFactor(int n, int k) {

        List<Integer> list = new ArrayList<>();
        list.add(1);

        for(int i=2;i<=n/2;i++) {
            if (n%i == 0) list.add(i);
        }

        list.add(n);

        int size = list.size();

        if (size>=k) return list.get(k-1);

        return -1;

    }
}
