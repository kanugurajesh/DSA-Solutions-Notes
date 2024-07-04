import java.util.Arrays;


public class binarySearch {

    public static int array(int[] potions, long success, int num) {

        int start = 0;
        int end = potions.length - 1;
        int result = -1;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if ((long) potions[mid] * num >= success) {
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return result;
    }

    public static int[] refine(int[] result, int portionLength) {
        for(int i=0;i<result.length;i++) {
            if (result[i] != -1) result[i] = portionLength - result[i];
            else result[i] = 0;
        }
        return result;
    }

    public static int[] mergeSort(int[] portions) {
        if (portions.length <= 1) {
            return portions;
        }

        int mid = portions.length / 2;

        int[] left = Arrays.copyOfRange(portions, 0, mid);
        int[] right = Arrays.copyOfRange(portions, mid, portions.length);

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                merged[k] = left[i];
                i++;
            } else {
                merged[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            merged[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            merged[k] = right[j];
            j++;
            k++;
        }

        return merged;
    }

    public static void display(int[] nums) {
        for (int s : nums) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {

        int[] spells = {3, 1, 2};
        int[] potions = {8, 5, 8};
        long success = 16;

        potions = mergeSort(potions);

        int lengthSpells = spells.length;
        int lengthPotions = potions.length;

        int[] result = new int[lengthSpells];

        for(int i=0;i<lengthSpells;i++) {
            result[i] = array(potions, success, spells[i]);
        }

        refine(result, lengthPotions);

        display(result);

    }
}
