// Array approach

class Solution {

    public int findDuplicate(int[] nums) {

        int length = nums.length;
        int[] data = new int[length];

        for(int i=0;i<length;i++) {
            data[nums[i]-1]++;
        }

        for(int i=0;i<length;i++) {
            if (data[i]>1) return i+1;
        }

        return -1;

    }
}

// Cyclic Sort Approach

class Solution {

    public int findDuplicate(int[] nums) {

      int i = 0;
      
      while (i < nums.length) {
        if (arr[i] != i+1) {
          int correct = arr[i] - 1;
          if (arr[i] != arr[correct]) {
            swap(arr, i, correct);
          } else {
            return arr[i];
          }
        } else {
          i++;
        }
      }
        return -1;
    }

  static void swap(int[] arr, int first, int second) {
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
  }
  
}
