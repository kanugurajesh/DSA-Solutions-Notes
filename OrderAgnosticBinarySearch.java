class OrderAgnosticBinarySearch {

  public static int orderAgnosticBinarySearch(int[] nums, int target) {
    
    int start = 0;
    int end = nums.length - 1;

    boolean isAsc = nums[start] < nums[end];
 
    while (start <= end) {
      int mid = start + (end - start)/2;
      if (nums[mid] == target) {
        return mid;
      } else if (nums[mid] < target) {
        if (isAsc) start = mid + 1;
        else end = mid - 1;
      } else {
        if (isAsc) end = mid - 1;
        else start = mid + 1
      }
    }
    return -1;
  }
  
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    int target = 3,
    System.out.println(orderAgnosticBinarySearch(arr, target));
  }
}
