class Solution {
    public int maxAscendingSum(int[] nums) {
        int currsum = nums[0];
        int maxsum = nums[0];
        int n = nums.length;
        for(int i=1;i<n;i++){
            int j = i-1;
            if(nums[j]<nums[i]){
                currsum = currsum + nums[i];
            }
            else{
                maxsum = Math.max(currsum , maxsum);
                currsum = nums[i];
            }
        }
        maxsum = Math.max(currsum , maxsum);
        return maxsum;
    }
}