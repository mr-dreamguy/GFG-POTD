class Solution {
    int search(int[] arr, int key) {
        int n=arr.length, l=0, r=n-1;
        
        while(l<=r){
            int mid = l+(r-l)/2;
            if(arr[mid]==key)   return mid;
            
            else if(arr[mid]<arr[r]){
                if(arr[mid]<=key && key<=arr[r])    l=mid+1;
                else                                r=mid-1;
            }else{
                if(arr[l]<=key && key<=arr[mid])    r=mid-1;
                else                                l=mid+1;
            }
        }
        
        return -1;
    }
}