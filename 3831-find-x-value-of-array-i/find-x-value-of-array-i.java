class Solution {
    public long[] resultArray(int[] nums, int k) {
        int n = nums.length;
        long[] ans = new long[k];
        long[] count = new long[k];

        for (int i = 0; i < n; i++) {
            long[] nextCount = new long[k];
            int val = nums[i] % k;
            nextCount[val]++;

            for (int j = 0; j < k; j++) {
                if (count[j] > 0) {
                    nextCount[(j * val) % k] += count[j];
                }
            }

            for (int j = 0; j < k; j++) {
                ans[j] += nextCount[j];
            }

            count = nextCount;
        }

        return ans;
    }
}