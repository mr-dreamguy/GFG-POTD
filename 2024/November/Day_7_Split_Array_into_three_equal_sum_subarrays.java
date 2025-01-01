public List<Integer> findSplit(int[] arr) {
        int sum = 0;
        for (int num : arr) sum += num;
        if (sum%3 != 0) return Arrays.asList(-1, -1);
        
        int res = sum/3;
        int index = -1;
        sum = 0;
        
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            
            if (sum == res) {
                if (index != -1) return Arrays.asList(index, i);
                index = i;
                sum = 0;
            }
        }
        
        return Arrays.asList(-1, -1);
    }
}