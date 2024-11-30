class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String s1, String s2) {
        int[] chars = new int[26];
        
        for (char c : s1.toCharArray()) chars[c-'a']++;
        for (char c : s2.toCharArray()) chars[c-'a']--;
        for (int freq : chars) if (freq != 0) return false;
        return true;
    }
}