class Solution {
    public int longestConsecutive(int[] arr) {
        if (arr.length == 0) return 0;
        
        HashSet<Integer> numSet = new HashSet<>();
        int longestStreak = 0;
        
        for (int num : arr) {
            numSet.add(num);
        }
        
        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;
    
                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }
 
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        
        return longestStreak;
    }
}