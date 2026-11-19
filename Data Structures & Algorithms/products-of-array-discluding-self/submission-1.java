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
        } else if (zeroCount == 1) {
            int[] output = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    output[i] = nonZeroProduct;
                    return output;
                }
            }
        } else {
            int[] output = new int[nums.length];
            for (int i = 0; i < nums.length; i++) {
                output[i] = nonZeroProduct / nums[i];
            }
            return output;
        }
        return new int[]{0};
    }
}  
