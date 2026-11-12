class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer>[] count = new List[nums.length + 1];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int freq = entry.getValue();
            if (count[freq] == null) {
                count[freq] = new ArrayList<>();
            }
            count[freq].add(entry.getKey());
        }
        int[] response = new int[k];
        int t = k;
        for (int i = nums.length; i > 0 && t > 0; i--) {
            if (count[i] != null) {
                List<Integer> a = count[i];
                for (int j = 0; j < a.size(); j++) {
                    response[--t] = a.get(j);
                }
            }
        }
        return response;
    }
}
