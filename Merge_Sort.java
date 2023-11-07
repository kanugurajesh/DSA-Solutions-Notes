/*
MergeSort algorithm
*/

public class MergeSort {

    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        // Creating a temporary array to store the sorted array
        int[] temp = new int[nums.length];
        // Calling the mergeSort function
        mergeSort(nums,0,nums.length-1,temp);
        // Printing the sorted array
        for(int i=0;i<nums.length;++i) {
            System.out.print(nums[i]+" ");
        }
    }

    // Merge Sort function
    public static void mergeSort(int[] nums,int l,int r,int[] temp) {
        if(l<r) {
            // Finding the middle element
            int mid = (l+r)/2;
            // Calling the mergeSort function for the left half
            mergeSort(nums,l,mid,temp);
            // Calling the mergeSort function for the right half
            mergeSort(nums,mid+1,r,temp);
            // Calling the merge function to merge the two halves
            merge(nums,l,mid,r,temp);
        }
    }

    public static void merge(int[] nums,int l,int mid,int r,int[] temp) {
        int i = l,j = mid+1,k = l;
        // Merging the two halves
        while (i<=mid && j<=r) {
            if(nums[i]<=nums[j]) {
                temp[k++] = nums[i++];
            }else{
                temp[k++] = nums[j++];
            }
        }

        // Adding the remaining elements
        while (i<=mid) {
            temp[k++] = nums[i++];
        }

        // Adding the remaining elements
        while (j<=r) {
            temp[k++] = nums[j++];
        }

        // Copying the elements from temp to nums
        for(i=l;i<=r;++i) {
            nums[i] = temp[i];
        }
    }
}
