/*
  Given two strings s and t, return true if t is an anagram of s, and false otherwise.
  
  An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
  
   
  
  Example 1:
  
  Input: s = "anagram", t = "nagaram"
  Output: true
  Example 2:
  
  Input: s = "rat", t = "car"
  Output: false
*/

class Solution {
public:
    bool isAnagram(string s, string t) {

        int length = s.length();
        int length2 = t.length();

        if(length != length2) {
            return false;
        }

        unordered_map<char,int> myHash;
        unordered_map<char,int> myHash2;

        for(int i=0;i<length;i++) {
            myHash[s[i]]++;
            myHash2[t[i]]++;
        }

        for(int i=0;i<length;i++) {
            if(myHash[s[i]] != myHash2[s[i]]) {
                return false;
            }
        }

        return true;
    }
};
