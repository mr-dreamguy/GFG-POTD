class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int s1 = a.length;
        int s2 = b.length;
        int i = 0;
        int j = 0;
        int ans = -1;
        while ( i < s1 && j < s2 ) {
            if ( a[ i ] < b[ j ] )
                ans = a[i++];
            else
                ans = b[j++];
            if ( --k == 0 ) return ans;
        }
        while ( i++ < s1 ) {
            if ( --k == 0 ) return a[ i - 1 ];
        }
        while ( j++ < s2 ) {
            if ( --k == 0 ) return b[ j - 1 ];
        }
        return 0;
    }
}