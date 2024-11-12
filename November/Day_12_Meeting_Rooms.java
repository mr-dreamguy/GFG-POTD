class Solution {
    static boolean canAttend(int[][] arr) {
        Arrays.sort(arr, (x, y) -> x[0]-y[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i][0] < arr[i-1][1]) return false;
        }
        return true;
    }
}