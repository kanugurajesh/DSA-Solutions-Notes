class Solution {
    public String countAndSay(int n) {        
        if (n == 1) {
            return "1";
        }

        String result = "1";

        // Generate the sequence up to the nth element
        for (int i = 2; i <= n; i++) {
            StringBuilder nextSequence = new StringBuilder();
            int length = result.length();
            int count = 1;

            // Iterate through the current sequence
            for (int j = 1; j < length; j++) {
                if (result.charAt(j) == result.charAt(j - 1)) {
                    count++;
                } else {
                    nextSequence.append(count).append(result.charAt(j - 1));
                    count = 1;
                }
            }

            // Append the last counted segment
            nextSequence.append(count).append(result.charAt(length - 1));

            result = nextSequence.toString();
        }

        return result;
    }
}
