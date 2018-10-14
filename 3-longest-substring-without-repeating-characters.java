/**
 * 3.longest substring without repeating characters.
 * 
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * 
 * 
 * dec: Given a string, find the length of the longest substring without
 * repeating characters.
 * 
 * 
 * 
 * example: Input: "abcabcbb" Output: 3 Explanation: The answer is "abc", with
 * the length of 3.
 * 
 * 
 * Input: "bbbbb" Output: 1 Explanation: The answer is "b", with the length of
 * 1.
 * 
 * 
 * Input: "pwwkew" Output: 3 Explanation: The answer is "wke", with the length
 * of 3. Note that the answer must be a substring, "pwke" is a subsequence and
 * not a substring.
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;

        int maxLen = 0;
        Set<Character> hashSet = new HashSet<>();
        while (start < s.length() && end < s.length()) {
            if (!hashSet.contains(s.charAt(end))) {
                hashSet.add(s.charAt(end++));
                maxLen = Math.max(end - start, maxLen);
            } else {
                hashSet.remove(s.charAt(start++));
            }
        }
        return maxLen;
    }
}