class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zeroCount = 0;
        int nonZeroProduct = 1;
        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            } else {
                nonZeroProduct *= num;
            }
        }
        if (zeroCount >= 2) {
            return new int[nums.length];
        }
        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (zeroCount > 0) {
                output[i] = (nums[i] == 0) ? nonZeroProduct : 0;
            } else {
                output[i] = nonZeroProduct / nums[i];
            }
        }
        return output;
    }
}  
