class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Integer.compare(a[1],b[1]));
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int value : nums)
        {
            map.put(value, map.getOrDefault(value, 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet())
        {
            int[] arr = new int[]{entry.getKey(), entry.getValue()};
            pq.add(arr);
            if(pq.size() > k)
                pq.poll();
        }

        int[] result = new int[k];
        int index = 0;
        while(!pq.isEmpty())
        {   
            result[index++] = pq.poll()[0];
        }
        return result;
    }
}
