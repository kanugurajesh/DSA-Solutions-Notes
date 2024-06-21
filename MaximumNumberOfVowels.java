// The below code passes 102/106 test cases becauses it gives time limit exceeded

class Solution {

public int countVowels(String s) {
    Set<Character> vowels = new HashSet<>();
    vowels.add('a');
    vowels.add('e');
    vowels.add('i');
    vowels.add('o');
    vowels.add('u');
    int count = 0;
    for (char a : s.toCharArray()) {
        if (vowels.contains(a)) {
            count++;
        }
    }
    return count;
}

    public int maxVowels(String s, int k) {

        int length = s.length();
        if (length < k) return -1;
        int max = 0;
        String temp = s.substring(0,k);
        max = countVowels(temp);

        for(int i=0;i<length-k;i++) {
            temp = temp.substring(1) + s.charAt(k+i);
            max = Math.max(max, countVowels(temp));
        }

        return max;

    }
}

// The below code used sliding window algorithm and passes all the test cases

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        
        int length = s.length();
        if (length < k) return -1;

        int max = 0, currentCount = 0;
        
        // Count vowels in the first window of size k
        for (int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i))) {
                currentCount++;
            }
        }
        max = currentCount;

        // Slide the window across the string
        for (int i = k; i < length; i++) {
            // Remove the influence of the character going out of the window
            if (vowels.contains(s.charAt(i - k))) {
                currentCount--;
            }
            // Add the influence of the character coming into the window
            if (vowels.contains(s.charAt(i))) {
                currentCount++;
            }
            max = Math.max(max, currentCount);
        }
      
        return max;
    }
}
