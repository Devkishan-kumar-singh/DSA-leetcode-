class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max = Integer.MIN_VALUE, j;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            j = i;
            for ( min = Integer.MAX_VALUE ; j < nums.length; j++) {
                if (nums[j] < min) {
                    min = nums[j];
                }
            }
            if ((max-min) <= k) {
                return i;
            }

        }
        return -1;
    }
}
