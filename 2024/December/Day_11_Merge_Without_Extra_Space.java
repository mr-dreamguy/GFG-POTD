class Solution {
    public void mergeArrays(int a[], int b[]) {
        int n=a.length, m=b.length, i=n-1, j=0;
        while(i>=0 && j<m){
            if(a[i]>b[j]){
                swap(a,b,i,j);
                i--;
                j++;
            }else   break;
        }
        
        Arrays.sort(a);
        Arrays.sort(b);
    }
    void swap(int a[],int b[],int i,int j){
        int temp = a[i];
        a[i]=b[j];
        b[j]=temp;
    }
}