/*
  You're given two sorted arrays 'arr1' and 'arr2' of size 'n' and 'm'respectively and an element 'k'
  Find the element that would be at the 'kth' position of the combined sorted array.
  Position 'k' is given according to 1 - based indexing, but arrays 'arr1' and 'arr2' are using 0 - based indexing.
  For example:
  Input: 'arr1' = [2, 3, 45], 'arr2' = [4, 6, 7, 8] and 'k' = 4
  Output: 6
  Explanation: The merged array will be [2, 3, 4, 6, 7, 8, 45]. The element at position '4' of this array is 6. Hence we return 6.
*/

// approach-1

#include<bits/stdc++.h>

int kthElement(vector<int> &arr1, vector<int>& arr2, int n, int m, int k){

    vector<int> data(n+m);

    merge(arr1.begin(),arr1.end(),arr2.begin(),arr2.end(),data.begin());

    return data[k-1];

}

// approach-2

int kthElement(vector<int> &arr1, vector<int>& arr2, int n, int m, int k){
    
    int left = 0;
    int right = 0;
    int count = 0;

    while(left < n && right < m) {
        if(arr1[left] <= arr2[right]) {
            if(count == (k-1)) return arr1[left];
            left++;
        }else {
            if(count == (k-1)) return arr2[right];
            right++;
        }
        count++;
    }

    while(left < n) {
        if(count == (k-1)) return arr1[left];
        left++;
        count++;
    }

    while(right < m) {
        if(count == (k-1)) return arr2[right];
        right++;
        count++;
    }

    return -1;
}
