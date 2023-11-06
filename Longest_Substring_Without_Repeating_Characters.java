# Intuition
<!-- Describe your first thoughts on how to solve this problem. -->

# Approach
<!-- Describe your approach to solving the problem. -->

# Complexity
- Time complexity:
<!-- Add your time complexity here, e.g. $$O(n)$$ -->

- Space complexity:
<!-- Add your space complexity here, e.g. $$O(n)$$ -->

# Code
  
```bash
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        # Create a set to keep track of unique characters
        unique_chars = set()
        n = len(s)  # Length of the string
        left = 0    # Left pointer of the sliding window
        max_length = 0    # Maximum length of substring without repeating characters
        
        # Iterate through the string with the right pointer
        for right in range(n):
            # Check if the current character is already in the set
            while s[right] in unique_chars:
                # If it is, remove the leftmost character from the set
                unique_chars.remove(s[left])
                left += 1
            
            # Add the current character to the set
            unique_chars.add(s[right])
            
            # Update the maximum length if necessary
            max_length = max(max_length, right - left + 1)
        
        return max_length
```
