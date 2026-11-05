class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            indexMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (indexMap.containsKey(diff)) {
                int index = indexMap.get(diff);
                if (index == i) {
                    continue;
                }
                return new int[]{i, index};
            }
        }

        return new int[]{0};
    }
}
