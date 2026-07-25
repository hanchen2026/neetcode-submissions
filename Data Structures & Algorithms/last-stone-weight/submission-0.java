class Solution {
    public int lastStoneWeight(int[] stones) {
        //reverse order for max heap; ordinarilly min-heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        //insert into max heap, O(N) time.
        for(int i = 0; i < stones.length; i++) {
            maxHeap.add(stones[i]);
        }

        while(maxHeap.size() > 1) {
            int stone1 = maxHeap.poll();
            int stone2 = maxHeap.poll();

            if (stone1 != stone2) maxHeap.add(Math.abs(stone1-stone2));
        }

        return (maxHeap.size() == 0) ? 0 : maxHeap.poll();
    }
}
