class Solution {
	void pushZerosToEnd(int arr[], int n) {
	    int i = 0;
	    int j = 0;
	    while (i < n && j < n) {
    	    while (i < n && arr[i] != 0) i++;
    	    if (j < i) j = i+1;
    	    while(j < n && arr[j] == 0) j++;
    	    if (i == n || j == n) return ;
    	    arr[i] = arr[j];
    	    arr[j] = 0;
	    }
	}
}