/* You are given two positive integer arrays spells and potions, of length n and m respectively, where spells[i] represents the strength of the ith spell and potions[j] represents the strength of the jth potion.
You are also given an integer success. A spell and potion pair is considered successful if the product of their strengths is at least success.
Return an integer array pairs of length n where pairs[i] is the number of potions that will form a successful pair with the ith spell.
 
Example 1:

Input: spells = [5,1,3], potions = [1,2,3,4,5], success = 7
Output: [4,0,3]
Explanation:
- 0th spell: 5 * [1,2,3,4,5] = [5,10,15,20,25]. 4 pairs are successful.
- 1st spell: 1 * [1,2,3,4,5] = [1,2,3,4,5]. 0 pairs are successful.
- 2nd spell: 3 * [1,2,3,4,5] = [3,6,9,12,15]. 3 pairs are successful.
Thus, [4,0,3] is returned.
Example 2:

Input: spells = [3,1,2], potions = [8,5,8], success = 16
Output: [2,0,2]
Explanation:
- 0th spell: 3 * [8,5,8] = [24,15,24]. 2 pairs are successful.
- 1st spell: 1 * [8,5,8] = [8,5,8]. 0 pairs are successful. 
- 2nd spell: 2 * [8,5,8] = [16,10,16]. 2 pairs are successful. 
Thus, [2,0,2] is returned. */

class Solution {
    
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

    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        potions = mergeSort(potions);
        
        int lengthSpells = spells.length;
        int lengthPotions = potions.length;

        int[] result = new int[lengthSpells];

        for(int i=0;i<lengthSpells;i++) {
            result[i] = array(potions, success, spells[i]);
        }
        
        return refine(result, lengthPotions);

    }
}
