class Solution {
    public int averageValue(int[] nums) {
        int avg = 1;
        int sum = 0;
        int count = 0;
        for(int i = 0 ;i<nums.length;i++){
            if(nums[i]%2 == 0){
                if(nums[i]%3 == 0){
                    sum = sum + nums[i];
                    count++;
                }
            }
        }
        if(count != 0){
            avg = sum/count;
            return avg;
        }
        return 0;
    }
}