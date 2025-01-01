class Solution {
    static ArrayList<Integer> modifyAndRearrangeArr(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > 0 && arr[i] == arr[i+1]) {
                arr[i] += arr[i+1];
                arr[i+1] = 0;
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int num : arr) {
            if (num != 0) list.add(num);
        }
        
        while (list.size() != arr.length) list.add(0);
        
        return list;
    }
}
