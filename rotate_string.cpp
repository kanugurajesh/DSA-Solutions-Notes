/*
  Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
  
  A shift on s consists of moving the leftmost character of s to the rightmost position.
  
  For example, if s = "abcde", then it will be "bcdea" after one shift.
   
  
  Example 1:
  
  Input: s = "abcde", goal = "cdeab"
  Output: true
  Example 2:
  
  Input: s = "abcde", goal = "abced"
  Output: false
*/

class Solution {
public:
    bool rotateString(string s, string goal) {

        if(s==goal) {
            return true;
        }

        int length = s.length();

        for(int i=1;i<length;i++) {
            string data = s.substr(i,length-i);
            for(int j=0;j<i;j++) {
                data += s[j];
            }
            if(data == goal) {
                return true;
            }
        }

        return false;
    }
};
