import java.util.Arrays;

public class SearchRowColMatrix {

    public static void main(String[] args) {

        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };

        System.out.println(Arrays.toString(Search(arr, 37)));

    }

    public static int[] Search(int[][] array, int target) {

        int row = 0;
        int col = array[0].length - 1;

        while (row < array.length && col>= 0) {
            if (array[row][col] == target) return new int[] {row, col};
            if (array[row][col] < target) row++;
            else col--;
        }

        return new int[] {-1, -1};

    }

}
