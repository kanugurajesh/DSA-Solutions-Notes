public class MatrixSimilarity {

    public static void main(String args[]) {

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] arr1 = {
                {1, 2, 1, 2},
                {5, 5, 5, 5},
                {6, 3, 6, 3}
        };

        int[][] arr2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

         System.out.println(matrixoperation(arr2, 4));
    }

    static void leftshift(int[] arr, int length) {
        int temp=arr[0];
        int j = 1;
        while (j<length) {
            arr[j-1] = arr[j];
            j++;
        }
        arr[length-1] = temp;
    }

    static void rightshift(int[] arr, int length) {
        int temp = arr[length-1];
        int j = length - 1;
        while (j>0) {
            arr[j] = arr[j-1];
            j--;
        }
        arr[0] = temp;
    }

    static boolean compare(int[][] matrix1, int[][] matrix2) {

        int rows = matrix1.length;
        int cols = matrix1[0].length;

        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                if (matrix1[i][j] != matrix2[i][j]) return false;
            }
        }

        return true;

    }

    static boolean matrixoperation(int[][] matrix, int k) {

        int[][] copy = new int[matrix.length][];
        for (int i = 0; i < matrix.length; i++) {
            copy[i] = matrix[i].clone();
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int rotate = k%cols;

        for(int i=0;i<rows;i++) {
            if (i%2==0) {
                for(int j=0;j<rotate;j++) {
                    leftshift(matrix[i], cols);
                };
            }
            else {
                for(int j=0;j<rotate;j++) {
                    rightshift(matrix[i], cols);
                };
            }
        }
        return compare(copy, matrix);
    }
}
