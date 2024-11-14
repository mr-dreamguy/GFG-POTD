class Solution {
    // Non-static method, so you need to call it on an instance of the class
    public void nearlySorted(int[] arr, int k) {
        int num = arr.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i <= k && i < num; i++) {
            pq.add(arr[i]);
        }

        int id = 0;
        for (int i = k + 1; i < num; i++) {
            arr[id++] =
                pq.poll();
            pq.add(arr[i]);
        }

        while (!pq.isEmpty()) {
            arr[id++] = pq.poll();
        }
    }
}
