public class patterns {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 4};
        System.out.println(uniqueNumber(arr));
    }

    static void pattern2(int n) {

        /*
            *
            * *
            * * *
            * * * *
            * * * * *
            * * * *
            * * *
            * *
            *
         */

        for(int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int i=1;i<=n;i++) {
            for (int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            for (int j=i;j>1;j--) {
                System.out.print(j);
            }
            for (int j=1;j<=i;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static int binaryRecursion(int[] arr, int target, int start, int end) {

        int mid = start + (end - start)/2;
        if (start > end) return -1;
        if (arr[mid] == target) return mid;

        if (arr[mid] < target) start = mid + 1;
        else end = mid - 1;

        return binaryRecursion(arr, target, start, end);

    }

    static int uniqueNumber(int[] arr) {
        int unique = 0;

        for(int n: arr) {
            unique ^= n;
        }

        return unique;

    }

}
