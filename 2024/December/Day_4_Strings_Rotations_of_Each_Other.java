class Solution {
    public static boolean areRotations(String s1, String s2) {
        s1 = s1.concat(s1);
        int i1 = 0;
        int i2 = 0;
        while (i1 < s1.length()) {
            if (i2 == s2.length()) return true;
            if (s1.charAt(i1) == s2.charAt(i2)) i2++;
            i1++;
        }
        return false;
    }
}