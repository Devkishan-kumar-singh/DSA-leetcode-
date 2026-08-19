class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int[] ans = new int[2];
        int start = 0;
        int end = numbers.length-1;
        while(start<end){
            int sum = numbers[start] + numbers[end];

            if(sum==target){
                ans[0]=start+1;
                ans[1] = end+1;
                return ans;
            }
            else if(sum>target){
                end = end-1;
            }
            else if(sum<target){
                start = start +1;
            }
        }
        return ans;  
         /* program never come at this point because question says return array so we have to return one array.*/
    }
}