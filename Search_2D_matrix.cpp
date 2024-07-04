/*

  Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:
  
  Integers in each row are sorted in ascending from left to right.
  Integers in each column are sorted in ascending from top to bottom.

  Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
  Output: true
  
*/

class Solution {
public:

    bool binarySearch(vector<int>& matrix, int target) {

        int low = 0;
        int high = matrix.size() - 1;

        while(low<=high) {
            int mid = low + (high - low)/2;
            if(matrix[mid] == target) return true;
            else if(matrix[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return false;

    }

    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int length = matrix.size();
        for(int i=0;i<length;i++) {
            if(binarySearch(matrix[i],target)) {
                return true;
            }
        }
        return false;
    }
};
