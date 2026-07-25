class KthLargest {

    private PriorityQueue<Integer> q;
    private int k;

    public KthLargest(int k, int[] nums) {
        q = new PriorityQueue<>();
        this.k = k;

        for (int a : nums) {
            q.add(a);
            if (q.size() > k) {
                q.poll();
            }
        }
    }
    
    public int add(int val) {
        q.add(val);
        if (q.size() > k) {
            q.poll();
        }
        return q.peek();
    }
}
