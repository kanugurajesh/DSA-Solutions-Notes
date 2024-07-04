public class PrefixSum {
    public static int[] computePrefixSum(int[] arr) {
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        
        return prefix;
    }
    
    public static int rangeSum(int[] prefix, int left, int right) {
        if (left == 0) {
            return prefix[right];
        } else {
            return prefix[right] - prefix[left - 1];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] prefix = computePrefixSum(arr);
        
        // Example of using the prefix array to get range sums
        int sum1 = rangeSum(prefix, 1, 3); // Sum of elements from index 1 to 3
        int sum2 = rangeSum(prefix, 0, 4); // Sum of elements from index 0 to 4
        
        System.out.println("Prefix Array: " + java.util.Arrays.toString(prefix));
        System.out.println("Sum of elements from index 1 to 3: " + sum1);
        System.out.println("Sum of elements from index 0 to 4: " + sum2);
    }
}
