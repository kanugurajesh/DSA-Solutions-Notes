class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {

        int length1 = str1.length();
        int length2 = str2.length();

        int left = 0;
        int right = 0;

        if (length2 > length1) return false;

        while (left < length1 && right < length2) {

            char nextElem = str1.charAt(left);
            if (nextElem == 'z') nextElem = 'a';
            else ++nextElem;

            if (str1.charAt(left) == str2.charAt(right) || nextElem == str2.charAt(right)) {
                left++;
                right++;
            } else {
                left++;
            }
        }
      
        return right == length2;
      
    }
}
