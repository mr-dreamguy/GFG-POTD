class Solution {
    public int minIncrements(int[] arr) {
        // Code here
        int count = 0;
        Arrays.sort(arr);
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] <= arr[i-1])
            {
                int val = arr[i-1] - arr[i] + 1;
                count += val;
                arr[i] += val;
            }
        }
        return count;
    }
}