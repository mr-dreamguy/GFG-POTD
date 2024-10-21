class Solution {

    public static int countgroup(int arr[]) {
        int xor = 0;
        
        for (int num : arr) xor ^= num;
        
        return xor == 0 ? (1 << (arr.length-1)) - 1 : 0;
    }
}