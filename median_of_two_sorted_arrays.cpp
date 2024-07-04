/*
  Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
  
  The overall run time complexity should be O(log (m+n)).
  
  Example 1:
  
  Input: nums1 = [1,3], nums2 = [2]
  Output: 2.00000
  Explanation: merged array = [1,2,3] and median is 2.
  Example 2:
  
  Input: nums1 = [1,2], nums2 = [3,4]
  Output: 2.50000
  Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
*/

// optimal approach nlogn

class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {

        int length = nums1.size() + nums2.size();
        vector<int> data(length);
        merge(nums1.begin(),nums1.end(),nums2.begin(),nums2.end(),data.begin());

        if(length%2==0) {
            return static_cast<double>(data[length/2] + data[length/2 - 1])/2;
        }
        
        return data[length/2];
    }   
};
