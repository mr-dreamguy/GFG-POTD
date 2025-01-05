class Solution {
    int countPairs(int arr[], int target) {
        int count = 0, start = 0, end = arr.length-1;
        
        Arrays.sort(arr);
        while (start < end) {
            if (arr[start] + arr[end] >= target) end--;
            else {
                count += end-start;
                start++;
            }
        }
        
        return count;
    }
}