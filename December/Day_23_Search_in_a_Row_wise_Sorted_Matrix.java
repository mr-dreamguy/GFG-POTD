class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchRowMatrix(int[][] mat, int x) {
        int n=mat.length, m=mat[0].length;
        for(int i=0;i<n;i++){
            if(mat[i][0]<=x && x<=mat[i][m-1]){
                if(found(mat[i],m,x)) return true;
            }
        }
        return false;
    }
    boolean found(int a[],int n,int x){
        int l=0, r=n-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(a[mid]==x)   return true;
            else if(a[mid]<x)   l=mid+1;
            else                r=mid-1;
        }
        return false;
    }
}
